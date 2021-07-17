public class Cat {
    private boolean isFull;
    private int appetite;
    private String name;

    public Cat(int appetite, String name) {
        isFull = false;
        this.appetite = appetite;
        this.name = name;
    }

    public void eatFrom(Plate plate) {
        if (plate.hasEnoughFood(appetite) && !isFull) {
            System.out.println(name + " быстро поглащает еду, пока не появились конкуренты.");
            plate.decreaseFood(appetite);
            isFull = true;
        }
        else if (!plate.hasEnoughFood(appetite)) System.out.println(name + " крутится вокруг тарелки, брезгуя объедками");
        else if (isFull) System.out.println(name + " наелся и для лучшего переваривания лег поспать");
    }
}
