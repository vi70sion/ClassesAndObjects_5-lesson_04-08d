import java.util.ArrayList;

public class Imone {
    private String pavadinimas;
    private int metai;
    private ArrayList<ImonesDarbuotojas> darbSarasas;

    Imone(String pavadinimas, int metai){
        this.pavadinimas = pavadinimas;
        this.metai = metai;
        this.darbSarasas = new ArrayList<>();
    }

    public String getPavadinimas() {
        return pavadinimas;
    }
    public int getMetai() {
        return metai;
    }
    public ArrayList<ImonesDarbuotojas> getDarbSarasas() {
        return darbSarasas;
    }
    public void pridetiDarbuotoja(ImonesDarbuotojas darb){
        darbSarasas.add(darb);
    }
    public void gautiDarbSarasa(int x){
        for(ImonesDarbuotojas element : darbSarasas){
            if(element.getDarPatirtis() > x) System.out.println(element);
        }
    }

}
