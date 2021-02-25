package exercicio_2.entities;

public class Carga {
    private Double valor;
    private Double peso;


    public Carga() {

    }

    public Carga(Double valor, Double peso) {
        this.valor = valor;
        this.peso = peso;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
