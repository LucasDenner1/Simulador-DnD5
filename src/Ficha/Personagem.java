package Ficha;

import Batalha.Dados.DadosDeDano;
import Ficha.Classes.*;
import Ficha.Racas.*;

public class Personagem {
    private String nome;
    private Classe classe;
    private Raca raca;
    private Arma arma;
    private int forca,destreza,constituicao,inteligencia,sabedoria,carisma;

    public Personagem(String nome, Classe classe, Raca raca, Arma arma) {
        this.nome = nome;
        this.classe = classe;
        this.raca = raca;
        this.arma = arma;
        this.forca = 0;
        this.destreza = 0;
        this.constituicao = 0;
        this.inteligencia = 0;
        this.sabedoria = 0;
        this.carisma = 0;

        aplicarBonusRaca();
    }

    public void aplicarBonusRaca(){
        this.forca += raca.bonusForca();
        this.destreza += raca.bonusDestreza();
        this.constituicao += raca.bonusConstituicao();
        this.inteligencia += raca.bonusInteligencia();
        this.sabedoria += raca.bonusSabedoria();
        this.carisma += raca.bonusCarisma();
    }

    

    public String getNome() {
        return nome;
    }

    public Classe getClasse() {
        return classe;
    }

    public Raca getRaca() {
        return raca;
    }
    
    public Arma getArma() {
        return arma;
    }
    
    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }
    
    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    @Override
    public String toString() {
        return String.format(
            "Nome do personagem: %s\n" +
            "Classe: %s\n" +
            "Raça: %s\n" +
            "Atributos:\n" +
            "  Força: %d\n" +
            "  Destreza: %d\n" +
            "  Constituição: %d\n" +
            "  Inteligência: %d\n" +
            "  Sabedoria: %d\n" +
            "  Carisma: %d\n"+
            "Arma: %s\n"+
            "Dano: 1d%d",
            nome,
            classe.getNome(), 
            raca.getNome(),  
            forca,
            destreza,
            constituicao,
            inteligencia,
            sabedoria,
            carisma,
            arma.getNome(),
            arma.getDano()
        );
    }

    
}
