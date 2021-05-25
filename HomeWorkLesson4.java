import java.util.Random;
import java.util.Scanner;

public class HomeWorkLesson4 {
    public static char[][] map; //создаем символьный массив поля
    public static final int SIZE = 3; // размер константа
    public static final int DOTS_TO_WIN = 3; // параметр победы

    public static final char DOT_EMPTY = '•'; // пустая ячейка
    public static final char DOT_X = 'X'; // X
    public static final char DOT_O = 'O'; // O

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
          humanTurn();
          printMap();
          if (checkWin(DOT_X)) { // после каждого хода проверяем победу человека
              System.out.println("Вы победили");
              break;
          }
          if (isMapFull()) { // после каждого хода проверяем, что поле не заполнено до конца
                System.out.println("Ничья");
                break;
          }
          aiTurn();
          printMap();
            if (checkWin(DOT_O)) { // после каждого хода проверяем победу компьютера
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) { // после каждого хода проверяем, что поле не заполнено до конца
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void initMap() { // заполнение двумерного массива пустыми ячейками с точкой
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++ ) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY; // в каждый элемент массива записали •
            }
        }
    }

    public static void printMap() { // вывод поля на экран
        for (int i = 0; i <= SIZE; i++) {//верхняя строка 0-1-2-3
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");// название строк 1-2-3
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " "); // элемент массива через порбел
            }
            System.out.println(); // табуляция
        }
        System.out.println();
    }

    public static Scanner scanner = new Scanner(System.in);
    public static void humanTurn() { //ход человека
        int x, y;
        do { // цикл с постусловием - ввели координаты и проверили
            System.out.println("Введите координаты в формате X и Y:");
            x = scanner.nextInt() - 1; // элементы массива от 0 до 2, поэтому -1
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X; // если координата верна, то записываем фишку X

    }

    public static boolean isCellValid(int x, int y) { //проверяем можно ли поставить фишку
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false; //мы вышли за поле
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    private static Random random = new Random(); //генератор случайных чисел
    public static void aiTurn() { //ход компьютера
        int x, y;
        do { // цикл с постусловием - ввели координаты и проверили
            x = random.nextInt(SIZE); // компьютер знает элементы массива, поэтому не вычитаем 1
            y = random.nextInt(SIZE); // SIZE ограничивает действия рандомайзера до 3
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1)); /*тут мы показываем
        координаты точки пользователю - куда походил компьютер*/
        map[y][x] = DOT_O; // если координата верна, то записываем фишку O
    }

    private static boolean checkWin (char symbol) { // проверка победы для поля 3 на 3 - 8 условий
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;
        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        if (map[2][0] == symbol && map[1][1] == symbol && map[0][2] == symbol) return true;
        return false;
    }

    private static boolean isMapFull() { // проверка, что есть пустые поля
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }

        }
        return true;
    }

}
