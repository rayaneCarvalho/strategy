package org.example;

public class DescontoVip implements Desconto {
    public float aplicarDesconto(float precoOriginal) {
        return precoOriginal * 0.8f;
    }
}
