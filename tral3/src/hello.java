import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("please enter a number:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] rec = new int[n][n];
        int x_begin = 0, y_begin = 0;
        int x_end = n - 1, y_end = n - 1;
        int num = 1;
        //int num2 = n * n;
        int i = 0, j = y_end;
        while (num != n * n + 1) {
            while (i <= x_end)
                rec[i++][j] = num++;
            i--;
            j--;
            while (j >= y_begin)
                rec[i][j--] = num++;
            j++;
            i--;
            while (i >= x_begin)
                rec[i--][j] = num++;
            i++;
            j++;
            while (j < y_end)
                rec[i][j++] = num++;
            j--;
            y_begin++;
            y_end--;
            x_end--;
            x_begin++;
            i = x_begin;
            j = y_end;
        }
        for (int i1 = 0; i1 != n; i1++) {
            for(int j1 = 0; j1 != n; j1++) {
                System.out.print(rec[i1][j1]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
