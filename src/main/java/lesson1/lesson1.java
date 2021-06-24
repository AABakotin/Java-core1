package lesson1;

public class lesson1 {





    public static void main(String[] args){

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    private static void printThreeWords() {

        String a = "_Orange";
        String b = "_Banana";
        String c = "_Apple";
        String d = "\n"; // Как один из вариантов переноса)

        String result = (a+d)+(b+d)+(c); // Скобки для читаемости )
        System.out.println(result);

    }
    public static void checkSumSign(){

        //Помню, что можно не ставить фигурные скобки. Стараюсь привыкать ставить...
        int a = -3;
        int b = 2;
        if (a+b>=0){
            System.out.println("Сумма чисел "+a+" и "+b+" положительная");
        } else {
            System.out.println("Сумма чисел "+a+" и "+b+" отрицательна");
        }

    }
    public static void printColor(){

        int value = 55 ;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value<= 100 && value >= 1){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){

        int a = 9;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
}

