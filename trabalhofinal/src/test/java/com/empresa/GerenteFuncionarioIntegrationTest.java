package com.empresa;
import org.junit.Test;

import java.util.Arrays;
import java.util.Calendar;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

public class GerenteFuncionarioIntegrationTest {

    @Test
    public void testDominaMesmasMetodologias() {
        Gerente gerente1 = new Gerente();
        gerente1.setMetodologiaDesenvolvimento(new String[]{"Metodologia 1", "Metodologia 2", "Metodologia 3"});

        Gerente gerente2 = new Gerente();
        gerente2.setMetodologiaDesenvolvimento(new String[]{"Metodologia 1", "Metodologia 2", "Metodologia 3"});

        assertTrue(gerente1.dominaMesmasMetodologias(gerente2));
    }

    @Test
    public void testNaoDominaMesmasMetodologias() {
        Gerente gerente1 = new Gerente();
        gerente1.setMetodologiaDesenvolvimento(new String[]{"Metodologia 1", "Metodologia 2"});

        Gerente gerente2 = new Gerente();
        gerente2.setMetodologiaDesenvolvimento(new String[]{"Metodologia 1", "Metodologia 3"});

        assertFalse(gerente1.dominaMesmasMetodologias(gerente2));
    }

    @Test
    public void testGetBonificacao() {
        Gerente gerente = new Gerente();
        double salario = 5000.00;
        double expectedBonificacao = (salario * 12) * 0.05;

        double bonificacao = gerente.getBonificacao(salario);

        assertEquals(expectedBonificacao, bonificacao, 0.001);
    }
}
