import java.util.Arrays;

public class Angajat extends Persoana{
     String locdemunca;
    Persoana muncitor[];
    public Angajat(String nume,int varsta,String locdemunca){
        //this.nume=nume;
        //this.varsta=varsta;
        super(nume,varsta);
        this.locdemunca=locdemunca;
    }
    public Angajat()
    {
        nume=null;
        varsta=0;
        locdemunca=null;
    }

    @Override
    public String toString() {
        return "Angajat: " +
                "Nume=  " + nume + '\'' +
                "Varsta= " + varsta + '\'' +
                "Job= " + locdemunca + '\'' +
                 "\n";
    }
}
