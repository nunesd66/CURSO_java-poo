package com.nunesd66.cap4;

// 4.2. Boxing
public class Aula_02 {
    public static void main(String[] args) {
        Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 128;
		Integer i4 = 128;
		
		System.out.println(i1 == i2);
		System.out.println(i3 == i4);
		System.out.println(i1.equals(i2));
		System.out.println(i3.equals(i4));
    }
}
