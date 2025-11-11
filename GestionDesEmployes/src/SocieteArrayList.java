import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
    private List<Employe> liste = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        liste.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : liste)
            if (e.getNom().equalsIgnoreCase(nom))
                return true;
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return liste.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        liste.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : liste)
            System.out.println(e);
    }

    //tri par ID
    @Override
    public void trierEmployeParId() {
        Collections.sort(liste, Comparator.comparingInt(Employe::getId));
    }

    //tri par Département, puis Grade, puis Nom
    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(liste, Comparator
                .comparing(Employe::getNomDepart)
                .thenComparingInt(Employe::getGrade)
                .thenComparing(Employe::getNom));
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();
        for (Employe e : liste)
            if (e.getNomDepart().equalsIgnoreCase(nomDepartement))
                resultat.add(e);
        return resultat;
    }
}
