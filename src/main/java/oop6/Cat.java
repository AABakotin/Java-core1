package oop6;

public class Cat extends Animal {

    public Cat(String name, String color) {
        super(name, color);
    }


    @Override
    public void animalRun(int disOnRoad, int disOnWater) {
        if (disOnRoad > 0 && disOnWater > 0) {
            if (disOnRoad <= 200) {
                System.out.printf("Котик %s лекго пробежал дистанцию в %d метров\n", this.name, disOnRoad);
            } else System.out.printf("Котик %s не может пробежать большое расстояние\n", this.name);
            if (disOnWater > 0)
                System.out.printf("Котик %s не плавает!!!!\n", this.name);
        }else System.out.println("Расстояние не может быть меньше 0м");
    }


    @Override
    public void voice() {
        System.out.printf("Кот %s подает голос\n", this.name);
    }

}
