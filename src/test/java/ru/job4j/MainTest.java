package ru.job4j;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void whenActionThenResult() {
        int excepted = 1;
        int result = 1;
        Assertions.assertThat(result).isEqualTo(excepted);
    }
}
