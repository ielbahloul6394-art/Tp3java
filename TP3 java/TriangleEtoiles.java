import java.util.Scanner;

public class TriangleEtoiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner la hauteur du triangle : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Afficher les espaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Afficher les étoiles
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}