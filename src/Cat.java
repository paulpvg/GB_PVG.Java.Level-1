public class Cat extends Animal{
    private final int lengthRun = 200;
    static int countCat;

    Cat(String name) {
        super(name);
        countCat++;
    }

    @Override
    void swim(int length) {
        System.out.println(name + " забыл, что не умеет плавать и утонул");
    }

    @Override
    void run(int length) {
        if ((length <= lengthRun) && (length >0)) System.out.println(name + " пробежал " + length + "м");
        else if (length > lengthRun) System.out.println(name + " пробежал " + lengthRun + "м и, утомившись, пал замертво");
        else if (length == 0) System.out.println(name + " поблагодарил, что его никуда не посылают и спрятался под ёлкой");
        else System.out.println(name + " не рак и пятиться не желает");
    }

}
