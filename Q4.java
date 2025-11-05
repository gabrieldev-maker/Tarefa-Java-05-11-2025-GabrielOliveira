import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?",
            "Foi visto(a) nas proximidades do local do crime?",
            "Possui algum objeto da vítima?",
            "Tentou fugir após o crime?"
        };

        int positivas = 0;
        System.out.println("Responda 'sim' ou 'não' para as perguntas abaixo:\n");

        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.startsWith("s")) { // aceita "sim" ou qualquer resposta começando com 's'
                positivas++;
            }
        }

        System.out.println("Número de respostas positivas: " + positivas);

        if (positivas == 2) {
            System.out.println("Suspeito");
        } else if (positivas == 3 || positivas == 4) {
            System.out.println("Cúmplice");
        } else if (positivas >= 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        scanner.close();
    }
}
