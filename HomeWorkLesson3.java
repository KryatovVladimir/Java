import java.util.Arrays;

public class HomeWorkLesson3 {

    public static void main(String[] args) {
        change0On1And1On0();
        mas1To100();
        numberLess6MuktiplyOn2();
        twoDimensionalArray();
        lenghtAndInitialValue(7,3);
        maxAndMinElementInArray();
    }

    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

    public static void change0On1And1On0 () {
        System.out.println("Задача 1" + "\n" + "Задан следующий массив");
        int [] mas = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(mas));
        System.out.println("\n" + "Заменяем 1 на 0, а 0 на 1:");
        for (int i = 0; i < 10; i++) {
            if (mas[i] == 0){
                mas[i] = 1;
            } else {
                mas[i]=0;
            }
        }
        System.out.println(Arrays.toString(mas));
    }

    /*2. Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/
    public static void mas1To100 () {
        System.out.println("\n" + "Задача 2" + "\n" + "Массив от 1 до 100:");
        int[] mas = new int [100];
        for (int i = 0; i < 100; i++) {
            mas[i] = i + 1;
        }
        System.out.println(Arrays.toString(mas));
    }

    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     пройти по нему циклом,и числа меньшие 6 умножить на 2;*/
    public static void numberLess6MuktiplyOn2 () {
        System.out.println("\n" + "Задача 3" + "\n" + "Задан массив:");
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(mas));

        System.out.println("\n" + "Умножаем все числа меньше 6 на 2:");
        for (int i = 0; i < 12; i++) {
            if (mas[i] < 6) {
                mas[i] = mas[i] * 2;
            }
        }
        System.out.println(Arrays.toString(mas));
    }

    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
    цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    то есть [0][0], [1][1], [2][2], …, [n][n];*/
    public static void twoDimensionalArray () {
        System.out.println("\n" + "Задача 4" + "\n" + "Двумерный массив:");
        int[][] mas = new int[5][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i == j){
                    mas[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + mas[i][j] + " ");
            }
            System.out.println();
        }
        }

    /* 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
    массив типа int длиной len, каждая ячейка которого равна initialValue;*/
    public static int[] lenghtAndInitialValue (int len, int initialValue) {
        System.out.println("\n" + "Задача 5" + "\n" + "Массив:");
        int[] mas = new int[len];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = initialValue;
        }
        System.out.println(Arrays.toString(mas));
        return mas;
    }

    /*6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы
    * Вариант 1*/
    public static void maxAndMinElementInArray () {
        System.out.println("\n" + "Задача 6 - Вариант 1" + "\n" + "Начальный массив:");
        int[] mas = {1, 3, 9, 6, 11, 56, 12, 19, 40, 2};
        System.out.println(Arrays.toString(mas));
        System.out.println("Использование встроенного метода сортировки");
        Arrays.sort(mas, 0, mas.length);
        System.out.println(Arrays.toString(mas));
        System.out.println("Минимальный элемент: " + mas[0]);
        int a = mas.length - 1; // нахождение последнего элемента, если массив задан)
        System.out.println("Максимальный элемент: " + mas[a]);
    }
}
