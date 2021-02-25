package exercicio_3;

import exercicio_2.entities.Carga;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Carga> cargas = new ArrayList<>();
        cargas.add(new Carga(27500.0,18550.0, 200));
        cargas.add(new Carga(35410.0,8100.0, 554));
        cargas.add(new Carga(3650.0, 25700.0, 112));
        cargas.add(new Carga(5799.0, 9541.0,1580));
        cargas.add(new Carga(45000.0,25740.0, 321));
        cargas.add(new Carga(90570.0,5000.0, 627));
        cargas.add(new Carga(41000.0,8900.0, 876));

        SimulacaoCustoFrete smc = new SimulacaoCustoFrete(cargas);


        System.out.println("Serão necessarios:");
        System.out.printf("%d caminhões%n", smc.getCaminhoes());
        System.out.printf("%d vagões%n", smc.getVagoes());
        System.out.printf("Valor total $%.2f", smc.getTotal());


    }
}
