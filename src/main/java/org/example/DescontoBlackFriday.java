package org.example;

public class DescontoBlackFriday implements Desconto {
    public float aplicarDesconto(float precoOriginal) {
        return precoOriginal * 0.5f;
    }
}
