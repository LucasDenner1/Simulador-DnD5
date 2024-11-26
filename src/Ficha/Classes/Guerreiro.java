package Ficha.Classes;

public class Guerreiro extends Classe implements PeculiaridadesDaClasse{
    
    public Guerreiro(int nivel){
        super("Guerreiro",nivel);
        calcularVida();
    }

    @Override
    public int calcularVida() {
        return 10 + super.getProeficiencia();
    }

    
    public String toString() {
        String mensagem = String.format("Classe: %s\nNivel: %d\nProeficiencia: %d",super.getNome(),super.getNivel(),super.getProeficiencia());
        return mensagem;
    }

}
