package lesson4;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {

    private static char[][] field;                                 // создаем поле (двумерный массив)
    private static int sizeField = 5;                                   // Размер поля
    private static final Scanner SCANNER = new Scanner(System.in);  // Сканер для ввода занчения в консоль
    private static final Random RANDOM = new Random();              // Создаем мозг АИ
    private static final char player = 'o';                         // Значок Игрока char - знак
    private static final char aI = 'x';                             // Значок Компа char - знак
    private static final char sectors = '_';                        // Пустое поле
    private static int scorePlayer;                                 // Число побед Игрока
    private static int scoreAI;                                     // Число побед Компа
    private static final int CheckLine = 3;                         // Количество обрататываемых клеток для победы


    public static void main(String[] args) {


        while (true) {
            playGame();
            System.out.printf("Счет --  Игрока  Железа \n           %d        %d\n", scorePlayer, scoreAI);
            System.out.println("Играем дальше? Y или N");
            if (!SCANNER.next().equalsIgnoreCase("y"))
                break;
        }
    }

    private static void playGame() {
        inviteField();
        visibleField();
        while (true) {
            playerMotion();
            if (checkWin(player)) {
                scorePlayer++;
                visibleField();
                break;
            }
            aIMotion();
            visibleField();
            if (checkWin(aI)) {
                scoreAI++;
                break;
            }
        }
    }

    private static boolean checkWin(char dot) {

        for (int j = 0; j < sizeField; j++) {
            int horizontal = 0;
            for (int i = 0; i < sizeField; i++) {
                if (field[j][i] == dot) horizontal++;
                if (horizontal == CheckLine) return true;
                if (field[j][i] != dot) horizontal = 0;
            }
        }
        int vertical = 0;
        for (int j = 0; j < sizeField; j++) {
            for (int i = 0; i < sizeField; i++) {
                if (field[i][j] == dot) vertical++;
                if (vertical == CheckLine) return true;
                if (field[i][j] != dot) vertical= 0;
        }if (vertical == CheckLine) return true;
        }
        int diagonal = 0;
        for (int i = 0; i < sizeField; i++) {
            if (field[i][i] == dot) diagonal++;
            if (diagonal == CheckLine) return true;
            if (field[i][i] != dot) diagonal=0;
        }int diagonalRevers = 0;
        for (int i = 0, j = sizeField - 1; i < sizeField; i++, j--) {
            {
                if (field[i][j] == dot) diagonalRevers++;
                if (diagonalRevers == CheckLine) return true;
                if (field[i][j] != dot) diagonalRevers = 0;
            }
        }if (diagonalRevers == CheckLine) return true;
        for (int i = 0; i < sizeField; i++) {
            for (int j = 0; j < sizeField; j++) {
                if (field[j][i] == sectors)
                    return false;
            }
        }
        return false;
    }

    private static void inviteField() {
        field = new char[sizeField][sizeField];
        for (int y = 0; y < sizeField; y++) {
            for (int x = 0; x < sizeField; x++) {
                field[y][x] = sectors;
            }
        }

    }

    private static void visibleField() {

        System.out.print("*");
        for (int i = 0; i < sizeField * 2 + 1; i++) {
            if (i % 2 == 0) {
                System.out.print(" ");
            } else {
                System.out.print(i / 2 + 1);
            }
        }
        System.out.println();
        for (int i = 0; i < sizeField; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < sizeField; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }

    private static void aIMotion() {
        int x, y;

        do {
            x = RANDOM.nextInt(sizeField);
            y = RANDOM.nextInt(sizeField);
        } while (sectorClear(y, x));
        field[y][x] = aI;
    }

    private static void playerMotion() {
        int x, y;

        do {
            System.out.print("Введите координаты для хода по Х и У->>>");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!inputNumb(y, x) || sectorClear(y, x));
        field[y][x] = player;

    }

    private static boolean sectorClear(int y, int x) {
        return field[y][x] != sectors;

    }

    private static boolean inputNumb(int y, int x) {
        return x >= 0 && y >= 0 && x < sizeField && y < sizeField;
    }

}









