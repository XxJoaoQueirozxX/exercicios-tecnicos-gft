package exercicio_2.entities;

import exercicio_2.entities.Carga;

public abstract class Transporte {
    private Carga carga;


    public Transporte(Carga carga){
        this.carga = carga;
    }

    public abstract Double calculaFrete(int distancia);

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }
}
