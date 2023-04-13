package com.nunesd66.cap3;

import com.nunesd66.entities.Carro;

public class Aula_10 {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		
		meuCarro.ligar();
		seuCarro.ligar();
    }
}
