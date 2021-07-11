public class Dog extends Animal{
    private final int lengthRun = 500;
    private final int lengthSwim = 10;
    static int countDog;

    Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    void swim(int length) {
        if ((length <= lengthSwim) && (length >0)) System.out.println(name + " проплыл " + length + "м");
        else if (length > lengthSwim) System.out.println(name + " проплыл " + lengthSwim + "м, мышцы лап свело, и он утонул");
        else if (length == 0) System.out.println(name + " поблагодарил, что его никуда не посылают и спрятался под ёлкой");
        else System.out.println(name + " не рак и пятиться не желает");
    }

    @Override
    void run(int length) {
        if ((length <= lengthRun) && (length >0)) System.out.println(name + " пробежал " + length + "м");
        else if (length > lengthRun) System.out.println(name + " пробежал " + lengthRun + "м и, утомившись, пал замертво");
        else if (length == 0) System.out.println(name + " поблагодарил, что его никуда не посылают и спрятался под ёлкой");
        else System.out.println(name + " не рак и пятиться не желает");
    }

}
