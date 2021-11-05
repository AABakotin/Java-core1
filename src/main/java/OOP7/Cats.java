package OOP7;


public class Cats extends Animal {
    public Cats(String name, int appetite, boolean satiety) {
        super(name, appetite, satiety);
    }

    public static void main(String[] args) {

        Bowl bowl = new Bowl();
        bowl.applyFood(100);

        Cats[] cat = {
                new Cats("Barsik", 12, false),
                new Cats("Murzik", 18, false),
                new Cats("Kesha", 15, false),
                new Cats("Gray", 12, false),
                new Cats("Jerry", 20, false),
                new Cats("Black", 14, false),
                new Cats("Ruby", 8, false),
                new Cats("Tomm", 16, false),
        };

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(bowl);
            System.out.printf("В миске осталось %d еды\n", bowl.getFullness());

        }

    }
}








