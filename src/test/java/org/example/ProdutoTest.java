package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveAplicarDescontoBlackFriday() {
        Produto produto = new Produto(1000.0f);
        float precoComDesconto = produto.calcularPrecoFinal(new DescontoBlackFriday());
        assertEquals(500.0f, precoComDesconto);
    }

    @Test
    void deveAplicarDescontoVip() {
        Produto produto = new Produto(1000.0f);
        float precoComDesconto = produto.calcularPrecoFinal(new DescontoVip());
        assertEquals(800.0f, precoComDesconto);
    }

    @Test
    void deveAplicarDescontoLiquidacao() {
        Produto produto = new Produto(1000.0f);
        float precoComDesconto = produto.calcularPrecoFinal(new DescontoLiquidacao());
        assertEquals(700.0f, precoComDesconto);
    }

    @Test
    void deveAplicarSemDesconto() {
        Produto produto = new Produto(1000.0f);
        float precoSemDesconto = produto.calcularPrecoFinal(new SemDesconto());
        assertEquals(1000.0f, precoSemDesconto);
    }
}
