package Ficha.Classes;

public class Guerreiro extends Classe{
    
    public Guerreiro(int nivel){
        super("Guerreiro",nivel);
        calcularVida();
    }

    public int calcularVida() {
        return 10 + super.getProeficiencia();
    }

    public String toString() {
        String mensagem = String.format("Classe: %s\nNivel: %d\nProeficiencia: %d",super.getNome(),super.getNivel(),super.getProeficiencia());
        return mensagem;
    }

}
