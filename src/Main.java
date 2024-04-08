public class Main {
    public static void main(String[] args) {


        Darbuotojas darb01 = new Darbuotojas( "Vardas1", "Pavarde1", 39012050011L);


        ImonesDarbuotojas drb01 = new ImonesDarbuotojas("Vardas1", "vadybininkas", 5);
        ImonesDarbuotojas drb02 = new ImonesDarbuotojas("Vardas2", "vadybininkas", 1);
        ImonesDarbuotojas drb03 = new ImonesDarbuotojas("Vardas3", "vadybininkas", 7);


        Imone imone = new Imone("Imone1", 1999);
        imone.pridetiDarbuotoja(drb01);
        imone.pridetiDarbuotoja(drb02);
        imone.pridetiDarbuotoja(drb03);
        imone.gautiDarbSarasa(3);

    }
}