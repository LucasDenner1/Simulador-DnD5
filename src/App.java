import Ficha.Personagem;
import Ficha.Classes.Guerreiro;
import Ficha.Racas.Anao;

public class App {
    public static void main(String[] args) throws Exception {
        
        Guerreiro guerreiro = new Guerreiro(10);
        Anao anao = new Anao();
        Personagem personagem = new Personagem("Denner", guerreiro, anao);

        System.out.println(personagem);
    }
}
