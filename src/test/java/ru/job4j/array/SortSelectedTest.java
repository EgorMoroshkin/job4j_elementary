package ru.job4j.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{9, 3, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{3, 6, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[]{32, 17, 23, 12, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{6, 12, 17, 23, 32};
        assertThat(result).containsExactly(expected);
    }
}