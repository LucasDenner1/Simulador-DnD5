package Ficha;
import java.util.Scanner;

import Ficha.Classes.*;
import Ficha.Racas.*;

public class Personagem {
    private String nome;
    private Classe classe;
    private Raca raca;
    private int forca,destreza,constituicao,inteligencia,sabedoria,carisma;

    public Personagem(String nome, Classe classe, Raca raca) {
        this.nome = nome;
        this.classe = classe;
        this.raca = raca;
        this.forca = 0;
        this.destreza = 0;
        this.constituicao = 0;
        this.inteligencia = 0;
        this.sabedoria = 0;
        this.carisma = 0;

        distribuirAtributos();
        aplicarBonusRaca();
    }

   public void distribuirAtributos() {
    Scanner scanner = new Scanner(System.in);

   
    int[] valores = {15, 14, 13, 12, 10, 8};
    String[] nomesAtributos = {"Força", "Destreza", "Constituição", "Inteligência", "Sabedoria", "Carisma"};
    int[] atributosDistribuidos = new int[6]; 

    System.out.println("Distribua os seguintes valores nos atributos: 15, 14, 13, 12, 10, 8.");

    for (int i = 0; i < nomesAtributos.length; i++) {
        boolean valido = false;

        while (!valido) {
            System.out.printf("Escolha o valor para %s: ", nomesAtributos[i]);
            int valor = scanner.nextInt();

            for (int j = 0; j < valores.length; j++) {
                if (valores[j] == valor) {
                    atributosDistribuidos[i] = valor;
                    valores[j] = -1; 
                    valido = true;
                    break;
                }
            }

            if (!valido) {
                System.out.println("Valor inválido ou já utilizado. Tente novamente.");
            }
        }
    }

    this.forca = atributosDistribuidos[0];
    this.destreza = atributosDistribuidos[1];
    this.constituicao = atributosDistribuidos[2];
    this.inteligencia = atributosDistribuidos[3];
    this.sabedoria = atributosDistribuidos[4];
    this.carisma = atributosDistribuidos[5];
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
            "  Carisma: %d",
            nome,
            classe.getNome(), 
            raca.getNome(),  
            forca,
            destreza,
            constituicao,
            inteligencia,
            sabedoria,
            carisma
        );
    }
    
    
}
