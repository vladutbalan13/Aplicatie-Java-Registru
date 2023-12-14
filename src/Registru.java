import java.util.ArrayList;


public class Registru {
    ArrayList<Persoana> ListaPersoane;
    ArrayList<Angajat> ListaAngajati;
    int index;

    Registru() {
        ListaAngajati = new ArrayList<>();
        index = 0;
    }

    public Registru(int n) {
        ListaPersoane = new ArrayList<>(n);
    }


    public void add_angajat(Angajat a) {
        ListaAngajati.add(a);
    }

    public void remove_angajat(int p) {
        ListaAngajati.remove(p);

    }

    public void remove_angajat(Angajat a) {
        int index2 = 0;
        for (int i = 0; i < ListaAngajati.size(); i++) {
            if (a.varsta == ListaAngajati.get(i).varsta && a.nume == ListaAngajati.get(i).nume && a.locdemunca == ListaAngajati.get(i).locdemunca)
                index2 = i;
        }
        ListaAngajati.remove(index2);
    }

    public void modify_angajat(Angajat a, Angajat b) {
        int index2 = 0;
        for (int i = 0; i < ListaAngajati.size(); i++) {
            if (a.varsta == ListaAngajati.get(i).varsta && a.nume == ListaAngajati.get(i).nume && a.locdemunca == ListaAngajati.get(i).locdemunca)
                index2 = i;
        }
        ListaAngajati.set(index2, b);
    }

    @Override
    public String toString() {
        return "Registru{" +
                "ListaAngajati=" + ListaAngajati +
                '}';
    }
}
