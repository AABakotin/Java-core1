package lesson1;

public class lesson1 {


    public static void main(String[] args) {

        printThreeWords();
        checkSumSign(5, -3);
        printColor(55);
        compareNumbers(40, 33);

    }

    private static void printThreeWords() {

        String a = "_Orange";
        String b = "_Banana";
        String c = "_Apple";
        String d = "\n";
        System.out.println((a + d) + (b + d) + (c));

    }

    public static void checkSumSign(int a, int b) {

        System.out.println(a + b >= 0 ? "Сумма чисел " + a + " и " + b + " положительная" : "Сумма чисел " + a + " и " + b + " отрицательна");

    }


    public static void printColor(int value) {

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {

        System.out.println(a >= b ? "a >= b" : "a < b");

    }
}

