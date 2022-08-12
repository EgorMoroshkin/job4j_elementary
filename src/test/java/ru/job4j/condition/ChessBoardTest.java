package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ChessBoardTest {
    @Test
    public void whenX1Is0andY1Is0andX2Is7andY2Is7ThenWayIs7() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 7;
        int y2 = 7;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenX1Is1andY1Is1andX2Is3andY2Is3ThenWayIs2() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 3;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenX1Is6andY1Is6andX2Is3andY2Is3ThenWayIs3() {
        int x1 = 6;
        int y1 = 6;
        int x2 = 3;
        int y2 = 3;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenX1Is5andY1Is5andX2Is6andY2Is6ThenWayIs1() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 6;
        int y2 = 6;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenY1isMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = -1;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenX2isMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = -1;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenY2isMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = -1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenX1isGreater7ThenWayIs0() {
        int x1 = 10;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenY1isGreater7ThenWayIs0() {
        int x1 = 2;
        int y1 = 10;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenX2isGreater7ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 10;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenY2isGreater7ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 10;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}