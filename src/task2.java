import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        double[][] a = new double[8][8];//створення двовирірного масиву з рядками 8 і довжною їх 8

        for (int i = 0; i<8; i++)
            for (int j = 0; j<8; j++)
                a[i][j] = random.nextDouble()*10;//дає випадкове число а потім множить його на 10 і тому кожна перша клітинка отримує число від 0 до 10

        for (int i = 0; i<8; i++)
            for (int j = 0; j<8; j++)
                if (i%2==1 || j%2 ==1)//тепер перевірна на парність чи непарність , тобто рядок непарний або парний і так само зі стовпцем
                    a[i][j] = Math.sqrt(a[i][j]);//якщо стовпець або рядок непрарні, то із цього числа беремо корінь квадратний

        for (double[] row:a){//кожен рядок
            for(double x : row)//кожне число в рядку
                System.out.printf("%.3f",x);//виводить числа з 3 знаками після коми
            System.out.println();
        }
    }
}
