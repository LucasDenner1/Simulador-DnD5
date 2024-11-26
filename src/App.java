import Ficha.Classes.Guerreiro;

public class App {
    public static void main(String[] args) throws Exception {
        
        Guerreiro guerreiro = new Guerreiro(10);

        guerreiro.calcularVida();
        guerreiro.statusClasse();
    }
}
