public class Estagiario extends Funcionario {
    
    private int horasTrabalho;
    private String supervisor;
    private int bonusConclucaoProjeto;

    public Estagiario(String nome, int matricula, double salario, int horasTrabalho, String supervisor,
            int bonusConclucaoProjeto) {
        super(nome, matricula, salario);
        this.horasTrabalho = horasTrabalho;
        this.supervisor = supervisor;
        this.bonusConclucaoProjeto = bonusConclucaoProjeto;
    }


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


    public int getBonusConclucaoProjeto() {
        return bonusConclucaoProjeto;
    }


    public void setBonusConclucaoProjeto(int bonusConclucaoProjeto) {
        this.bonusConclucaoProjeto = bonusConclucaoProjeto;
    }

    @Override
    public double calcularSalarioTotal(){
        return salario + bonusConclucaoProjeto;

    }

    @Override
    public String toString() {
        return super.toString() + "\nHoras diarias: " + horasTrabalho + "\nSupervisor: " + supervisor
                                + "\nBonus de conclusao de projeto: " + bonusConclucaoProjeto + "\nSalario total: " + calcularSalarioTotal();
    }

    
}
