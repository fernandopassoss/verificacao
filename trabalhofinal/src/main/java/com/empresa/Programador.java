package com.empresa;

import java.util.Arrays;
import java.util.Calendar;

public class Programador extends Funcionario {
	private String[] linguagem;

	public Programador() {
		
		new Funcionario();
		this.linguagem = new String[5];
	}
	
	public Programador(String cpf, String nome, char sexo, double salario, Calendar dataNas, Calendar dataA, String[] ling) {

		this.setCPF(cpf);
		this.setNome(nome);
		this.setSexo(sexo);
		this.setSalarioBruto(salario);
		this.setDatadeNascimento(dataNas);
		this.setDatadeAdmissao(dataA);
		this.setLinguagem(ling);
	}
	
	public boolean programaMesmasLinguagens(Programador pro) {
		
		if(pro.getLinguagem().equals(this.getLinguagem())) {
			return true;
		} else {
			
			return false;
		}
	}
	
	@Override
	public String toString() {
		
		String dataEmTexto = formatador.format(getDatadeAdmissao().getTime());
		String dataEmText = formatador.format(getDatadeNascimento().getTime());
		
		return " \n___ Programador ___ \nLinguagem = " + Arrays.toString(linguagem) + "\nCPF = " + getCPF() + "\nNome = " + getNome() + "\nSexo = " + getSexo()
				+ "\nSalario bruto = " + getSalarioBruto() + "\nData de Nascimento = " + dataEmText + "\nData de Admissao = " + dataEmTexto;
	}

	public String[] getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String[] linguagem) {
		this.linguagem = linguagem;
	}
	
	
	

}
