package Ficha;

import Ficha.Classes.*;
import Ficha.Equipamentos.Arma;
import Ficha.Equipamentos.Armadura;
import Ficha.Racas.*;

public class Personagem {
    private String nome;
    private Classe classe;
    private Raca raca;
    private Arma arma;
    private Armadura armadura;
    private Atributos atributos;

    public Personagem(String nome, Atributos atributos, Classe classe, Raca raca, Arma arma, Armadura armadura) {
        this.nome = nome;
        this.classe = classe;
        this.raca = raca;
        this.arma = arma;
        this.armadura = armadura;
        this.atributos = atributos;

        aplicarBonusRaca();
    }

    public void aplicarBonusRaca(){

        int forca,destreza,constituicao,inteligencia,sabedoria,carisma;

        forca = atributos.getForca() + raca.bonusForca();
        destreza = atributos.getDestreza() + raca.bonusDestreza();
        constituicao = atributos.getConstituicao() + raca.bonusConstituicao();
        inteligencia = atributos.getInteligencia() + raca.bonusInteligencia();
        sabedoria = atributos.getSabedoria() + raca.bonusSabedoria();
        carisma = atributos.getCarisma() + raca.bonusCarisma();

        atributos.setForca(forca);
        atributos.setDestreza(destreza);
        atributos.setConstituicao(constituicao);
        atributos.setInteligencia(inteligencia);
        atributos.setSabedoria(sabedoria);
        atributos.setCarisma(carisma);

    }
    

    public String getNome() {
        return nome;
    }

    public Atributos getAtributos(){
        return atributos;
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
 
    public Armadura getArmadura() {
        return armadura;
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
            "Armadura: %s\n"+
            "CA: %d",
            nome,
            classe.getNome(), 
            raca.getNome(),  
            atributos.getForca(),
            atributos.getDestreza(),
            atributos.getConstituicao(),
            atributos.getInteligencia(),
            atributos.getSabedoria(),
            atributos.getCarisma(),
            arma.getNome(),
            armadura.getNome(),
            armadura.getClasseDeArmadura()
        );
    }


    
}
