package org.example;

public class DescontoLiquidacao implements Desconto {
    public float aplicarDesconto(float precoOriginal) {
        return precoOriginal * 0.7f;
    }
}