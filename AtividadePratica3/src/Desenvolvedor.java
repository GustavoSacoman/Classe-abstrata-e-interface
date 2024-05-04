public class Desenvolvedor extends Funcionario {
    
    private String tecnologiaDominada;
    private double bonusPerfomance;

    public Desenvolvedor(String nome, int matricula, double salario, String tecnologiaDominada,
            double bonusPerfomance) {
        super(nome, matricula, salario);
        this.tecnologiaDominada = tecnologiaDominada;
        this.bonusPerfomance = bonusPerfomance;
    }


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

    

    @Override
    public double calcularSalarioTotal(){
        
        return bonusPerfomance + salario;
        
    }

    @Override
    public String toString() {
        return super.toString() + "\nTecnologia dominada: " + tecnologiaDominada + "\nBonus por entrega: " + bonusPerfomance 
                                + "\nSalario Total: " + calcularSalarioTotal();
    }

}
