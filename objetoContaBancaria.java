package aula8;

import java.util.Scanner;

public class objetoContaBancaria {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		ContaBancaria conta = new ContaBancaria(100000.00);
		System.out.println("Saldo atual : " + "R$ " + conta.getSaldo());
		
		System.out.println("Qual será o valor do primeiro depósito? ");
		double deposito1 = ler.nextDouble();
		conta.depositar(deposito1);
		System.out.println("Saldo atual : " + "R$ " + conta.getSaldo());
		
		System.out.println("Qual será o valor do segundo depósito? ");
		double deposito2 = ler.nextDouble();
		conta.depositar(deposito2);
		System.out.println("Saldo atual : " + "R$ " + conta.getSaldo());

		System.out.println("Qual será o valor do primeiro saque? ");
		double saque1 = ler.nextDouble();
		conta.sacar(saque1);

		System.out.println("Saldo atual : " + "R$ " + conta.getSaldo());
		ler.close();
	}
}