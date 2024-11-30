package Batalha.Dados;

import java.util.Random;

public class DadoGeral {
    private int resultadoDoDado;
    private boolean resultadoCritico;

    public DadoGeral() {
        rolarDado();
    }

    public void rolarDado(){
    Random d20 = new Random();

    this.resultadoDoDado = d20.nextInt(20) + 1;

    if(resultadoDoDado == 20 || resultadoDoDado == 1){
        this.resultadoCritico = true;
    }

    }

    public int getResultadoDoDado() {
        return resultadoDoDado;
    }

    public boolean isResultadoCritico() {
        return resultadoCritico;
    }

    @Override
    public String toString() {
        return String.format("d20 : %d\n" + "Critico [%b]",resultadoDoDado,resultadoCritico);
    }


}
