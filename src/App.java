import Ficha.Classes.Guerreiro;
import Ficha.Racas.Anao;

public class App {
    public static void main(String[] args) throws Exception {
        
        Guerreiro guerreiro = new Guerreiro(10);
        Anao anao = new Anao();
        
        System.out.println(anao);
        System.out.println(guerreiro);
    }
}
