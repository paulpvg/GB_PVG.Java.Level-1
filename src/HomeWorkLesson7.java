public class HomeWorkLesson7 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[4];

        cats[0] = new Cat(10,"Матроскин");
        cats[1] = new Cat(8,"Барсик");
        cats[2] = new Cat(7, "Мурзик");
        cats[3] = new Cat(3, "Леопольд");

        Plate plate = new Plate(20);

        for (int i = 0; i < cats.length; i++) cats[i].eatFrom(plate);

        plate.increaseFood(50);

        for (int i = 0; i < cats.length; i++) cats[i].eatFrom(plate);
    }
}
