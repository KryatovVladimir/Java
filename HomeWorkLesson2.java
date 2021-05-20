import java.util.Scanner;

public class HomeWorkLesson2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        checkSum();
        positiveOrNegativeNumber();
        checkNumber();
        writeLineAndNumber();
    }

    /*1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/
    public static void checkSum() {
        System.out.println("Задача номер 1");
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Сумма числе равна = " + sum);
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /*2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в
    консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/
    public static void positiveOrNegativeNumber () {
        System.out.println("\n" + "Задача номер 2");
        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println(a);
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    /*3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/
    public static void checkNumber () {
        System.out.println("\n" + "Задача номер 3");
        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println(a);
        if (a >= 0){
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    /*4.Написать метод, которому в качестве аргументов передается строка и число,
       метод должен отпечатать в консоль указанную строку, указанное количество раз;*/
    public static void writeLineAndNumber () {
        System.out.println("\n" + "Задача номер 4");
        System.out.println("Введите строку:");
        String g = scanner.next();
        System.out.println("Введите количество выводимых строк:");
        int a = scanner.nextInt();
        if (a > 0) {
            for (int i = a; i >= 1; i--){
            System.out.println(g);
        }
        } else {
            System.out.println("Нельзя вывести такое количество строк");
        }
    }
}
