package Ficha;

public class Atributos {
    private int forca,modificadorForca;
    private int destreza,modificadorDestreza;
    private int constituicao,modificadorConstituicao;
    private int inteligencia,modificadorInteligencia;
    private int sabedoria,modificadorSabedoria;
    private int carisma,modificadorCarisma;

    
    public Atributos(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
        this.forca = forca;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;

        calcularAtributos(forca, destreza, constituicao, inteligencia, sabedoria, carisma);
    }

    public void calcularAtributos(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma){
        this.modificadorForca = (forca - 10)/2;
        this.modificadorDestreza = (destreza - 10)/2;
        this.modificadorConstituicao = (constituicao - 10)/2;
        this.modificadorInteligencia = (inteligencia - 10)/2;
        this.modificadorSabedoria = (sabedoria - 10)/2;
        this.modificadorCarisma = (carisma - 10)/2;
    }

    public int getForca() {
        return forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public int getCarisma() {
        return carisma;
    }

    public int getModificadorForca() {
        return modificadorForca;
    }

    public int getModificadorDestreza() {
        return modificadorDestreza;
    }

    public int getModificadorConstituicao() {
        return modificadorConstituicao;
    }

    public int getModificadorInteligencia() {
        return modificadorInteligencia;
    }

    public int getModificadorSabedoria() {
        return modificadorSabedoria;
    }

    public int getModificadorCarisma() {
        return modificadorCarisma;
    }
    
    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public String toString() {
        return "Atributos:\n" +
                "Força: " + forca + " (Modificador: " + modificadorForca + ")\n" +
                "Destreza: " + destreza + " (Modificador: " + modificadorDestreza + ")\n" +
                "Constituição: " + constituicao + " (Modificador: " + modificadorConstituicao + ")\n" +
                "Inteligência: " + inteligencia + " (Modificador: " + modificadorInteligencia + ")\n" +
                "Sabedoria: " + sabedoria + " (Modificador: " + modificadorSabedoria + ")\n" +
                "Carisma: " + carisma + " (Modificador: " + modificadorCarisma + ")";
    }
    
}
