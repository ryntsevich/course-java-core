package com.rakovets.course.javabasics.practice.loops;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

/**
 * Разработать программу для сети оптовых гипермаркетов.
 * Необходимо сформировать список цен для некоторого продукта.
 * <p>
 * Пример:
 * Список начинается с 10 единиц товара за 50 единиц денег, размерность списка 3, разница в количестве между соседними
 * значениями в списке 2 единицы товара. В итоге получим:
 * <p>
 * 10 - 50
 * 12 - 60
 * 14 - 70
 *
 * @author Dmitry Rakovets
 */
class Task08 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int startPriceAllItems = 100;
        int startNumberItems = 5;
        int differentialNumberItems = 5;
        int sizeTotalPrice = 20;

        String totalPriceList = generateTotalPriceList(startNumberItems, startPriceAllItems, differentialNumberItems, sizeTotalPrice);
        System.out.printf("Result:\n%s", totalPriceList);
    }

    /**
     * Генерирует список цен для продукта.
     *
     * @param startNumberItems        количество продуктов, с которых начинается список цен
     * @param startPriceAllItems      стоимость всех продуктов, с которых начинается список цен
     * @param differentialNumberItems разница в количестве продуктов между соседними значениями списка цен
     * @param sizeTotalPrice          размерность списка цен
     * @return price, где формат вывода одной записи '${numberItems} - ${cost}'. Для ${cost} использовать точность до
     * 2 знаков после вещественного разделителя:
     * <code>BigDecimal.valueOf(currentPriceAllItemsWithSell).setScale(2, RoundingMode.HALF_UP).doubleValue()</code>
     */
    static String generateTotalPriceList(int startNumberItems, double startPriceAllItems, int differentialNumberItems, int sizeTotalPrice) {
        int numberItems = startNumberItems;
        double cost = BigDecimal.valueOf(startPriceAllItems).setScale(2, RoundingMode.HALF_UP).doubleValue();
        String price = numberItems + " - " + cost;
        double priceOneItem = startPriceAllItems / startNumberItems;

        for (int i = 1; i < sizeTotalPrice; i++) {
            numberItems += differentialNumberItems;
            cost = BigDecimal.valueOf(numberItems * priceOneItem).setScale(2, RoundingMode.HALF_UP).doubleValue();
            price += "\n" + numberItems + " - " + cost;
        }
        return price;
    }
}
