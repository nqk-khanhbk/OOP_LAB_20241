import java.util.Scanner;
public class bai_66 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of n: ");
            int n = sc.nextInt();
            System.out.print("Enter the number of columns: ");
            int m = sc.nextInt();          
            int[][] a = new int[n][m];
            int[][] b = new int[n][m];
            int[][] c = new int[n][m];

            System.out.println("Enter elements of matrix 1:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }    
            System.out.println("Enter elements of matrix 2:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                   b[i][j] = sc.nextInt();
                }
            }
    
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    c[i][j] = a[i][j] +b[i][j];
                }
            }   
            System.out.println("Sum of the matrices:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
}
