
import java.util.Scanner;

public class RotationMatrice {

    
    public static void rotate90ClockwiseInPlace(int[][] A) {
        int N = A.length;
        int temp;

        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                temp = A[i][j];
                A[i][j] = A[i][N - 1 - j];
                A[i][N - 1 - j] = temp;
            }
        }
    }

    
    public static void rotate90CounterClockwiseInPlace(int[][] A) {
        int N = A.length;
        int temp;

        // Etape 1 : Transposition
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N / 2; i++) {
                temp = A[i][j];
                A[i][j] = A[N - 1 - i][j];
                A[N - 1 - i][j] = temp;
            }
        }
    }

    
    public static void rotate180InPlace(int[][] A) {
        int N = A.length;
        int temp;

       
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                temp = A[i][j];
                A[i][j] = A[N - 1 - i][N - 1 - j];
                A[N - 1 - i][N - 1 - j] = temp;
            }
        }

        // Si N est impair, inverser les elements
        // de la ligne centrale
        if (N % 2 != 0) {
            int i = N / 2;

            for (int j = 0; j < N / 2; j++) {
                temp = A[i][j];
                A[i][j] = A[i][N - 1 - j];
                A[i][N - 1 - j] = temp;
            }
        }
    }

    
    public static void affiche(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();

       
        int[][] A = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        
        rotate90ClockwiseInPlace(A);

               affiche(A);

        sc.close();
    }
}