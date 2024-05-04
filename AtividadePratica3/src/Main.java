public class Main {
    
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente("Gusta", 456, 18000, 0.15, "T.I");
        Desenvolvedor d1 = new Desenvolvedor("Pedrinho",754, 3500, "C++",500);
        Estagiario e1 = new Estagiario("Joazinho",789, 1500, 6,"Gusta",500);
        System.out.println(g1);

        System.out.println(d1);
        System.out.println(e1);
    }
}
