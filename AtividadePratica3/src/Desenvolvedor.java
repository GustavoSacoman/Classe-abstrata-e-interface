public class Desenvolvedor extends Funcionario implements Trabalhavel {

//Atributos
    private String tecnologiaDominada;
    private double bonusPerfomance;
//COnstrutor
    public Desenvolvedor(String nome, int matricula, double salario, String tecnologiaDominada,
            double bonusPerfomance) {
        super(nome, matricula, salario);
        this.tecnologiaDominada = tecnologiaDominada;
        this.bonusPerfomance = bonusPerfomance;
    }

//Getters e setters
    public String geTecnologiaDominada() {
        return tecnologiaDominada;
    }


    public void setTecnologiaDominada(String teclogiaDominada) {
        this.tecnologiaDominada = teclogiaDominada;
    }

    public double getBonusPerfomance() {
        return bonusPerfomance;
    }
    
    public void setBonusPerfomance(double bonusPerfomance) {
        this.bonusPerfomance = bonusPerfomance;
    }

    
//metodo da abstrata
    @Override
    public double calcularSalarioTotal(){
        
        return bonusPerfomance + salario;
        
    }
//Mostra as informacoes da classe
    @Override
    public String toString() {
        return super.toString() + "\nTecnologia dominada: " + tecnologiaDominada + "\nBonus por entrega: " + bonusPerfomance 
                                + "\nSalario Total: R$" + calcularSalarioTotal() + "Trabalho do Desenvolvedor: " + trabalhar()
                                + "\nRelatar o processo: " + relatarProcesso();
    }
//metodo da interface
    @Override
    public String trabalhar() {
        return "\nCriando um novo projeto... E desenvolvendo na " + tecnologiaDominada + "!";
    }
//metodo da interface
    @Override
    public String relatarProcesso() {
        return"\nCriado novo projeto e concluido a programacao dele";
    }

}
