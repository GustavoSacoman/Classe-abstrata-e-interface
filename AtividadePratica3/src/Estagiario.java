public class Estagiario extends Funcionario implements Trabalhavel {

//Atributos
    private int horasTrabalho;
    private String supervisor;
    private double bonusConclucaoProjeto;

//Contrutores
    public Estagiario(String nome, int matricula, double salario, int horasTrabalho, String supervisor,
            double bonusConclucaoProjeto) {
        super(nome, matricula, salario);
        this.horasTrabalho = horasTrabalho;
        this.supervisor = supervisor;
        this.bonusConclucaoProjeto = bonusConclucaoProjeto;
    }

//Getters e setters
    public int getHorasTrabalho() {
        return horasTrabalho;
    }


    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }


    public String getSupervisor() {
        return supervisor;
    }


    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }


    public double getBonusConclucaoProjeto() {
        return bonusConclucaoProjeto;
    }


    public void setBonusConclucaoProjeto(double bonusConclucaoProjeto) {
        this.bonusConclucaoProjeto = bonusConclucaoProjeto;
    }

//metodo da abstrata
    @Override
    public double calcularSalarioTotal(){
        return salario + bonusConclucaoProjeto;

    }

//Mostra valores da classe
    @Override
    public String toString() {
        return super.toString() + "\nHoras diarias: " + horasTrabalho + "\nSupervisor: " + supervisor
                                + "\nBonus de conclusao de projeto: " + bonusConclucaoProjeto + "\nSalario total: R$" + calcularSalarioTotal()
                                + "\nTrabalho do Gerente: " + trabalhar() + "\nRelatar o processo: " + relatarProcesso();
    }

//metodo da interface
    @Override
    public String trabalhar() {
        return "O supervisor " + supervisor + " pede para o estagiario ajudar o desenvolvedor para aprender a desenvolver softwares";
    }
    
//metodo da interface
    @Override
    public String relatarProcesso() {
       return "Estagiario ajudou a desenvolver um novo projeto";
    }
    
}
