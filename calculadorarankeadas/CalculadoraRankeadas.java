package calculadorarankeadas;

import java.util.Scanner;

public class CalculadoraRankeadas {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Informe seuas vitórias: ");
        int victories = keyboard.nextInt();
        System.out.println("Agora, informe suas derrotas: ");
        int defeats = keyboard.nextInt();


        String level = matches(victories, defeats);

        System.out.println("O herói tem saldo de " + (victories - defeats) + " e está com nível " + level);

        keyboard.close();
        }

        public static String matches(int victories, int defeats) {
           int balance = victories - defeats;
           String level ;

            //Estrutura if
            if (balance > 0 && balance <= 10) {
                level = "Ferro";
            } else if (balance > 10 && balance <= 20) {
                level = "Bronze";
            } else if (balance > 20 && balance <= 50) {
                level = "Prata";
            } else if (balance > 50 && balance <= 80) {
                level = "Ouro";
            } else if (balance > 80 && balance <= 90) {
                level = "Diamante";
            } else if (balance > 90 && balance <= 100) {
                level = "Lendaria";
            } else {
                level = "Imortal";
            }
            return level;
        }
    }