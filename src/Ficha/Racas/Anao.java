package Ficha.Racas;

public class Anao extends Raca implements PeculiaridadesDaRaca{
    private int constituicao;
    public Anao(){
        super("Anão");
        this.constituicao = 2;
    }

    @Override
    public String toString() {
        String mensagem = String.format("Raça: %s",super.getNome());
        return mensagem;
    }

    @Override
    public void habilidadesRaca() {
        System.out.println();
    }

    public int getConstituicao() {
        return constituicao;
    }
    
}
