public class HomeWorkLesson6 {
    public static void main(String[] args) {

    Cat[] cat = new Cat[3];

    cat[0] = new Cat("Матроскин");
    cat[1] = new Cat("Барсик");
    cat[2] = new Cat("Мурзик");

    Dog[] dog = new Dog[4];

    dog[0] = new Dog("Бобик");
    dog[1] = new Dog("Барбос");
    dog[2] = new Dog("Рекс");
    dog[3] = new Dog("Мухтар");

    Animal pig = new Animal("Пятачок");
    Animal bear = new Animal("Винни");

    cat[0].run(150);
    cat[2].swim(50);
    cat[1].run(0);
    cat[1].run(-20);

    dog[0].run(600);
    dog[1].swim(20);
    dog[2].swim(7);
    dog[3].run(379);

    pig.run(769);
    bear.swim(74);
    pig.swim(36);
    bear.run(0);

    System.out.println("Мы создали котов: " + Cat.countCat + "; собак: " + Dog.countDog + "; всего животных: " + Animal.countAnimal);
    }
}
