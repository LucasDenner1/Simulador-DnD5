package Ficha.Racas;

abstract class Raca {
    private String nome;
    private int idade;
    private float tamanho;
    private float deslocamento;
    private int constituicao;

    public Raca(String nome) {
        this.nome = nome;
        this.idade = 50;
        this.tamanho = 1.50f;
        this.deslocamento = 7.5f;
        this.constituicao = 2;
    }

    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }

    public float getTamanho() {
        return tamanho;
    }

    public float getDeslocamento() {
        return deslocamento;
    }

    public int getConstituicao() {
        return constituicao;
    }

}
