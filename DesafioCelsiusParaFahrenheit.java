package Desafios;

import java.util.Scanner;

public class DesafioCelsiusParaFahrenheit {
	
	public static void main(String[] args) {
		
		// fórmula de conversão celsius para fahrenheit: °F = (°C * 1.8) +32.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius.");
		
		double celcius = entrada.nextDouble();
		var cons = 1.8;
		var cons1 = 32.0;
		double fahrenheit = (celcius * cons) + cons1;
		
		System.out.printf("%.1f %s", fahrenheit, "F°");
		
		entrada.close();
		
		
		
		
		
		
		
	}

}
