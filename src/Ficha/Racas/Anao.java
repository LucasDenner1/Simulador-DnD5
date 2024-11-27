package Ficha.Racas;

public class Anao extends Raca{

    public Anao(){
        super("Anão", 50 , 1.50f, 7.5f);
    }


    public void habilidadesRaca() {
        System.out.println("Visão no escuro");
    }

    
    @Override
    public int bonusForca() {
        return 0;
    }
    
    
    @Override
    public int bonusDestreza() {
        return 0;
    }
    
    
    @Override
    public int bonusConstituicao() {
        return 2;
    }
    
    
    @Override
    public int bonusInteligencia() {
        return 0;
    }
    
    
    @Override
    public int bonusSabedoria() {
        return 0;
    }
    
    
    @Override
    public int bonusCarisma() {
        return 0;
    }
    
    @Override
    public String toString() {
        String mensagem = String.format("Raça: %s",super.getNome());
        return mensagem;
    }
}
