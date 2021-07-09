public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printPerson(){
        System.out.println("Имя сотрудника: " + name + " Должность: " + position);
        System.out.println("    E-mail: " + email + " Телефон: " + phone + " Оклад: " + salary + " Возраст: " + age);
    }

    public boolean checkAge(int age){
        if(this.age >= age) return true;
        return false;
    }

}
