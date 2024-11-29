package Ficha;

public class Arma {
    private String nome;
    private int dano;

    public Arma(String nome, int dano) {
        this.nome = nome;
        calcularDanoArma(dano);
    }

    public void calcularDanoArma(int dano){
        if(dano == 4){
            this.dano = dano; 
        }
        else if(dano == 6){
            this.dano = dano; 
        }
         else if(dano == 8){
            this.dano = dano; 
        }
        else if(dano == 12){
            this.dano = dano; 
            }
        else{
            System.err.println("Dado de dano inexistente!");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public String toString() {
        return String.format("%s com um d%d de dano",getNome(),getDano());
    }
    
}
