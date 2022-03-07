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

        if(valor1>valor2){
            System.out.print("Valor 1 é maior!");
        }else{
            System.out.print("Valor 2 é maior!");
        }













    }
}