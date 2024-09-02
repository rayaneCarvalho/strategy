package org.example;

public class Produto {

    private float precoOriginal;

    public Produto(float precoOriginal) {
        this.precoOriginal = precoOriginal;
    }

    public float calcularPrecoFinal(Desconto desconto) {
        return desconto.aplicarDesconto(precoOriginal);
    }
}

