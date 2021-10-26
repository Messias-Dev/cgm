package avaliacao1_gcm.gui;

import java.util.Scanner;

import avaliacao1_gcm.business.CpfBO;

public class Avaliacao1 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Digite CPF: ");
		String cpf = sc.next();
		sc.close();

		if (CpfBO.isValid(cpf)) {
			System.out.println("CPF válido");
		}
		else {
			System.out.println("CPF inválido");
		}
		

	}

}
