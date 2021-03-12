package com.rakovets.course.javabasics.practice.loops;

/**
 * Разработать программу для игрового движка.
 * Спрогнозировать какое количество HP будет у RaidBoss (RB), который имеет неограниченное количество HP и регенерацию,
 * которая пропорционально зависит от его текущего количества HP.
 *
 * @author Dmitry Rakovets
 */
class Task04 {
    private static final int ONE_HUNDRED_PERCENT = 100;

    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int healthPoints = 100;
        double regenerationPercentFromCurrentHealth = 5.0;
        int hoursAfterRespawn = 10;

        int featureHealthPoint = calculateHealthPointsByTime(healthPoints, regenerationPercentFromCurrentHealth, hoursAfterRespawn);
        System.out.printf("Result: %d", featureHealthPoint);
    }

    /**
     * Высчитывает количество HP у RaidBoss после возрождения.
     *
     * @param healthPoints                         количество HP Raid Boss после появления (respawn)
     * @param regenerationPercentFromCurrentHealth регенерация здоровья (процент / час)
     * @param hoursAfterRespawn                    время прошедшее после появления Raid Boss
     * @return количество HP
     */
    static int calculateHealthPointsByTime(int healthPoints, double regenerationPercentFromCurrentHealth, int hoursAfterRespawn) {
        double resultHealth = healthPoints;
        for (int i = 1; i <= hoursAfterRespawn; i++) {
            resultHealth += resultHealth * regenerationPercentFromCurrentHealth / ONE_HUNDRED_PERCENT;
        }
        return (int) resultHealth;
    }
}
