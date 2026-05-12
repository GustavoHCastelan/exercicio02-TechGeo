package br.techgeo.figura;

import br.techgeo.ponto.Ponto;

public class Circulo extends Figura {
    private Ponto ponto;
    private double raio;

    public Circulo(Ponto ponto, double raio) {
        this.ponto = ponto;
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public Ponto getPonto() {
        return ponto;
    }
    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    @Override
    public String toString() {
        return "===== Circulo =====" +
                "\n Ponto: " + ponto +
                "\n Raio: " + raio;
    }

    public double calcularArea () {
        return Math.PI * Math.pow(raio, 2);
    }
}
