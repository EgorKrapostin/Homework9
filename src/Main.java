import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }

    /**
     * Бухгалтеры попросили посчитать сумму всех выплат за месяц.
     * Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
     * «Сумма трат за месяц составила … рублей».
     */
    public static void task1() {
        System.out.println("Задача 1:");
        int summ = 0;
        int[] expensesArray = generateRandomArray();
        for (int i = 0; i < expensesArray.length; i++) {
            summ += expensesArray[i];
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");

    }

    /**
     * Также бухгалтерия попросила найти минимальную и максимальную трату за день.
     * Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
     * Минимальная сумма трат за день составила … рублей
     * Максимальная сумма трат за день составила … рублей
     */
    public static void task2() {
        System.out.println("Задача 2:");
        int min = 1_000_000_000;
        int max = 0;
        int[] expensesArray = generateRandomArray();
        for (int i = 0; i < expensesArray.length; i++) {
            if (min > expensesArray[i]) {
                min = expensesArray[i];
            }
            if (max < expensesArray[i]) {
                max = expensesArray[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная  сумма трат за день составила " + max + " рублей");
    }

    /**
     * Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
     * Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней), и выведите в консоль результат в формате:
     * «Средняя сумма трат за месяц составила … рублей».
     */
    public static void task3() {
        System.out.println("Задача 3:");
        double avg = 0.0;
        int summ = 0;
        int[] expensesArray = generateRandomArray();
        for (int i = 0; i < expensesArray.length; i++) {
            summ += expensesArray[i];
        }

        avg = summ / 30;
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");
    }

    /**
     * В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в обратную сторону
     * Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов — char[ ].
     * Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
     * В результате в консоль должно быть выведено: Ivanov Ivan.
     */
    public static void task4() {
        System.out.println("Задача 4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}