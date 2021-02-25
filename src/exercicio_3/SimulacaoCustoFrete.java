package exercicio_3;

import exercicio_2.entities.Caminhao;
import exercicio_2.entities.Carga;
import exercicio_2.entities.Vagao;

import java.util.List;

public class SimulacaoCustoFrete {
    private List<Carga> cargas;
    private double total;
    private int vagoes;
    private int caminhoes;


    public List<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(List<Carga> cargas) {
        this.cargas = cargas;
        calcularValores();
    }


    private void calcularMelhorFreteCarga(Carga carga){
        double caminhaFrete = new Caminhao(carga).calculaFrete(carga.getDistancia());
        double vagaoFrete = new Vagao(carga).calculaFrete(carga.getDistancia());

        if (caminhaFrete > vagaoFrete){
            this.vagoes += 1;
            this.total += vagaoFrete;
        } else if (caminhaFrete <= vagaoFrete){
            this.total += caminhaFrete;
            this.caminhoes += 1;
        }
    }

    public SimulacaoCustoFrete(List<Carga> cargas) {
        this.cargas = cargas;
        this.calcularValores();
    }

    public SimulacaoCustoFrete() {
    }


    public double getTotal() {
        return total;
    }

    public int getVagoes() {
        return vagoes;
    }

    public int getCaminhoes() {
        return caminhoes;
    }

    public void calcularValores(){
        this.total = 0;
        this.caminhoes = 0;
        this.vagoes = 0;
        for (Carga carga : this.cargas) {
            calcularMelhorFreteCarga(carga);
        }
    }
}
