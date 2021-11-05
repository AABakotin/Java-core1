package lesson2;

public class lesson2 {


    public static void main(String[] args) {
        int first = 17;
        int second = 3;
        int loop = 3;
        int years = 2021;
        String text = "Выводимый Текст";
        System.out.println("Сумма чисел лежит от 10 до 20? ->>> " + checkSum(first, second));
        System.out.println("Число отрицательное?  ->>> " + reverse(first, second));
        System.out.println("Введеный год высокосный? ->>> " + yearsCheck(years));
        textVision(loop, text);
        checkNumb(first, second);
    }

    public static boolean checkSum(int second, int first) {
        int sum = second + first;
        return sum <= 20 && sum >= 10;

    }

    public static void checkNumb(int second, int first) {
        int numb = second * first; //Положительный или отрицательный для двух чисел
        System.out.println(numb >= 0 ? "Введеные числа положиетельные" : "Введенные числа отрицательные");

    }

    public static boolean reverse(int second, int first) {
        int sum = second * first; //Положительный или отрицательный для двух чисел
        return sum <= 0;
    }

    public static void textVision(int loop, String text) {
        for (int i = 0; i < loop; ++i) {
            System.out.println(text);
        }
    }

    public static boolean yearsCheck(int years) {
        return years % 4 == 0 && years % 100 != 0 || years % 400 == 0;
    }


}
