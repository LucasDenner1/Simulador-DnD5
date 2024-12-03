import Batalha.Dados.DadoGeral;
import Batalha.Dados.DadosDeDano;
import Ficha.Arma;
import Ficha.Personagem;
import Ficha.Classes.Guerreiro;
import Ficha.Racas.Anao;

public class App {
    public static void main(String[] args) throws Exception {
        
        Guerreiro guerreiro = new Guerreiro(10);
        Anao anao = new Anao();
        Arma arma = new Arma("Machado de 2 mãos",1,1,1,1);
        Personagem personagem = new Personagem("Denner", guerreiro, anao, arma);

        DadoGeral d20 = new DadoGeral();
        DadosDeDano dados = new DadosDeDano(arma.getD4(), arma.getD6(), arma.getD8(), arma.getD12());

        System.out.println(dados);


    }
}
