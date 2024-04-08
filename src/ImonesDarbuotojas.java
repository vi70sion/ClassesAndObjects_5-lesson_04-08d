public class ImonesDarbuotojas {
    private String vardasPavarde, pareigos;
    int darPatirtis;
    public ImonesDarbuotojas(String vardasPavarde, String pareigos, int darPatirtis) {
        this.vardasPavarde = vardasPavarde;
        this.pareigos = pareigos;
        this.darPatirtis = darPatirtis;
    }

    public String getVardasPavarde() {
        return vardasPavarde;
    }
    public String getPareigos() {
        return pareigos;
    }
    public int getDarPatirtis() {
        return darPatirtis;
    }
    public void setVardasPavarde(String vardasPavarde) {
        this.vardasPavarde = vardasPavarde;
    }
    public void setPareigos(String pareigos) {
        this.pareigos = pareigos;
    }
    public void setDarPatirtis(int darPatirtis) {
        this.darPatirtis = darPatirtis;
    }

    @Override
    public String toString(){
        return vardasPavarde + "**" + pareigos + " " + darPatirtis;
    }


}
