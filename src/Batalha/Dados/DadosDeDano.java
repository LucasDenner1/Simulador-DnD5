package Batalha.Dados;

import java.util.Random;

public class DadosDeDano {
private int quantidadeD4,  quantidadeD6,  quantidadeD8,  quantidadeD12;
private int danoTotal = 0;

public DadosDeDano(int quantidadeD4, int quantidadeD6, int quantidadeD8, int quantidadeD12) {
              
    this.quantidadeD4 = quantidadeD4;
    this.quantidadeD6 =  quantidadeD6;   
    this.quantidadeD8 =  quantidadeD8; 
    this.quantidadeD12 =  quantidadeD12;       
    rolarDados();

}

public void rolarDados(){

    int i;

    if(this.quantidadeD4>0){
        Random d4 = new Random();

        for(i=0;i<this.quantidadeD4;i++){
            this.danoTotal += d4.nextInt(4) + 1;
        }
        
    }
    if(this.quantidadeD6>0){
        Random d6 = new Random();

        for(i=0;i<this.quantidadeD6;i++){
            this.danoTotal += d6.nextInt(6) + 1;
        }
        
    }
     if(this.quantidadeD8>0){
        Random d8 = new Random();

        for(i=0;i<this.quantidadeD8;i++){
            this.danoTotal += d8.nextInt(8) + 1;
        }
        
    }
    if(this.quantidadeD12>0){
        Random d12 = new Random();

        for(i=0;i<this.quantidadeD12;i++){
            this.danoTotal += d12.nextInt(12) + 1;
        }
        
    }

}

public int getDanoTotal() {
    return danoTotal;
}

@Override
public String toString() {
    
    return String.format("Dano total: %d", danoTotal);
}

}
