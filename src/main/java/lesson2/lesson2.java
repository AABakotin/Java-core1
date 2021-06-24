package lesson2;

public class lesson2 {


    public static void main(String[] args) {
        int first = 17;
        int second = 3;
        int loop = 3;
        int years = 400;
        String hello = "Выводимый Текст";
        System.out.println("Сумма чисел лежит от 10 до 20? ->>> " + checkSum(first, second));
        System.out.println("Число отрицательное?  ->>> " +reverse(first, second));
        System.out.println("Введеный год высокосный? ->>> " + yearsCheck(years));
        textVision(loop, hello);
        checkNumb(first, second);
    }

    public static boolean checkSum(int second, int first) {
        int sum = second + first;
        return sum <= 20 && sum >= 10;
    }
    public static void checkNumb(int second, int first) {
        int numb = second * first; //Положительный или отрицательный для двух чисел
        if (numb >= 0) {
            System.out.println("Введеные числа положиетельные");
        } else {
            System.out.println("Введенные числа отрицательные");
        }
    }
    public static boolean reverse(int second, int first) {
        int sum = second * first; //Положительный или отрицательный для двух чисел
        return sum <= 0;
    }
    public static void textVision(int loop, String hello) {
        for (int i = 0; i < loop; ++i){
            System.out.println(hello);
        }
    }
    public static boolean yearsCheck(int years) {
        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0){
            return true;
        } else {
            return false;
        }
    }


}
