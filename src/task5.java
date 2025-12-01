import java.util.Random;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Введіть розмір матриці : ");
        int n = scanner.nextInt();

        int[][] m = new int[n][n]; //ми задаємо подвійний масив для звичайний матриці (m)

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = rand.nextInt(1001); // це дозволяє нам пройтись по всім рядкам і стовпцям і вивестт рандомне значення від 0 до 1000

        System.out.println("Звичайна матриця:");
        for (int[] row : m) {
            for (int x : row) System.out.print(x + " ");
            System.out.println(); // проходить по кожному рядку i , потім по кожному стовпцю j і виводить значення
        }

        int[][] t = new int[n][n]; // все так само, але це вже транспонована матриця t

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                t[j][i] = m[i][j];

        System.out.println("Транспонована матриця :");
        for (int[] row : t) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
        scanner.close();
    }
}
// у результаті всіх дій i зміниться на j, а j на i