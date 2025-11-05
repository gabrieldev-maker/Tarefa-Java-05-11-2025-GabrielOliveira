import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario, aumento, percentual;
        System.out.print("Digite o salário do funcionário: ");
        salario = scanner.nextDouble();
        if (salario <= 280) {
            percentual = 0.20;
            aumento = salario * percentual;
        }
        else if (salario>280 && salario<=700) {
            percentual = 015;
            aumento = salario * percentual;
        }
        else if (salario>700 && salario<=1500) {
            percentual = 0.10;
            aumento = salario * percentual;
        }
        else {
            percentual = 0.05;
            aumento = salario * percentual;
        }
        System.out.println("Salário antes do reajuste: " + salario);
        System.out.println("Percentual de aumento aplicado: " + (percentual * 100) + "%");
        System.out.println("Vaalor do aumento: " + aumento);
        System.out.println("Novo salário, após o aumento: " + (salario + aumento));
        scanner.close();
    }
}
