package Ficha.Classes;

public class Guerreiro extends Classe implements PeculiaridadesDaClasse{
    
    public Guerreiro(int nivel){
        super("Guerreiro",nivel);
    }

    @Override
    public int calcularVida() {
        return 10 + super.getProeficiencia();
    }

    
    public void statusClasse() {
        System.out.format("Nome: %s\nNivel: %d\nProeficiencia: %d",super.getNome(),super.getNivel(),super.getProeficiencia());
    }

}
