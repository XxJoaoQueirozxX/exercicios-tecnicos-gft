package exercicio_2.entities;

public class Vagao extends Transporte{

    public Vagao(Carga carga) {
        super(carga);
    }

    @Override
    public Double calculaFrete(int distancia) {
        Double valor = (getCarga().getPeso() * 0.07) + (getCarga().getValor() * 0.01) + (0.5 * distancia);
        if (getCarga().getPeso() < 15000.0){
            valor += 5000.0;
        }
        return valor;
    }
}
