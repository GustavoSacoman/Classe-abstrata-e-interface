import java.util.Scanner;

public class Console {
    

    public static Scanner scanner = new Scanner(System.in);

    public static int lerInt(){
       
       
        int temp;
        
        try {
             temp = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Escreva um numero inteiro, tente novamente!");
            scanner.nextLine();
            temp = scanner.nextInt();
        }

        return temp;
    }
    public static String leString(){ 
        
        return scanner.nextLine();

    }
    public static double lerDouble(){
       
       
        double temp;
        
        try {
             temp = scanner.nextDouble();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Escreva um numero double, tente novamente!");
           
            scanner.nextLine();
            temp = scanner.nextDouble();
            scanner.nextLine();
        }
        return temp;
}
}
