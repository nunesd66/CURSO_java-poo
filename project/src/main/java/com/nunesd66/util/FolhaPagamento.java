package com.nunesd66.util;

public class FolhaPagamento {
    // double calcularSalario(int, int, double, double)
	public double calcularSalario(
            int horasNormais, 
            int horasExtras, 
            double valorHoraNormal, 
            double valorHoraExtra) {

        double valorHorasNormais = horasNormais * valorHoraNormal;
        double valorHorasExtras = horasExtras * valorHoraExtra;

        return valorHorasNormais + valorHorasExtras;
    }
}
