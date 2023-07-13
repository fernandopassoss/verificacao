package com.empresa;

import java.text.SimpleDateFormat;

public class OperacaoFuncionario {

	public static void dadosValidos(Funcionario vet[]) {

		for (int i = 0; i < vet.length; i++) {

			System.out.printf("\n\n______ DADOS DO FUNCIONARIO %d ______", i + 1);
			System.out.println("\n");

			vet[i].validarCpf(vet[i].getCPF());
			vet[i].calcSalario(vet[i].getSalarioBruto());
			vet[i].validarAdmissao(vet[i].getDatadeAdmissao());
			vet[i].validarNascimento(vet[i].getDatadeNascimento());
		}
	}

	public static void quantidadeSexo(Funcionario vet[]) {

		int masculino = 0;
		int feminino = 0;

		for (int i = 0; i < vet.length; i++) {

			if (vet[i].getSexo() == 'M' || vet[i].getSexo() == 'm') {

				masculino++;

			} else if (vet[i].getSexo() == 'F' || vet[i].getSexo() == 'f') {

				feminino++;
			}

		}

		System.out.print("\n\nExistem " + masculino + " funcionario(s) de sexo masculino.");
		System.out.print("\nExistem " + feminino + " funcionario(s) de sexo feminino.");

	}

	public static void maiorMenor(Funcionario vet[]) {

		double maior = vet[0].getSalarioBruto();
		double menor = vet[0].getSalarioBruto();
		int indice = 0, indice1 = 0;

		if (vet.length > 1) {

			for (int i = 0; i < vet.length; i++) {

				if (vet[i].getSalarioBruto() > maior) {

					maior = vet[i].getSalarioBruto();
					indice = i;

				} else if (vet[i].getSalarioBruto() < menor) {

					menor = vet[i].getSalarioBruto();
					indice1 = i;
				}

			}

			System.out.print(
					"\n\nO maior salario e  [" + maior + "] que pertence ao funcionario " + vet[indice].getNome());
			System.out.print(
					"\nO menor salario e  [" + menor + "] que pertence ao funcionario " + vet[indice1].getNome());

		} else {

			System.out.print("\n\nO maior salario e  [" + maior + "] que pertence ao funcionario " + vet[0].getNome());
		}

	}

	public static void maisVelhoNovo(Funcionario vet[]) {

		int maior = vet[0].getIdade();
		int menor = vet[0].getIdade();
		int indice = 0, indice1 = 0;
		
		if(vet.length > 1) {
		for(int i = 0; i < vet.length;  i++) {
			
			if(vet[i].getIdade() > maior) {
				maior = vet[i].getIdade();
				indice = i;
				
			}else if(vet[i].getIdade() < menor) {
				menor = vet[i].getIdade();
				indice1 = i;
			}
				
			
		}
		
		System.out.print("\n\nO mais velho e: " +vet[indice].getNome() + " com " + maior + " anos.");
		System.out.print("\nO mais novo e : "+ vet[indice1].getNome() + " com " + menor+ " anos.");
		
		} else {
			
			System.out.print("\n\nO mais velho e: " +vet[0].getNome() + " com " + maior + " anos.");
		}
	}
	
	public static void imprimirAposentadoria(Funcionario[] vet) {
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("\n");
		
		for(int i = 0; i < vet.length; i++) {
			String dataEmText = formatador.format(vet[i].dataDeAposentadoria(vet[i].getSexo(), vet[i].getDatadeAdmissao()).getTime());
			System.out.println("O funcionario [" + vet[i].getNome() + "] ira se aposentar em: " + dataEmText);
		}
	}
	
	public static void bonificacao(Funcionario[] vet) {
		
		float soma = 0;
		System.out.println("\n");
		for(int i = 0; i < vet.length; i++) {
			System.out.println("A bonificacao do funcionario [" + vet[i].getNome() + "] e: " + vet[i].getBonificacao(vet[i].getSalarioBruto()));
			soma += vet[i].getBonificacao(vet[i].getSalarioBruto());
		}
		
		System.out.printf("\nA empresa devera pagar: %.2f em bonificacoes", soma);
	}
}