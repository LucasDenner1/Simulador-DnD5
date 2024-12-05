import Batalha.Dados.DadoGeral;
import Batalha.Dados.DadosDeDano;
import Ficha.Atributos;
import Ficha.Personagem;
import Ficha.Classes.Guerreiro;
import Ficha.Equipamentos.Arma;
import Ficha.Equipamentos.Armadura;
import Ficha.Racas.Anao;

public class App {
    public static void main(String[] args) throws Exception {
        
        Atributos atributos = new Atributos(15, 14, 13, 12, 10, 8);

        Guerreiro guerreiro = new Guerreiro(10);
        Anao anao = new Anao();
        Arma arma = new Arma("Machado de 2 mãos",0,0,0,1);
        Armadura armadura = new Armadura("Couro Batido", 12, 2);
        Personagem personagem = new Personagem("Denner",atributos, guerreiro, anao, arma, armadura);

        DadoGeral d20 = new DadoGeral();
        DadosDeDano dados = new DadosDeDano(arma.getD4(), arma.getD6(), arma.getD8(), arma.getD12());

        System.out.println(personagem);
        
    }
}
