package OOP7;

public class Animal {


    private String name;
    protected int appetite;
    private boolean satiety = false;




    public Animal(String name, int appetite,boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat( Bowl bowl) {
        if (bowl.getFullness() > appetite){
            bowl.decreaseFood(appetite);

            System.out.printf("Кот %s съел %d еды и наелся %b\n", this.name, this.appetite, !this.satiety);
        } else System.out.printf("Кот %s  голоден = %b не чего есть и хочет съесть %d еды \n", this.name,this.satiety, this.appetite);
    }

}
