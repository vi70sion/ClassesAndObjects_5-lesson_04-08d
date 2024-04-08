public class Darbuotojas {
    private String vardas, pavarde;
    private long asmensKodas;
    private int amzius;
    private String pareigos;
    private int darbPatirtis;
    public Darbuotojas(String vardas, String pavarde, long asmensKodas){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.pareigos = pareigos;
        this.asmensKodas = asmensKodas;
        this.amzius = skaiciuokAmziu();
    }
    private int skaiciuokAmziu(){

        return 0;
    }

    public String getVardas() {
        return vardas;
    }
    public String getPavarde() {
        return pavarde;
    }
    public String getPareigos(){
        return pareigos;
    }
    public String darboPatirtis(){
        return pareigos;
    }
    public long getAsmensKodas(){
        return asmensKodas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }
}
