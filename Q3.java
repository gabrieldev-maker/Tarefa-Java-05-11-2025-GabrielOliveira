import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        double litros, desc, valor, valor2;
        char tipo;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de litros vendidos: ");
        litros = scanner.nextDouble();
        System.out.print("Digite o tipo de combustível (A-Álcool, G-Gasolina): ");
        tipo = scanner.next() . toUpperCase().charAt(0);
        if(tipo == 'A' && litros <=25) {
            valor = litros*1.90;
            desc = valor*0.035;
            valor2 = valor - desc;
        }
        else if (tipo == 'A' && litros >25) {
            valor = litros*1.90;
            desc = valor*0.053;
            valor2 = valor - desc;
        }
        else if (tipo == 'G' && litros <=35) {
            valor = litros*2.50;
            desc = valor*0.04;
            valor2 = valor - desc;
        }
        else {
            valor = litros*2.50;
            desc = valor*0.06;
            valor2 = valor - desc;
        }
        scanner.close();
        System.out.println("Valor a ser pago: " + valor2);
    }
}
