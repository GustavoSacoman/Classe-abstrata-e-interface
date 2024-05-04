public class Gerente extends Funcionario {
    
//Bonus anual sera em porcentagem
    private double bonusAnual;
    private String equipeDoGerente;
    

    public Gerente(String nome, int matricula, double salario, double bonusAnual, String equipeDoGerente) {
        super(nome, matricula, salario);
        this.bonusAnual = bonusAnual;
        this.equipeDoGerente = equipeDoGerente;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }
    public String getEquipeDoGerente() {
        return equipeDoGerente;
    }
    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
    public void setEquipeDoGerente(String equipeDoGerente) {
        this.equipeDoGerente = equipeDoGerente;
    }

    @Override
    public double calcularSalarioTotal(){

        double temp = salario + (bonusAnual * salario);
        return temp;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBonus Anual: " + bonusAnual + "\nEquipe gerenciada: " + equipeDoGerente 
                                + "\nSalario total: " + calcularSalarioTotal();
    }
}
