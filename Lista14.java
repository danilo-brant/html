package primeiroProjeto;

import java.util.Scanner;

public class Lista14 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


		//1
		for (int contar = 1; contar <= 10; contar++) {
			System.out.println(contar);
		}
		
		//2
		System.out.println("===============================================");
		int soma = 0;
		for (int i = 1; i <= 100; i++) {
			soma = soma + i;
		}
		
		System.out.println("A soma é :" + soma);
		
		
		//3
		System.out.println("===============================================");
		for (int i = 0; i <=20; i++) {
				if (i % 2 == 0) {
				System.out.println(i);
		}
		}
		
		//4
		System.out.println("===============================================");
		System.out.println("Digite um número:");
		int numero = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
					System.out.println(numero + "x" + i + "=" + resultado);
		}
		
		//5
		System.out.println("================================================");
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.println("Os números divisíveis são: " +i);
				
			}
		}
		
		//6
		System.out.println("===============================================");
		System.out.println("Escolha um número");
		int num1 = scanner.nextInt();
		int contador2 = 0;
		for (int i = 1; i <= num1; i++) {
			if (i  % 3 == 0) {
				contador2 ++;
				System.out.println("Os numeros ímpares são" + contador2 );
			}
		}
		
		//7
				int resultado1 =1;
				int result = 1;
				for(int num3= 1; num1 <= 5; num1++) {
					System.out.print("Informe um número: ");
					int num = scanner.nextInt();
					resultado1 *= num3;
					result = num3;				
					result = resultado1;
						System.out.println(result + " * " + num1 + " = " + resultado1);

					}
					
				
				System.out.println("=============================");
				
				//8
				for(int func = 1; func <=10; func++){
					System.out.print("Quantos anos de empresa você possui? \nR:");
					int funcio = scanner.nextInt();
					if(funcio >= 10) {
						System.out.println("Parabéns! Você irá receber um prêmio");
					}else {
						System.out.println("Quase lá!");
					}
				}
				System.out.println("=============================");
		

	}

}
