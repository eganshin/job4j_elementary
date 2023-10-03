package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2dot00() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when13to37then4dot47() {
        double expected = 4.47;
        Point a = new Point(1, 3);
        Point b = new Point(3, 7);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when19to99then8dot00() {
        double expected = 8;
        Point a = new Point(1, 9);
        Point b = new Point(9, 9);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when192to994then8dot24() {
        double expected = 8.24;
        Point a = new Point(1, 9, 2);
        Point b = new Point(9, 9, 4);
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}