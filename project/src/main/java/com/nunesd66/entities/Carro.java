package com.nunesd66.entities;

public class Carro {

	public String fabricante;
	public String modelo;
	public String cor;
	public int anoDeFabricacao;

	public Proprietario dono;

	public void ligar() {
		if (modelo != null) {
			System.out.println("Ligando o carro: " + modelo);
		}
	}
}
