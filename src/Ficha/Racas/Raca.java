package Ficha.Racas;

public abstract class Raca {
    private String nome;
    private int idade;
    private float tamanho;
    private float deslocamento;
    
    public Raca(String nome, int idade, float tamanho, float deslocamento) {
        this.nome = nome;
        this.idade = idade;
        this.tamanho = tamanho;
        this.deslocamento = deslocamento;
    }

    public abstract int bonusForca();
    public abstract int bonusDestreza();
    public abstract int bonusConstituicao();
    public abstract int bonusInteligencia();
    public abstract int bonusSabedoria();
    public abstract int bonusCarisma();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public float getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(float deslocamento) {
        this.deslocamento = deslocamento;
    }
   



}
