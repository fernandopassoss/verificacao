package com.empresa;

import java.util.Arrays;
import java.util.Calendar;

public class Gerente extends Funcionario {
	private String[] metodologiaDesenvolvimento;

	public Gerente() {

		new Funcionario();
		this.metodologiaDesenvolvimento = new String[5];
	}

	public Gerente(String cpf, String nome, char sexo, double salario, Calendar dataNas, Calendar dataA,
			String[] gere) {

		this.setCPF(cpf);
		this.setNome(nome);
		this.setSexo(sexo);
		this.setSalarioBruto(salario);
		this.setDatadeNascimento(dataNas);
		this.setDatadeAdmissao(dataA);
		this.setMetodologiaDesenvolvimento(gere);
	}

	public boolean dominaMesmasMetodologias(Gerente pro) {

		if (pro.getMetodologiaDesenvolvimento().equals(this.getMetodologiaDesenvolvimento())) {
			return true;
		} else {

			return false;
		}
	}
	
	@Override
	public double getBonificacao(double salario) {
		
		double bonificacao = (salario * 12) * 0.05;

		return bonificacao;
	}
	
	@Override
	public String toString() {
		
		String dataEmTexto = formatador.format(getDatadeAdmissao().getTime());
		String dataEmText = formatador.format(getDatadeNascimento().getTime());
		
		return "___ Gerente ___ \nLinguagem =" + Arrays.toString(metodologiaDesenvolvimento) + "\nCPF = " + getCPF() + "\nNome =" + getNome() + "\nSexo =" + getSexo()
				+ "\nSalario bruto =" + getSalarioBruto() + "\nData de Nascimento =" + dataEmText + "\nData de Admissao = " + dataEmTexto;
	}

	public String[] getMetodologiaDesenvolvimento() {
		return metodologiaDesenvolvimento;
	}

	public void setMetodologiaDesenvolvimento(String[] metodologiaDesenvolvimento) {
		this.metodologiaDesenvolvimento = metodologiaDesenvolvimento;
	}
	
	

	
}
