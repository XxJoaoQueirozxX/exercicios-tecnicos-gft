package exercicio_2.entities;

public class Caminhao extends Transporte{

    public Caminhao(Carga carga) {
        super(carga);
    }


    @Override
    public Double calculaFrete(int distancia) {
        Double valor = (getCarga().getPeso() * 0.02) + (getCarga().getValor() * 0.03) + (2 * distancia);
        if (getCarga().getValor() > 40000.0){
            valor *= 0.75;
        }
        return valor;
    }



}
