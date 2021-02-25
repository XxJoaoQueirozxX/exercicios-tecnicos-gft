package exercicio_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = null;
        try {
            sc = new Scanner(System.in);


            int multiplicando = inputInt("Multiplicando: ", sc);
            if (!(numeroValido(multiplicando))){
                throw new IllegalArgumentException("O multiplicando tem de ser um número entre 0 e 3000.");
            }


            int inicioIntervalo = inputInt("Início do intervalo:", sc);
            if (!(numeroValido(inicioIntervalo))){
                throw new IllegalArgumentException("O numero de inicio tem de ser um número entre 0 e 3000.");
            }

            int fimIntervalo = inputInt("Fim do intervalo:", sc);
            if (!(numeroValido(inicioIntervalo))){
                throw new IllegalArgumentException("O numero de fim tem de ser um número entre 0 e 3000.");
            }

            if (inicioIntervalo > fimIntervalo){
                throw new IllegalArgumentException("O inicío do intervalo deve ser menor que seu fim");
            }

            if ((fimIntervalo - inicioIntervalo) > 10){
                throw new IllegalArgumentException("A diferença de intervalos não pode ser maior que 10");
            }


            for (int i = inicioIntervalo; i <= fimIntervalo; i++){
                System.out.printf("%d x %d = %d%n", multiplicando, i, (multiplicando * i));
            }


        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally {
            if (sc != null){
                sc.close();
            }
        }
    }


    public static boolean numeroValido(int n){
        return n <= 3000 && n >=0;
    }

    public static int inputInt(String msg, Scanner sc){
        System.out.print(msg);
        return sc.nextInt();
    }
}
