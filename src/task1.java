public class task1 {
    public static void main(String[] args) {
        int[][] pyramid = new int[7][]; //свторення звичайної піраміди де 7 рядків, але немає довжини

        for (int i = 0; i < 7; i++) {
            pyramid[i] = new int[i + 1];// тепер коли і=0 це рядок з довжино 1
            for (int j = 0; j < pyramid[i].length; j++) {
                pyramid[i][j] = j + 1;//заповнення числами, з новим рядком довжина збільнується на 1
            }
        }

        for (int[] row : pyramid) {//кожен рядок піраміди
            for (int x : row) System.out.print(x);//число в рядку - х і друкує числа без пробілу
            System.out.println();//виводить на новий рядок
        }

        for (int i = pyramid.length - 1; i >= 0; i--) {//піраміда у зворотньому порядку, тобто починаться з останнього числа і кожен раз -1 рядок
            for (int j = 0; j < pyramid[i].length; j++)
                System.out.print(pyramid[i][j]);
            System.out.println();
        }
    }
}