import java.util.Arrays;

public class Angajat extends Persoana {
    String locdemunca;


    public Angajat(String nume, int varsta, String locdemunca) {
        super(nume, varsta);
        this.locdemunca = locdemunca;
    }

    public Angajat() {
        nume = null;
        varsta = 0;
        locdemunca = null;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "locdemunca='" + locdemunca + '\'' +
                ", nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}' + '\n';
    }
}
