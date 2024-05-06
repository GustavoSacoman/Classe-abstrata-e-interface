
package interface_usuario;


import controle.GerenciarFuncionarios;
import models.Desenvolvedor;
import models.Estagiario;
import models.Funcionario;
import models.Gerente;

public class InterfaceUsuario {

    //Inicia o programa
    public static void iniciarPrograma(){

        int opcoes = 0;
        do
        {
            menu();
            opcoes = Console.lerInt();
            verificaOpcoes(opcoes);
        }while(opcoes != 0);
    }
    //menu inicial
    public static void menu(){
        System.out.println("\n###Menu###");
        System.out.println("1-Adicionar funcionario");
        System.out.println("2-Deletar funcionario");
        System.out.println("3-exibir todos os funcionario");
        System.out.println("4-Buscar funcionario");
        System.out.println("0-Sair");
        System.out.print("Digite uma das opcoes: ");
       
        
    }
//Verifica as opcoes do usuario 
    public static void verificaOpcoes(int opcoes){
        switch (opcoes) {
            case 1:
                menuAdicionar();
                opcoes = Console.lerInt();
                adicionaFuncionario(opcoes);
                break;
            case 2:
                removerfuncionario();
            break;
            case 3:
            exibirFuncionarios();
            break;
            case 4:
            buscarFuncionario();
            default:
                break;
        }
    }
//Menu secundario para adicionar funcionarios
    public static void menuAdicionar(){
        System.out.println("\n###Menu###");
        System.out.println("1-Adicionar gerente");
        System.out.println("2-Adicionar Desenvolvedor");
        System.out.println("3-Adicionar estagiario");
        System.out.println("4-Cancelar");
        System.out.print("Digite uma das opcoes: ");

    }

//Funcao que adiciona funcionarios
    public static void adicionaFuncionario(int opcoes){
        switch (opcoes) {
            case 1:
            System.out.print("\nDigite o nome: ");
            String nome = Console.leString();   

            System.out.print("Digite a matricula: ");
            int matricula = Console.lerInt();

            System.out.print("Digite o salario(Nao utilize ponto e sim virgula): ");
            double salario = Console.lerDouble();

            System.out.print("Digite o bonus anual(Nao utilize ponto e sim virgula)(em porcentagem. Exemplo 10% = 0.1): ");
            double bonus = Console.lerDouble();

            System.out.print("Digite a equipe: ");
            String equipe = Console.leString();

            Gerente g1 = new Gerente(nome, matricula, salario, bonus, equipe);
            GerenciarFuncionarios.adicionarFuncionario(g1);
            break;
            
            case 2:
            System.out.print("\nDigite o nome: ");
            nome = Console.leString();   

            System.out.print("Digite a matricula: ");
            matricula = Console.lerInt();

            System.out.print("Digite o salario(Nao utilize ponto e sim virgula): ");
            salario = Console.lerDouble();

            System.out.print("Digite a tecnologia dominada: ");
            String tecnologia = Console.leString();

            System.out.print("Digite o bonus por performance(Nao utilize ponto e sim virgula)(valor normal): ");
            bonus = Console.lerDouble();

            Desenvolvedor d1 = new Desenvolvedor(nome, matricula, salario, tecnologia, bonus);
            GerenciarFuncionarios.adicionarFuncionario(d1);
            break;
            
            case 3:
            System.out.print("\nDigite o nome: ");
            nome = Console.leString();   

            System.out.print("Digite a matricula: ");
            matricula = Console.lerInt();

            System.out.print("Digite o salario(Nao utilize ponto e sim virgula): ");
            salario = Console.lerDouble();

            System.out.print("Digite a quantidade de horas trabalhadas: ");
            int horas = Console.lerInt();

            System.out.print("Digite o supervisor: ");
            String supervirsor = Console.leString();

            System.out.print("Digite o bonus de conclucao de projeto(Nao utilize ponto e sim virgula)(valor normal): ");
            bonus = Console.lerDouble();

            Estagiario e1 = new Estagiario(nome, matricula, salario, horas, supervirsor, bonus);
            GerenciarFuncionarios.adicionarFuncionario(e1);
            break;
            default:
            System.out.println("Digite uma opcao valida!!");
                break;
        }
    }
//Funcao que remove funcionarios
    public static void removerfuncionario(){

        if (GerenciarFuncionarios.listaFuncionarios.isEmpty()) {
            System.out.println("\nA lista esta vazia, Adicione algo para buscar!!");
            return;
        }
        System.out.print("\nDigite a matricula do funcionario a ser removido: ");
        int matricula = Console.lerInt();
       
        for(Funcionario f1 : GerenciarFuncionarios.listaFuncionarios){
            if(matricula == f1.getMatricula()){
               
                GerenciarFuncionarios.removerFuncionario(f1);
                System.out.println("Funcionario removido com sucesso!\n");
                return;
            }
            else{
                System.out.println("Usuario nao encontrado");
            }
        }
    }
//Funcao que exibi todos os funcionarios
    public static void exibirFuncionarios(){
        if (GerenciarFuncionarios.listaFuncionarios.isEmpty()) {
            System.out.println("\nA lista esta vazia, Adicione algo para exibir!!");
            return;
        }
        for(Funcionario f1 : GerenciarFuncionarios.listaFuncionarios){
            System.out.println("\n");
            System.out.println(f1);
        }

    }
//Funcao que busca e exibi um determinado funcionario
    public static void buscarFuncionario(){

        if (GerenciarFuncionarios.listaFuncionarios.isEmpty()) {
            System.out.println("\nA lista esta vazia, Adicione algo para buscar!!");
            return;
        }
        System.out.print("\nDigite a matricula do funcionario a ser procurado: ");
        int matricula = Console.lerInt();

        for(Funcionario f1 : GerenciarFuncionarios.listaFuncionarios){
            if(matricula == f1.getMatricula()){
               
                System.out.println("\nFuncionario encontrado!\n\n");
                System.out.println(f1);

                return;
            }
            else{
                System.out.println("Usuario nao encontrado");
            }
        }

    }
 
}
