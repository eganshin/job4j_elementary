package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To2Then10() {
        int first = 10;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To20Then20() {
        int first = 1;
        int second = 20;
        int result = Max.max(first, second);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int first = 5;
        int second = 5;
        int result = Max.max(first, second);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To3Then3() {
        int first = 2;
        int second = 1;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To4Then4() {
        int first = 1;
        int second = 2;
        int third = 4;
        int fourth = 3;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}