public class HomeWorkLesson5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];

        persArray[0] = new Person("Изя Шниперсон", "старый еврей", "izya@mail.ru", "+7 222 322-2233", 12792, 79);
        persArray[1] = new Person("Зигфрид", "королевич", "siegy@mail.ru", "+7 222 322-3322", 12792, 19);
        persArray[2] = new Person("Илья Муромец", "богатырь", "ilya@mail.ru", "+7 332 233-3222", 12792, 45);
        persArray[3] = new Person("Баба Маня", "клининг-менеджер", "manya@mail.ru", "+7 322 223-2233", 12792, 68);
        persArray[4] = new Person("Дед Мазай", "зоозащитник", "mazay@mail.ru", "+7 233 322-2333", 12792, 63);

        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].checkAge(40)) persArray[i].printPerson();
        }
    }
}
