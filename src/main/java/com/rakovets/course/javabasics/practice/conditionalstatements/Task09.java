package com.rakovets.course.javabasics.practice.conditionalstatements;

/**
 * Разработать программу для сервиса доставки.
 * <p>
 * Определить номер подъезда дома для текущего клиента.
 */
public class Task09 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int numberFloors = 9;
        int numberApartmentsPerFloor = 4;
        int apartmentNumber = 36;

        int porchNumber = getPorchNumber(numberFloors, numberApartmentsPerFloor, apartmentNumber);
        System.out.printf("Result: %s", porchNumber);
    }

    /**
     * Определяет номер подъезда дома для текущего клиента.
     *
     * @param numberFloors             количество этажей
     * @param numberApartmentsPerFloor количество квартир на этаже
     * @param apartmentNumber          номер квартиры
     * @return номер подъезда
     */
    static int getPorchNumber(int numberFloors, int numberApartmentsPerFloor, int apartmentNumber) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int numberPorch;
        int numberApartmentsInPorch = numberApartmentsPerFloor * numberFloors;
        numberPorch = (apartmentNumber % numberApartmentsInPorch == 0)
                ? apartmentNumber / numberApartmentsInPorch
                : apartmentNumber / numberApartmentsInPorch + 1;
        return numberPorch;
    }
}
