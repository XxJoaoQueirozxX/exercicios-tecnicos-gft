package exercicio_2.entities;

public class Carga {
    private Double valor;
    private Double peso;
    private int distancia;

    public Carga() {

    }

    public Carga(Double valor, Double peso) {
        this.valor = valor;
        this.peso = peso;
    }

    public Carga(Double valor, Double peso, int distancia){
        this.valor = valor;
        this.peso = peso;
        this.distancia = distancia;
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

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}
