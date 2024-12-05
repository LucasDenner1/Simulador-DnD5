package Ficha.Equipamentos;

public class Armadura {
    private String nome;
    private int classeDeArmadura = 0;
    private int tipoArmadura;

    public Armadura(String nome, int classeDeArmadura, int tipoArmadura) {
        this.nome = nome;
        this.classeDeArmadura = classeDeArmadura;
        this.tipoArmadura = tipoArmadura;
    }

    public String getNome() {
        return nome;
    }

    public int getClasseDeArmadura() {
        return classeDeArmadura;
    }

    public int getTipoArmadura() {
        return tipoArmadura;
    }

    public String toString() {
        String Armadura = "";

        if(tipoArmadura == 1){
            Armadura = "Armadura Leve";
        }
        if(tipoArmadura == 2){
            Armadura = "Armadura Média";
        }
        if(tipoArmadura == 3){
            Armadura = "Armadura Pesada";
        }

        return String.format("%s : %s com %d de ca",Armadura,nome,classeDeArmadura);
    }
   
}
