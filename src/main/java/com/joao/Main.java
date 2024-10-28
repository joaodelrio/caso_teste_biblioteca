package com.joao;

public class Main {
	public static void main(String[] args) {
		Emprestimo e = new Emprestimo();

      
		
		System.out.print("Data de Empr�stimo: " + e.getDataEmprestimo());
		System.out.print("\nData de Devolu��o: " + e.CalculaDataDevolucao());

	}

}