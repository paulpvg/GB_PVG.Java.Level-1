public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (!hasEnoughFood(appetite)) System.out.println("Маловато будет!!! Еще клади!");
        else food -= appetite;
        System.out.println("В тарелке осталось " + food + " еды");
    }

    public void increaseFood(int countOfFood) {
        food += countOfFood;
        System.out.println("Хозяин добавил в тарелку " + countOfFood + " еды");
    }

    public boolean hasEnoughFood(int appetite) {
        if (appetite < food) return true;
        else return false;
    }


}
