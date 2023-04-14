package com.nunesd66.cap4;

import com.nunesd66.entities.Televisor;

// 4.3. Desafio: wrappers e boxing
public class Aula_03_Exercicio {
	
	public static void main(String[] args) {
		Televisor tv = new Televisor();

		// Não deveria mudar o volume e canal
		tv.mudarVolume(20);
		tv.mudarCanal(130);
		
		// Deveria mudar o volume e canal
		tv.mudarVolume(300);
		tv.mudarCanal(10);
	}
}
