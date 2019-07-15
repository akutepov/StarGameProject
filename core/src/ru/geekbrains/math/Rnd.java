package ru.geekbrains.math;

import java.util.Random;

/**
 * Генератор случайных чисел
 */
public class Rnd {
    private static final Random random = new Random();

    /**
     * Сгенерировать случайное число
     * @param min минимальное значение случайного числа
     * @param max максимальное значение случайного числа
     * @return результат
     */
    public static float nextFloat(float min, float max) {
        return random.nextFloat() * (max - min) + min;
    }
}
