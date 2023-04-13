package com.nunesd66.cap3;

import com.nunesd66.entities.Carro;
import com.nunesd66.entities.Proprietario;

public class Aula_07 {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Prata";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		
		meuCarro.dono = new Proprietario();
		meuCarro.dono.nome = "Joao da Silva";
		meuCarro.dono.bairro = "Centro";
    }
}
