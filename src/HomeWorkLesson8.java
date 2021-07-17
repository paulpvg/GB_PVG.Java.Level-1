import java.util.Scanner;

public class HomeWorkLesson8 {
    public static void main(String[] args) {
        String s1 = "Hello world!";
        String s2 = "Hello world!";
        String s3 = new String(s1);
        String s4 = "Hello ";
        String s5 = "world!";
        String s6 = s4 + s5;

        Scanner scanner = new Scanner(System.in);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s6));
        System.out.println("Напишите Hello world!");
        System.out.println(s1.equals(scanner.nextLine()));
        System.out.println("------");

        Test t1 = new Test(1, "1");
        Test t2 = new Test(1, "1");
        Test t3 = new Test(2, "2");

        System.out.println(t1.equals(t2));
        System.out.println(t2.equals(t1));
        System.out.println(t3.equals(t1));
        System.out.println(t2.equals(t3));
        System.out.println("------");

        String s11 = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < 300000; i++) s11 += "a";
        long endTime = System.nanoTime();
        float result = (endTime - startTime) * 0.000000001f;
        System.out.println(result);

        StringBuilder sb = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < 300000; i++) sb.append("a");
        endTime = System.nanoTime();
        result = (endTime - startTime) * 0.000000001f;
        System.out.println(result);

        new MyWindow();
    }
}
