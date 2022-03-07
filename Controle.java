import java.util.Scanner;
public class Controle{
    public static void main(String[]args){
        int valor1;

        Scanner leitura=new Scanner(System.in);

        System.out.println("Digite um número");
        valor1=leitura.nextInt();

        switch (valor1){
            case 1:
                System.out.println("Valor =1");
                break;
            case 2:
                System.out.println("Valor =2");
                break;
            case 3:
                System.out.println("Valor =3");
                break;
            default:
                System.out.println("Nenhum dos 3 valores");

         }
    }
}       