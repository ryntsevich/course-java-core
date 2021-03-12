package com.rakovets.course.javabasics.practice.loops;

/**
 * Разработать программу для банка.
 *
 * @author Dmitry Rakovets
 */
class Task03 {
    private static final int ONE_HUNDRED_PERCENT = 100;
    private static final int ONE_HUNDRED_FOR_ROUND = 100;

    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        double depositAmount = 10000.0;
        double annualDepositPercent = 18.0;
        int depositTerm = 5;

        double totalDepositAmount = getTotalDepositAmount(depositAmount, annualDepositPercent, depositTerm);
        System.out.printf("Result: %f", totalDepositAmount);
    }

    /**
     * Рассчитывает прибыль, которую получит клиент по вкладу с ежегодным перерасчетом (сложный процент).
     *
     * @param depositAmount        сумма вклада
     * @param annualDepositPercent ежегодный процент вклада
     * @param depositTerm          продолжительность вклада (в годах)
     * @return прибыль (с точностью до 2 знаков после десятичного разделителя)
     */
    static double getTotalDepositAmount(double depositAmount, double annualDepositPercent, int depositTerm) {
        for (int i = 1; i <= depositTerm; i++) {
            depositAmount += depositAmount * annualDepositPercent / ONE_HUNDRED_PERCENT;
        }
        return (double) Math.round(depositAmount * ONE_HUNDRED_FOR_ROUND) / ONE_HUNDRED_FOR_ROUND;
    }
}
