package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas3Then2() {
        int[] data = new int[]{5, 10, 3};
        int el = 3;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas9ThenMinus1() {
        int[] data = new int[]{7, 2, 5, 6, 3, 9};
        int el = 99;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}