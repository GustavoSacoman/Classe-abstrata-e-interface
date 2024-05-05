public class Gerente extends Funcionario implements Trabalhavel {
    
//Bonus anual sera em porcentagem
//Atributos

    private double bonusAnual;
    private String equipeDoGerente;
    
//Construtor
    public Gerente(String nome, int matricula, double salario, double bonusAnual, String equipeDoGerente) {
        super(nome, matricula, salario);
        this.bonusAnual = bonusAnual;
        this.equipeDoGerente = equipeDoGerente;
    }

//Getters e setters
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

//metodo da abstrata
    @Override
    public double calcularSalarioTotal(){

        double temp = salario + (bonusAnual * salario);
        return temp;
    }

//Mostra as informacoes da classe
    @Override
    public String toString() {
        return super.toString() + "\nBonus Anual: " + bonusAnual + "\nEquipe gerenciada: " + equipeDoGerente 
                                + "\nSalario total: R$" + calcularSalarioTotal() + "\nTrabalho do Gerente: " + trabalhar() 
                                + "\nRelatar o processo: " + relatarProcesso();
    }

//metodo da interface
    @Override
    public String trabalhar() {
        return"Projetando a criando planos de acao para a equipe(" + equipeDoGerente + ") que ele comanda ";
    }
    
//metodo da interface
    @Override
    public String relatarProcesso() {
        return"Criado todo o plano de acao para dividir a equipe e conseguir tempo para a entrega do projeto";
    }
}
