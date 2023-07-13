package com.empresa;

import java.util.Arrays;
import java.util.Calendar;

public class Analista extends Funcionario {
	private String[] diagrama;

	public Analista() {

		new Funcionario();
		this.diagrama = new String[5];
	}

	public Analista(String cpf, String nome, char sexo, double salario, Calendar dataNas, Calendar dataA,
			String[] analis) {

		this.setCPF(cpf);
		this.setNome(nome);
		this.setSexo(sexo);
		this.setSalarioBruto(salario);
		this.setDatadeNascimento(dataNas);
		this.setDatadeAdmissao(dataA);
		this.setDiagrama(analis);
	}

	public boolean dominaMesmaDiagrama(Analista pro) {

		if (pro.getDiagrama().equals(this.getDiagrama())) {
			return true;
		} else {

			return false;
		}
	}

	@Override
	public double getBonificacao(double salario) {
		double bonificacao = (salario * 12) * 0.03;

		return bonificacao;
	}

	@Override
	public String toString() {
		
		String dataEmTexto = formatador.format(getDatadeAdmissao().getTime());
		String dataEmText = formatador.format(getDatadeNascimento().getTime());
		
		return "___ Analista ___ \nLinguagem =" + Arrays.toString(diagrama) + "\nCPF = " + getCPF() + "\nNome =" + getNome() + "\nSexo =" + getSexo()
				+ "\nSalario bruto =" + getSalarioBruto() + "\nData de Nascimento =" + dataEmText + "\nData de Admissao = " + dataEmTexto;
	}

	public String[] getDiagrama() {
		return diagrama;
	}

	public void setDiagrama(String[] diagrama) {
		this.diagrama = diagrama;
	}

}
