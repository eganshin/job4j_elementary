package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;

        float out = Converter.rubleToEuro(in);
        System.out.println(in + " rubles are " + out + " euro.");
        float expected = 2;
        boolean passed = expected == out;
        System.out.println(in + " rubles are 2. Test result : " + passed);

        out = Converter.rubleToDollar(in);
        System.out.println(in + " rubles are " + out + " dollar.");
        expected = 2.3333333f;
        passed = expected == out;
        System.out.println(in + " rubles are 2.3333333. Test result : " + passed);
    }
}