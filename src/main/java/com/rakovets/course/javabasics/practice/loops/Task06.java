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
        long amount = -5960000000000L;

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
        String resultFormat = "";
        boolean isLessZero = amount < 0;
        if (isLessZero) {
            amount = Math.abs(amount);
        }
        if (amount == 0) {
            resultFormat = "0";
        }
        while (amount > 0) {
            resultFormat = (amount % 1000 == 0)
                    ? "000" + " " + resultFormat
                    : amount % 1000 + " " + resultFormat;
            amount = amount / 1000;
        }
        if (isLessZero) {
            resultFormat = "-" + resultFormat;
        }
        return resultFormat.trim();
    }
}
