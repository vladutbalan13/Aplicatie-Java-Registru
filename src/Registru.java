import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Registru {
    ArrayList <Persoana> ListaPersoane;
    ArrayList <Angajat> ListaAngajati;
    int index;
    Registru()
    {
        //Angajati=new Angajat[10];
        ListaAngajati= new ArrayList<>();
        index=0;
    }
    public Registru(int n) {
        //registru= new Persoana[n];
        ListaPersoane= new ArrayList<>(n);
    }



    public void add_angajat(Angajat a)
    {
        /*if(index< Angajati.length)
        Angajati[index]= a;
        index++;*/
        ListaAngajati.add(a);
    }
    public void remove_angajat(int p)
    {
        ListaAngajati.remove(p);

    }
    public void remove_angajat(Angajat a)
    {
        int index2=0;
        for(int i =0;i<ListaAngajati.size();i++)
        {
            if(a.varsta==ListaAngajati.get(i).varsta && a.nume==ListaAngajati.get(i).nume && a.locdemunca==ListaAngajati.get(i).locdemunca)
                index2=i;
        }
        ListaAngajati.remove(index2);
    }
    public void modify_angajat(Angajat a,Angajat b)
    {
        int index2=0;
        for(int i =0;i<ListaAngajati.size();i++)
        {
            if(a.varsta==ListaAngajati.get(i).varsta && a.nume==ListaAngajati.get(i).nume && a.locdemunca==ListaAngajati.get(i).locdemunca)
                index2=i;
        }
        ListaAngajati.set(index2,b);
    }
    @Override
    public String toString() {
        String list="";
        for (int i=0;i<ListaAngajati.size();i++)
        {
            list += ListaAngajati.get(i).toString()+ "\n";
        }
        return list;
    }

}
