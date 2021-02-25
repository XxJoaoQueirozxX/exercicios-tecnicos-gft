package exercicio_2;

import exercicio_2.entities.Caminhao;
import exercicio_2.entities.Carga;
import exercicio_2.entities.Vagao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso = inputDouble("Entre com o peso da carga em kgs (exemplo 2000.90): ", sc);
        double valor = inputDouble("Entre com o valor da carga (exemplo 5000.99):", sc);
        int distancia = inputInt("Entre com a distancia (exemplo 175):", sc);
        Carga carga = new Carga(valor, peso);

        System.out.println("====== Valores de frete ======");
        System.out.printf("Vagão: $%.2f%n", new Vagao(carga).calculaFrete(distancia));
        System.out.printf("Caminhão: $%.2f%n", new Caminhao(carga).calculaFrete(distancia));
        System.out.println("==============================");

        sc.close();
    }

    public static double inputDouble(String msg, Scanner sc){
        Locale.setDefault(Locale.US);
        System.out.print(msg);
        return sc.nextDouble();
    }

    public static int inputInt(String msg, Scanner sc){
        System.out.print(msg);
        return sc.nextInt();
    }
}
