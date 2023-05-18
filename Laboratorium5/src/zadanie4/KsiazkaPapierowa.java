public class KsiazkaPapierowa extends Ksiazka {

    private int rokWydania;

    public KsiazkaPapierowa(String tytul, String autor, int liczbaStron, int rokWydania) {
        super(tytul, autor, liczbaStron);
        this.rokWydania = rokWydania;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    @Override
    public String toString() {
        return "Książka papierowa: " + super.getTytul() + ", autor: " + super.getAutor() + ", liczba stron: "
                + super.getLiczbaStron() + ", rok wydania: " + rokWydania;
    }
}
