package com.empresa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    @Test
    public void testVerificaCPFValido() {

        String cpf1, expectedOutput;
        boolean validade;
        cpf1 = "07229677300";
        expectedOutput = "CPF valido.";
        Funcionario funcionario = new Funcionario();
        PrintStream stdout = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream capturarStream = new PrintStream(outputStream);
        System.setOut(capturarStream);
        funcionario.validarCpf(cpf1);
        System.setOut(stdout);
        String capturado = outputStream.toString();
        validade = expectedOutput.equals(capturado);

        assertEquals(false, validade);
    }

    @Test
    public void testVerificaCPFInvalido() {
        String cpf1, expectedOutput;
        boolean validade;
        boolean vericacao = false;
        cpf1 = "123.456.678-9000";
        expectedOutput = "CPF invalido";
        Funcionario funcionario = new Funcionario();
        PrintStream stdout = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream capturarStream = new PrintStream(outputStream);
        System.setOut(capturarStream);
        funcionario.validarCpf(cpf1);
        System.setOut(stdout);
        String capturado = outputStream.toString();
        validade = expectedOutput.equals(capturado);
        assertEquals(vericacao, validade);
    }

    @Test
    public void testGetBonificacao(){
        Funcionario funcionario = new Funcionario();
        double bonificacaoMinimo = 316.8;  
        assertEquals(funcionario.getBonificacao(1320), bonificacaoMinimo);

    }
    @Test
    public void testCalcSalarioSalarioAte3000() {
        Funcionario funcionario = new Funcionario();
        double salario = 2500.00;
        double expected = 2075.00;

        // Chama o método que será testado
        funcionario.calcSalario(salario);

        // Verifica se o salário bruto foi calculado corretamente
        assertEquals(expected, funcionario.getSalarioBruto(), 0.001);
    }

    @Test
    public void testCalcSalarioSalarioMaior3000() {
        Funcionario funcionario = new Funcionario();
        double salario = 3001.00;
        double expected = 2190.73;

        // Chama o método que será testado
        funcionario.calcSalario(salario);

        // Verifica se o salário bruto foi calculado corretamente
        assertEquals(expected, funcionario.getSalarioBruto(), 0.001);
    }
}
