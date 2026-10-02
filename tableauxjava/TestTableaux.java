public class TestTableaux {

    public static void main(String[] args) {

        double[][] t1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        double[][] t2 = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // Affichage de t1
        System.out.println("Tableau t1 :");
        Tableaux.affiche(t1);

        // Vérifier si t1 est régulier
        System.out.println("t1 est regulier : "
                + Tableaux.regulier(t1));

        // Somme des lignes de t1
        System.out.println("Somme des lignes de t1 :");
        double[] sommes = Tableaux.sommeLignes(t1);

        for (int i = 0; i < sommes.length; i++) {
            System.out.println("Ligne " + (i + 1)
                    + " : " + sommes[i]);
        }

        // Somme de t1 et t2
        double[][] resultat = Tableaux.somme(t1, t2);

        if (resultat != null) {
            System.out.println("Somme de t1 et t2 :");
            Tableaux.affiche(resultat);
        } else {
            System.out.println(
                "Les tableaux ne peuvent pas etre additionnes."
            );
        }
    }
}