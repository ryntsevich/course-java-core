package com.rakovets.course.javabasics.practice.loops;

/**
 * Разработать программу для бухгалтерии.
 * Конвертировать числовую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
 * пробелом.
 * <p>
 * Например:
 * 1234567890 -> "1 234 567 890"
 *
 * @author Dmitry Rakovets
 */
class Task06 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        long amount = 1500;

        String amountWithAccountingFormat = convertToAccountingFormat(amount);
        System.out.printf("Result: %s", amountWithAccountingFormat);
    }

    /**
     * Конвертировать числовую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
     * пробелом.
     *
     * @param amount сумма
     * @return сумма в бухгалтерском формате
     */
    static String convertToAccountingFormat(long amount) {
        String result = "";
        if (amount == 0) {
            result = "0";
        } else {
            if (amount < 0) {
                amount *= -1;
                result += "-";
            }
            long tmpAmount = amount;
            int countNumber = 0;
            while (tmpAmount != 0) {
                tmpAmount /= 10;
                countNumber++;
            }
            for (int i = countNumber; i >= 1; i--) {
                if (i % 3 == 0 && countNumber != i) {
                    result += " ";
                }
                long number = amount / pow(10, i - 1) % 10;
                result = result + number;
            }
        }
        return result;
    }

    static long pow(long a, long b) {
        long tmpA = b == 0 ? 1 : a;
        for (long i = 1; i < b; i++) {
            tmpA *= a;
        }
        System.out.printf("pow(%d, %d) = %d\n", a, b, tmpA);
        return tmpA;
    }
}
