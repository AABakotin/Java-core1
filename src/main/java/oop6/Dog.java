package oop6;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }

    public void animalRun(int disOnRoad, int disOnWater) {
        if (disOnRoad > 500)
            System.out.printf("Собачка %s не может пробежать такое расстояние\n", this.name);
        if (disOnRoad < 500)
            System.out.printf("Собачка %s пробежали %d метров\n", this.name, disOnRoad);
        if (disOnWater < 10)
            System.out.printf("Собака %s проплыла %d метров\n", this.name, disOnWater);
        if (disOnWater > 10)
            System.out.printf("Собаки %s не могут плыть более 10 метров!!!!\n", this.name);

    }


    @Override
    public void voice() {
        System.out.printf("Собака %s подает голос\n", this.name);
    }

}
