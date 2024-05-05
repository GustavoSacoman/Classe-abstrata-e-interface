import java.util.ArrayList;
import java.util.List;

public class GerenciarFuncionarios {
    
    public static List<Funcionario> listaFuncionarios = new ArrayList<>();


    public static void adicionarFuncionario(Funcionario f1){
        listaFuncionarios.add(f1);
    }
    public static void removerFuncionario(Funcionario f1){
        listaFuncionarios.remove(f1);
    }

    public static void listarTodosFuncionario(){
        for(Funcionario f1: listaFuncionarios){
            System.out.println(f1);
        }
    }

}
