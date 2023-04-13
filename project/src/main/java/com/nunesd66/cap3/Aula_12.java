package com.nunesd66.cap3;

import com.nunesd66.util.FolhaPagamento;

public class Aula_12 {
    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();
		double salario = folha.calcularSalario(160, 12, 32.5, 40.2);
		
		System.out.println("Salário calculado: " + salario);
    }
}
