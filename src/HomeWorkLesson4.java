import java.util.Random;
import java.util.Scanner;

public class HomeWorkLesson4 {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args){
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Кожаный мешок опять жульничал...");
                break;
            }
            if (isMapFull()) {
                System.out.println("Так уж и быть, соглашусь на ничью");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Преклони колени пред моим интеллектом, кожаный мешок!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Так уж и быть, соглашусь на ничью");
                break;
            }
        }
        System.out.println("GAME OVER!!!");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("# | ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= (SIZE + 1); i++) {
            System.out.print("--");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    // Проверка на соседство случайного хода ИИ с любым ходом игрока
    public static boolean isAiTurnValid(int x, int y){
        for (int i = y - 1; i < (y + 1); i++) {
            for (int j = x - 1; j < (x + 1); j++){
                if ((i >= 0) && (i < SIZE) && (j >= 0) && (j < SIZE)) {
                    if (map[i][j] == DOT_X) return true;
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Жду хода твоего. Вводи координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    // ИИ делает ход только на соседнее поле с занятым игроком
    public static void aiTurn() {
        int x, y;
        do {
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            }
            while (!isCellValid(x, y));
        }
        while (!isAiTurnValid(x, y));
        System.out.println("А я пойду сюда: " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkWin(char symb) {
        int tmp = 0;

        // Проверка горизонталей
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    tmp++;
                    if (tmp == DOTS_TO_WIN) return true;
                }
                else tmp = 0;
            }
        }

        //Проверка вертикалей
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                if (map[i][j] == symb) {
                    tmp++;
                    if (tmp == DOTS_TO_WIN) return true;
                }
                else tmp = 0;
            }
        }

        // Проверка главной и параллельных ей диагоналей
        for (int d = (DOTS_TO_WIN - SIZE); d <= (SIZE - DOTS_TO_WIN); d++ ) {
            if (d < 0) {
                for (int i = 0; i < (SIZE + d); i++) {
                    if (map[i - d][i] == symb) {
                        tmp++;
                        if (tmp == DOTS_TO_WIN) return true;
                    }
                    else tmp = 0;
                }
            }
            else if (d == 0) {
                for (int i = 0; i < SIZE; i++) {
                    if (map[i][i] == symb) {
                        tmp++;
                        if (tmp == DOTS_TO_WIN) return true;
                    }
                    else tmp = 0;
                }
            }
            else {
                for (int i = 0; i < (SIZE - d); i++) {
                    if (map[i][i + d] == symb) {
                        tmp++;
                        if (tmp == DOTS_TO_WIN) return true;
                    }
                    else tmp = 0;
                }
            }
        }

        //Проверка побочной и параллельных ей диагоналей
        for (int d = (DOTS_TO_WIN - SIZE); d <= (SIZE - DOTS_TO_WIN); d++ ) {
            if (d < 0) {
                for (int i = 0; i < (SIZE + d); i++) {
                    if (map[SIZE - i + d -1][i] == symb) {
                        tmp++;
                        if (tmp == DOTS_TO_WIN) return true;
                    }
                    else tmp = 0;
                }
            }
            else if (d == 0) {
                for (int i = 0; i < SIZE; i++) {
                    if (map[i][SIZE - i - 1] == symb) {
                        tmp++;
                        if (tmp == DOTS_TO_WIN) return true;
                    }
                    else tmp = 0;
                }
            }
            else {
                for (int i = 0; i < (SIZE - d); i++) {
                    if (map[SIZE - i - 1][i + d] == symb) {
                        tmp++;
                        if (tmp == DOTS_TO_WIN) return true;
                    }
                    else tmp = 0;
                }
            }
        }
        return false;
    }
}
