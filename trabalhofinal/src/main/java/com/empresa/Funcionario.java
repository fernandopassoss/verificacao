package com.empresa;

import java.util.*;
import java.text.SimpleDateFormat;

public class Funcionario {

	Scanner input = new Scanner(System.in);
	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	GregorianCalendar data1 = new GregorianCalendar();

	protected String CPF;
	protected String nome;
	protected char sexo;
	protected double salarioBruto;
	protected Calendar datadeNascimento;
	protected Calendar datadeAdmissao;
	protected int idade;

	public Funcionario() {

		Calendar data = Calendar.getInstance();

		int dia = data.get(Calendar.DAY_OF_MONTH);
		int mes = data.get(Calendar.MONTH);
		int ano = data.get(Calendar.YEAR);

		data1.set(ano, mes, dia);

		this.datadeAdmissao = data;

	}

	public Funcionario(String cpf, String nome, Calendar datadeAd) {

		this.datadeAdmissao = datadeAd;
		this.CPF = cpf;
		this.nome = nome;

	}

	public Funcionario(String cpf, String nome, char sexo, double salario, Calendar dataNas, Calendar dataA) {

		this.CPF = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.salarioBruto = salario;
		this.datadeNascimento = dataNas;
		this.datadeAdmissao = dataA;
	}

	public void validarCpf(String cpf) {

		if (cpf.length() == 11) {

			System.out.println("CPF valido.");

		} else
			System.out.println("CPF invalido");

	}

	public void validarNascimento(Calendar data) {

		if (data.get(Calendar.YEAR) >= 1920) {

			System.out.println("Data de nascimento valida.");

		} else {

			System.out.println("Data de nascimento invalida.");
		}

	}

	public void validarAdmissao(Calendar data) {

		if (data.get(Calendar.YEAR) >= 1995) {

			System.out.println("Data de admissao valida.");

		} else {

			System.out.println("Data de admissao invalida.");
		}

	}

	public int converterDataNas(int dia, int mes, int ano) {

		Calendar data1 = Calendar.getInstance();

		int i = data1.get(Calendar.YEAR) - ano;
		
		if(data1.get(Calendar.YEAR) < mes || (data1.get(Calendar.MONTH) == mes) && ((data1.get(Calendar.DAY_OF_MONTH) < dia))){
				
			return i - 1;
		}
				
		return i;
	}
	

	public void calcSalario(double salario) {

		double salarioLiquido;

		if (salario <= 3000.00) {

			salarioLiquido = salario - (salario * 0.17);

		} else {

			salarioLiquido = salario - (salario * 0.27);

		}

		this.salarioBruto = salarioLiquido;

		System.out.println("Salario liquido: " + salarioLiquido);

	}
	
	public double getBonificacao(double salario) {
		
		double bonificacao = (salario * 12) * 0.02;
		
		return bonificacao;
	}
	
	public Calendar dataDeAposentadoria(char c, Calendar admis) {
		
		if(c == 'M' || c == 'm') {
			int aposentar = admis.get(Calendar.YEAR) + 35;
			data1.set(aposentar, admis.get(Calendar.MONTH), admis.get(Calendar.DAY_OF_MONTH));
			return data1;
		} else if(c == 'F' || c == 'f') {
			int aposentar = admis.get(Calendar.YEAR) + 30;
			data1.set(aposentar, admis.get(Calendar.MONTH), admis.get(Calendar.DAY_OF_MONTH));
			return data1;
		}
		
		return null;
	}
	
	public boolean eMaisVelho(Funcionario obj) {
		if(obj.getDatadeNascimento().get(Calendar.YEAR) < this.getDatadeNascimento().get(Calendar.YEAR)) {
			return true;
		} else {
			return false;
		}
	}

	public String getCPF() {
		return this.CPF;
	}

	public void setCPF(String cpf) {
		this.CPF = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return this.sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getSalarioBruto() {
		return this.salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Calendar getDatadeNascimento() {
		return this.datadeNascimento;
	}

	public void setDatadeNascimento(Calendar datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}

	public Calendar getDatadeAdmissao() {
		return this.datadeAdmissao;
	}

	public void setDatadeAdmissao(Calendar datadeAdmissao) {
		this.datadeAdmissao = datadeAdmissao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override

	public String toString() {

		String dataEmTexto = formatador.format(getDatadeAdmissao().getTime());
		String dataEmText = formatador.format(getDatadeNascimento().getTime());
		
		return "Funcionario [CPF=" + CPF + ", nome=" + nome + ", sexo=" + sexo + ", salarioBruto=" + salarioBruto
				+ ", datadeNascimento=" + dataEmText + ", datadeAdmissao=" + dataEmTexto + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(CPF, nome, sexo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(CPF, other.CPF) && Objects.equals(nome, other.nome) && sexo == other.sexo;
	}

}
