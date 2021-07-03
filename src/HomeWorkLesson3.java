import java.util.Arrays;

public class HomeWorkLesson3 {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        task01();
        System.out.println("Задание 2:");
        task02();
        System.out.println("Задание 3:");
        task03();
        System.out.println("Задание 4:");
        task04(7);
        System.out.println("Задание 5:");
        System.out.println("Сформированный массив:");
        System.out.println(Arrays.toString(task05(4,19)));
        System.out.println("Задание 6:");
        task06();
        System.out.println("Задание 7:");
        System.out.println(task07(new int[]{2, 2, 2, 2, 2, 2, 10, 1, 1}));
        System.out.println("Задание 8:");
        task08(new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }, -3);
    }
    // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0
    public static void task01(){
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 0, 1};
        System.out.println("Массив до преобразования:");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                arr[i] = 0;
            }
            else if (arr[i] == 0){
                arr[i] = 1;
            }
            else{
                System.out.println("Недопустимый элемент массива");
            }
        }
        System.out.println("Массив после преобразования:");
        System.out.println(Arrays.toString(arr));
    }

    // Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
    public static void task02(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        System.out.println("Сформированный массив:");
        System.out.println(Arrays.toString(arr));
    }

    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
    public static void task03(){
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Массив до преобразования:");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] *=2;
            }
        }
        System.out.println("Массив после преобразования:");
        System.out.println(Arrays.toString(arr));
    }

    // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
    // цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], …, [n][n]
    public static void task04(int dim){
        int[][] arr = new int[dim][dim];
        for (int i = 0; i < dim; i++){
            for (int j = 0; j < dim; j++){
                if ((i == j) || ((i + j) == (dim -1))){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = 0;
                }
            }
        }
        System.out.println("Сформированная матрица:");
        for (int[] row: arr){
            System.out.println(Arrays.toString(row));
        }
    }

    // Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа
    // int длиной len, каждая ячейка которого равна initialValue
    public static int[] task05(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    // * Задать одномерный массив и найти в нем минимальный и максимальный элементы
    public static void task06(){
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, -4, 8, 9, 1 };
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива:  " + min);
    }

    // ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны.
    // **Примеры:
    // checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    // checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    //
    // граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ
    public static boolean task07(int[] arr){
        int sum = 0 ;
        int halfSum = 0;
        int left = 0;
        int l = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        if((sum % 2) != 0){
            return false;
        }
        else{
            halfSum = sum / 2;
            while (left < halfSum){
                left += arr[l];
                if (left == halfSum){
                    return true;
                }
                else if (left > halfSum){
                    return false;
                }
                l++;
            }
        }
        return false; // Необходимость этого выхода мне непонятна, вроде до сюда мы никогда не должны доходить
    }

    // *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
    // отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один
    // вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону
    // сдвиг можете выбирать сами
    public static void task08(int[] arr, int n){
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));
        int tmp;
        if (n > 0){
            System.out.println("Смещение вправо на " + n);
            for (int i = 0; i < n; i++){
                tmp = arr[arr.length - 1];
                for(int j = 0; j < (arr.length - 1); j++){
                    arr[arr.length - j - 1] = arr[arr.length - j - 2];
                }
                arr[0] = tmp;
            }
            System.out.println("Преобразованный массив:");
            System.out.println(Arrays.toString(arr));
        }
        else if (n < 0){
            System.out.println("Смещение влево на " + n);
            for(int i = n; i < 0; i++){
                tmp = arr[0];
                for(int j = 0; j < (arr.length - 1); j++){
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
            System.out.println("Преобразованный массив:");
            System.out.println(Arrays.toString(arr));
        }
        else {
            System.out.println("Задали нулевое смещение");
        }
    }
}
