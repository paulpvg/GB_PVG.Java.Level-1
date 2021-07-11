public class Animal {
    protected String name;
    static int countAnimal;

    Animal(String name){
        this.name = name;
        countAnimal++;
    }

    void swim(int length) {
        if (length == 0) System.out.println(name + " поблагодарил, что его никуда не посылают и спрятался под ёлкой");
        else if (length < 0) System.out.println(name + " не рак и пятиться не желает");
        else System.out.println(name + " проплыл " + length + "м");
    }

    void run(int length) {
        if (length == 0) System.out.println(name + " поблагодарил, что его никуда не посылают и спрятался под ёлкой");
        else if (length < 0) System.out.println(name + " не рак и пятиться не желает");
        else System.out.println(name + " пробежал " + length + "м");
    }

}
