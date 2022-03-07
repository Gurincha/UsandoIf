import java.util.Scanner;
public class UsandoIf{
    public static void main(String[] args) {
        
        int valor1;
        int valor2;

        Scanner lendo=new Scanner(System.in);


        System.out.println("Digite um valor: ");
        valor1 = lendo.nextInt();
        System.out.println("Digite outro valor");
        valor2 = lendo.nextInt();

        // isso é um if usando apenas uma linha 
        System.out.println(valor1>valor2 ? valor1+" é maior" : valor2+" é maior");

        if(valor1>valor2){
            System.out.print(valor1+" é maior!");
        }else{
            System.out.print(valor2+" é maior!");
        }
    }
}