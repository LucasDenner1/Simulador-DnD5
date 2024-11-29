import Ficha.Arma;
import Ficha.Personagem;
import Ficha.Classes.Guerreiro;
import Ficha.Racas.Anao;

public class App {
    public static void main(String[] args) throws Exception {
        
        Guerreiro guerreiro = new Guerreiro(10);
        Anao anao = new Anao();
        Arma arma = new Arma("Machado de 2 mãos",12);

        Personagem personagem = new Personagem("Denner", guerreiro, anao, arma);

        System.out.println(personagem);
    }
}
