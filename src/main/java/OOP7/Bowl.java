package OOP7;

public class Bowl {

    private int fullness;

    public void applyFood(int countFood) {
        this.fullness += countFood;

    }

    public void decreaseFood(int countFood) {
        this.fullness -= countFood;
    }

    public int getFullness() {
        return fullness;

    }


}