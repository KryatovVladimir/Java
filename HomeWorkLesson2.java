import java.util.Scanner;

public class HomeWorkLesson2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        checkSum(5,6);
        positiveOrNegativeNumber(4);
        checkNumber(-1);
        writeLineAndNumber("ggggg",6);
    }

    /*1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/
    public static int checkSum(int a, int b) {
        System.out.println("Задача номер 1");
        System.out.println("На вход поданы числа: a = " + a + ", " + "b = " + b);
        int sum = a + b;
        System.out.println("Сумма чисел равна = " + sum);
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return sum;
    }

    /*2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в
    консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/
    public static int positiveOrNegativeNumber(int a) {
        System.out.println("\n" + "Задача номер 2");
        System.out.println("На вход подано число: a = " + a);
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        return a;
    }

    /*3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/
    public static boolean checkNumber (int a) {
        System.out.println("\n" + "Задача номер 3");
        System.out.println("На вход подано число: a = " + a);
        if (a >= 0){
            System.out.println("false");
            return false;
        } else {
            System.out.println("true");
            return true;
        }
    }

    /*4.Написать метод, которому в качестве аргументов передается строка и число,
       метод должен отпечатать в консоль указанную строку, указанное количество раз;*/
    public static void writeLineAndNumber (String a, int b) {
        System.out.println("\n" + "Задача номер 4");
        System.out.println("На вход подана строка: " + a);
        System.out.println("Отобразить следующее число раз: " + b);
        if (b > 0) {
            for (int i = b; i >= 1; i--){
            System.out.println(a);
        }
        } else {
            System.out.println("Нельзя вывести такое количество строк");
        }
    }
}
