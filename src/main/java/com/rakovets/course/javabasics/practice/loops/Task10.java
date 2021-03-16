package com.rakovets.course.javabasics.practice.loops;

/**
 * Разработать программу для математического калькулятора, которая находит количество простых чисел в промежутке.
 *
 * <ul>
 *     <li>Число называется простым, если оно делится на цело (без остатка) ТОЛЬКО на 1 и на себя.</li>
 *     <li>1 не является простым числом</li>
 * </ul>
 * <p>
 * * Программа должна работать максимально эффективно, т.е. количество команд выполняемых CPU должно быть минимально
 * (тем самым уменьшится и время выполнения).
 *
 * @author Dmitry Rakovets
 */
class Task10 {
    private static final int ONE_NUMBER = 1;
    private static final int TWO_NUMBER = 2;
    private static final int ZERO_REMAINDER = 0;
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int startNumber = 0;
        int finishNumber = 9;

        int countPrimeNumber = countPrimeNumber(startNumber, finishNumber);
        System.out.printf("Result:\n%d", countPrimeNumber);
    }

    /**
     * Возвращает количество простых чисел в заданном промежутке.
     *
     * @param startNumber  начало промежутка (включая)
     * @param finishNumber конец промежутка (включая)
     * @return количество простых чисел
     */
    static int countPrimeNumber(int startNumber, int finishNumber) {
        int countPrimeNumbers = 0;
        for (int i = startNumber; i <= finishNumber; i++) {
            if (isPrime(i)) {
                countPrimeNumbers++;
            }
        }
        return countPrimeNumbers;
    }

    static boolean isPrime(int number) {
        boolean isPrimeNumber = true;
        if (number <= ONE_NUMBER) {
            isPrimeNumber = false;
        }
        double limit = Math.sqrt(number);
        for (int j = TWO_NUMBER; j <= limit; j++) {
            if (number % j == ZERO_REMAINDER) {
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }
}
