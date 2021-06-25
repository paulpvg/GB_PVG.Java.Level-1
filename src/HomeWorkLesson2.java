public class HomeWorkLesson2 {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        System.out.println(sumCompare(1, 19));
        System.out.println("Задание 2:");
        defSign(0);
        System.out.println("Задание 3:");
        System.out.println(defSignBool(0));
        System.out.println("Задание 4:");
        printStr("Hello world!!!", 4);
        System.out.println("Задание 5:");
        System.out.println(typeYear(1900));
    }

// Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
// (включительно), если да – вернуть true, в противном случае – false.
    public static boolean sumCompare(int a, int b) {
        if (((a + b) >= 10) && ((a + b) <= 20)) {
            return true;
        }
        else {
            return false;
        }
    }

// Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void defSign(int a) {
        if (a >= 0) {
            System.out.println("Передали положительное число");
        }
        else {
            System.out.println("Передали отрицательное число");
        }
    }

// Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
// отрицательное, и вернуть false если положительное.
    public static boolean defSignBool(int a) {
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }

    }

// Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
// указанную строку, указанное количество раз
    public static void printStr(String s, int a ) {
        for (int i=0; i < a; i++) {
            System.out.println(s);
        }
    }

// * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
// не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый
// 400-й – високосный
    public static boolean typeYear(int a) {
        if ((a % 400) == 0) {
            return true;
        }
        else if ((a % 100) == 0) {
            return false;
        }
        else if ((a % 4) == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
