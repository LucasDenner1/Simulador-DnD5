package Ficha.Classes;

public class Classe {
    private String nome;
    private int nivel;
    private int proeficiencia = 2;
    
    public Classe(String nome, int nivel){
        this.nome = nome;
        this.nivel = nivel;
        calculoProeficiencia(nivel);
    }

    private void calculoProeficiencia(int nivel) {
        if (nivel >= 1 && nivel <= 4) {
            this.proeficiencia = 2;
        } else if (nivel >= 5 && nivel <= 8) {
            this.proeficiencia = 3;
        } else if (nivel >= 9 && nivel <= 12) {
            this.proeficiencia = 4;
        } else if (nivel >= 13 && nivel <= 16) {
            this.proeficiencia = 5;
        } else if (nivel >= 17 && nivel <= 20) {
            this.proeficiencia = 6;
        } else {
            System.out.println("Nível inexistente");
        }
    }
    

    public String getNome() {
        return nome;
    }

    public int getNivel(){
        return nivel;
    }

    public int getProeficiencia() {
        return proeficiencia;
    }
    
}
