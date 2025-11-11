//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        SocieteArrayList societe = new SocieteArrayList();


        Employe e1 = new Employe(1, "imen", "neifar", "IT", 3);
        Employe e2 = new Employe(2, "islem", "neifar", "cam", 1);
        Employe e3 = new Employe(3, "molka", "omrani", "rh", 2);

        System.out.println(e1);


        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        societe.displayEmploye();
        System.out.println("\n Recherche nom 'islem' : " + societe.rechercherEmploye("islem"));
        System.out.println("\n Recherche nom 'mariem' : " + societe.rechercherEmploye("mariem"));

        System.out.println("\n Tri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();
        System.out.println("\n Tri par Département + Grade + Nom :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();
        System.out.println("\n Recherche par département 'IT' :");
        System.out.println(societe.rechercherParDepartement("IT"));




    }
}