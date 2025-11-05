import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorhoras, horastrab, iprenda, inss, salario, salarionovo;
        System.out.print("Digite o valor da hora trabalhada: ");
        valorhoras = scanner.nextDouble();  
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        horastrab = scanner.nextDouble();
        salario = valorhoras * horastrab;
        if (salario <= 1518) {
            iprenda = 0;
        }
        else if (salario <= 2700) {
            iprenda = salario*0.05;
        }
        else if (salario <= 3400 ) {
            iprenda = salario*0.10;
        }
        else {
            iprenda = salario*0.20;
        }
        inss = salario * 0.10;
        salarionovo = salario - iprenda - inss;
        System.out.println("Salário bruto: " + salario);
        System.out.println("Inss: " + inss);
        System.out.println("Imposto de renda: " + iprenda);
        System.out.println("Salário líquido: " + salarionovo);
        scanner.close();
    }
}
