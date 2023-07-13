package com.empresa;

import com.empresa.*;
import java.util.*;

public class App {

	public static void main(String[] args) {

		GregorianCalendar data1 = new GregorianCalendar();
		GregorianCalendar data2 = new GregorianCalendar();
		GregorianCalendar data11 = new GregorianCalendar();

		try (Scanner input = new Scanner(System.in)) {

			int e;

			Funcionario[] vet = new Funcionario[12];

			System.out.print(
					"Deseja cadastrar a data de admissao dos funcionarios de acordo com o SO? (1 - SIM ou 2 - NAO) : ");
			e = input.nextInt();

			input.nextLine();

			if (e == 1) {

				Programador[] programador = new Programador[6];
				Analista[] analista = new Analista[4];
				Gerente[] gerente = new Gerente[2];

				for (int i = 0; i < 6; i++) {

					programador[i] = new Programador();

					System.out.printf("\n______ DIGITE OS DADOS DO PROGRAMADOR %d ______\n\n", i + 1);

					System.out.printf("Digite o nome: ");
					String nome = input.nextLine();

					System.out.printf("Digite o CPF: ");
					String cpf = input.next();

					char sexo;

					do {

						System.out.printf("Digite o sexo (F/M): ");
						sexo = input.next().charAt(0);

					} while (sexo != 'M' && sexo != 'F' && sexo != 'm' && sexo != 'f');

					System.out.printf("Digite o salario: ");
					double salario = input.nextDouble();

					System.out.printf("Digite a data de nascimento (separado por espaco): ");
					int dia = input.nextInt();
					int mes = input.nextInt();
					int ano = input.nextInt();

					// como o gregorian começa com mês 0, se o usuário digitar 1, irá ser 0;
					mes--;

					data1.set(ano, mes, dia);

					programador[i].setIdade(programador[i].converterDataNas(dia, mes, ano));

					String[] g = new String[5];
					input.nextLine();

					System.out.println(" ");

					for (int j = 0; j < 5; j++) {
						System.out.print("Digite as linguagens que o programador utiliza: ");
						g[j] = input.nextLine();
					}

					programador[i].setNome(nome);
					programador[i].setCPF(cpf);
					programador[i].setSexo(sexo);
					programador[i].setDatadeNascimento(data1);
					programador[i].setSalarioBruto(salario);
					programador[i].setLinguagem(g);
					programador[i].getBonificacao(salario);
					programador[i].programaMesmasLinguagens(programador[i]);

					System.out.println(programador[i].toString());

					vet[i] = programador[i];

				}
				for (int i = 0; i < 4; i++) {

					analista[i] = new Analista();

					System.out.printf("\n______ DIGITE OS DADOS DO ANALISTA %d ______\n\n", i + 1);

					System.out.printf("Digite o nome: ");
					String nome = input.nextLine();

					System.out.printf("Digite o CPF: ");
					String cpf = input.next();

					char sexo;

					do {

						System.out.printf("Digite o sexo (F/M): ");
						sexo = input.next().charAt(0);

					} while (sexo != 'M' && sexo != 'F' && sexo != 'm' && sexo != 'f');

					System.out.printf("Digite o salario: ");
					double salario = input.nextDouble();

					System.out.printf("Digite a data de nascimento (separado por espaco): ");
					int dia = input.nextInt();
					int mes = input.nextInt();
					int ano = input.nextInt();

					// como o gregorian começa com mês 0, se o usuário digitar 1, irá ser 0;
					mes--;

					data1.set(ano, mes, dia);

					analista[i].setIdade(analista[i].converterDataNas(dia, mes, ano));

					String[] g = new String[5];
					input.nextLine();

					System.out.println("\n");

					for (int j = 0; j < 5; j++) {
						System.out.print("Digite os diagramas que o analista utiliza: ");
						g[j] = input.nextLine();
					}

					analista[i].setNome(nome);
					analista[i].setCPF(cpf);
					analista[i].setSexo(sexo);
					analista[i].setDatadeNascimento(data1);
					analista[i].setSalarioBruto(salario);
					analista[i].setDiagrama(g);
					analista[i].getBonificacao(salario);

					System.out.println(analista[i].toString());

					vet[i + 6] = analista[i];
				}
				for (int i = 0; i < 2; i++) {
					{

						gerente[i] = new Gerente();

						System.out.printf("\n______ DIGITE OS DADOS DO GERENTE %d ______\n\n", i + 1);

						System.out.printf("Digite o nome: ");
						String nome = input.nextLine();

						System.out.printf("Digite o CPF: ");
						String cpf = input.next();

						char sexo;

						do {

							System.out.printf("Digite o sexo (F/M): ");
							sexo = input.next().charAt(0);

						} while (sexo != 'M' && sexo != 'F' && sexo != 'm' && sexo != 'f');

						System.out.printf("Digite o salario: ");
						double salario = input.nextDouble();

						System.out.printf("Digite a data de nascimento (separado por espaco): ");
						int dia = input.nextInt();
						int mes = input.nextInt();
						int ano = input.nextInt();

						// como o gregorian começa com mês 0, se o usuário digitar 1, irá ser 0;
						mes--;

						data1.set(ano, mes, dia);

						gerente[i].setIdade(gerente[i].converterDataNas(dia, mes, ano));

						String[] g = new String[5];
						input.nextLine();

						System.out.println("\n");

						for (int j = 0; j < 5; j++) {
							System.out.print("Digite as metodologias de desenvolvimento que o gerente utiliza: ");
							g[j] = input.nextLine();
						}

						gerente[i].setNome(nome);
						gerente[i].setCPF(cpf);
						gerente[i].setSexo(sexo);
						gerente[i].setDatadeNascimento(data1);
						gerente[i].setSalarioBruto(salario);
						gerente[i].setMetodologiaDesenvolvimento(g);
						gerente[i].getBonificacao(salario);

						System.out.println(gerente[i].toString());

						vet[i + 10] = gerente[i];
					}
				}

			} else if (e == 2) {

				Programador[] programador = new Programador[6];
				Analista[] analista = new Analista[4];
				Gerente[] gerente = new Gerente[2];

				for (int i = 0; i < 6; i++) {

					programador[i] = new Programador();

					System.out.printf("\n______ DIGITE OS DADOS DO PROGRAMADOR %d ______\n\n", i + 1);

					System.out.printf("Digite o nome: ");
					String nome = input.nextLine();

					System.out.printf("Digite o CPF: ");
					String cpf = input.next();

					char sexo;

					do {

						System.out.printf("Digite o sexo (F/M): ");
						sexo = input.next().charAt(0);

					} while (sexo != 'M' && sexo != 'F' && sexo != 'm' && sexo != 'f');

					System.out.printf("Digite o salario: ");
					double salario = input.nextDouble();

					System.out.printf("Digite a data de admissao (separado por espaco): ");
					int di = input.nextInt();
					int m = input.nextInt();
					int a = input.nextInt();

					// como o gregorian começa com mês 0, se o usuário digitar 1, irá ser 0.
					m--;

					data2.set(a, m, di);

					System.out.printf("Digite a data de nascimento (separado por espaco): ");
					int dia1 = input.nextInt();
					int mes1 = input.nextInt();
					int ano1 = input.nextInt();

					// como o gregorian começa com mês 0, se o usuário digitar 1, irá ser 0;
					mes1--;

					data11.set(ano1, mes1, dia1);

					programador[i].setIdade(programador[i].converterDataNas(dia1, mes1, ano1));

					String[] g = new String[5];
					input.nextLine();

					System.out.println("\n");

					for (int j = 0; j < 5; j++) {
						System.out.print("Digite as linguagens que o programador utiliza: ");
						g[j] = input.nextLine();
					}

					programador[i] = new Programador(cpf, nome, sexo, salario, data1, data2, g);
					programador[i].programaMesmasLinguagens(programador[i]);

					System.out.println(programador[i].toString());

					vet[i] = programador[i];

				}

				for (int i = 0; i < 4; i++) {

					analista[i] = new Analista();

					System.out.printf("\n______ DIGITE OS DADOS DO ANALISTA %d ______\n\n", i + 1);

					System.out.printf("Digite o nome: ");
					String nome = input.nextLine();

					System.out.printf("Digite o CPF: ");
					String cpf = input.next();

					char sexo;

					do {

						System.out.printf("Digite o sexo (F/M): ");
						sexo = input.next().charAt(0);

					} while (sexo != 'M' && sexo != 'F' && sexo != 'm' && sexo != 'f');

					System.out.printf("Digite o salario: ");
					double salario = input.nextDouble();

					System.out.printf("Digite a data de admissao (separado por espaco): ");
					int di = input.nextInt();
					int m = input.nextInt();
					int a = input.nextInt();

					// como o gregorian começa com mês 0, se o usuário digitar 1, irá ser 0.
					m--;

					data2.set(a, m, di);

					System.out.printf("Digite a data de nascimento (separado por espaco): ");
					int dia2 = input.nextInt();
					int mes2 = input.nextInt();
					int ano2 = input.nextInt();

					// como o gregorian começa com mês 0, se o usuário digitar 1, irá ser 0;
					mes2--;

					data11.set(ano2, mes2, dia2);

					analista[i].setIdade(analista[i].converterDataNas(dia2, mes2, ano2));

					String[] g = new String[5];
					input.nextLine();

					System.out.println("\n");

					for (int j = 0; j < 5; j++) {
						System.out.print("Digite os diagramas que o analista utiliza: ");
						g[j] = input.nextLine();
					}

					analista[i] = new Analista(cpf, nome, sexo, salario, data1, data2, g);
					analista[i].getBonificacao(salario);
					analista[i].dominaMesmaDiagrama(analista[i]);

					System.out.println(analista[i].toString());

					vet[i + 6] = analista[i];

				}
				for (int i = 0; i < 1; i++) {

					gerente[i] = new Gerente();

					System.out.printf("\n______ DIGITE OS DADOS DO GERENTE %d ______\n\n", i + 1);

					System.out.printf("Digite o nome: ");
					String nome = input.nextLine();

					System.out.printf("Digite o CPF: ");
					String cpf = input.next();

					char sexo;

					do {

						System.out.printf("Digite o sexo (F/M): ");
						sexo = input.next().charAt(0);

					} while (sexo != 'M' && sexo != 'F' && sexo != 'm' && sexo != 'f');

					System.out.printf("Digite o salario: ");
					double salario = input.nextDouble();

					System.out.printf("Digite a data de admissao (separado por espaco): ");
					int di = input.nextInt();
					int m = input.nextInt();
					int a = input.nextInt();

					// como o gregorian começa com mês 0, se o usuário digitar 1, irá ser 0.
					m--;

					data2.set(a, m, di);

					System.out.printf("Digite a data de nascimento (separado por espaco): ");
					int dia3 = input.nextInt();
					int mes3 = input.nextInt();
					int ano3 = input.nextInt();

					// como o gregorian começa com mês 0, se o usuário digitar 1, irá ser 0;
					mes3--;

					data1.set(ano3, mes3, dia3);

					gerente[i].setIdade(gerente[i].converterDataNas(dia3, mes3, ano3));

					String[] g = new String[5];
					input.nextLine();

					System.out.println("\n");

					for (int j = 0; j < 5; j++) {
						System.out.print("Digite as metodologias de desenvolvimento que o gerente utiliza: ");
						g[j] = input.nextLine();
					}

					gerente[i] = new Gerente(cpf, nome, sexo, salario, data1, data2, g);
					gerente[i].getBonificacao(salario);
					gerente[i].dominaMesmasMetodologias(gerente[i]);

					System.out.println(gerente[i].toString());

					vet[i + 10] = gerente[i];

				}

			}

			OperacaoFuncionario.dadosValidos(vet);
			OperacaoFuncionario.quantidadeSexo(vet);
			OperacaoFuncionario.maiorMenor(vet);
			OperacaoFuncionario.maisVelhoNovo(vet);
			OperacaoFuncionario.bonificacao(vet);
			OperacaoFuncionario.imprimirAposentadoria(vet);

			System.out.println("\n");

			for (int i = 0; i < 12; i++) {
				for (int j = i + 1; j < 12; j++) {

					if (vet[i].equals(vet[j])) {
						System.out.println("\nFuncionario " + (i + 1) + " e o mesmo que " + (j + 1));
					}
				}
			}
		}
	}
}