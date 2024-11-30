package Ficha;

public class Arma {
    private String nome;
    private int quantidadeD4,quantidadeD6,quantidadeD8,quantidadeD12;

    public Arma(String nome, int d4, int d6, int d8, int d12) {
        this.nome = nome;
        this.quantidadeD4 = d4;
        this.quantidadeD6 = d6;
        this.quantidadeD8 = d8;
        this.quantidadeD12 = d12;
    }

    public String getNome() {
        return nome;
    }

    public int getD4() {
        return quantidadeD4;
    }

    public int getD6() {
        return quantidadeD6;
    }

    public int getD8() {
        return quantidadeD8;
    }

    public int getD12() {
        return quantidadeD12;
    }
  
}
