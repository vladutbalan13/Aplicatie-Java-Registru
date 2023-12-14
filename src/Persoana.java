public class Persoana {
    String nume;
    int varsta;

    @Override
    public String toString() {
        return "Persoana: \n" +
                "Numele este " + nume +
                " \n Varsta este " + varsta;
    }

    public Persoana() {
        nume = "";
        varsta = 0;
    }

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

}
