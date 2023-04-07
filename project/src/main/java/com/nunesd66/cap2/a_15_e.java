package com.nunesd66.cap2;

// 2.15. Exercício: tipos primitivos e outros operadores de atribuição
public class a_15_e {
    public static void main(String[] args) {
        // constante do Pi - http://pt.wikipedia.org/wiki/Pi
        float pi = 3.14f;

        // raio - informado pelo professor
        float raio = 15.3f;

        // area eh igual ao raio ao quadrado multiplicado por Pi
        float area = raio * raio * pi;
        int areaSemCasasDecimais = (int) area;

        System.out.println("Resultado: " + area);
        System.out.println("Resultado sem casas decimais: " + areaSemCasasDecimais);
    }
}
