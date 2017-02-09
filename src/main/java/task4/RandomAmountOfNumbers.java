package task4;

import java.util.concurrent.ThreadLocalRandom;

public class RandomAmountOfNumbers {
    public static long createRandomNumber(int number) {
        //Class ThreadLocalRandom works with Java 7.0 and later
        return ThreadLocalRandom.current().nextLong(Math.round(Math.pow(10, number - 1)), Math.round(Math.pow(10, number)));

    }

}
