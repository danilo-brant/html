package primeiroProjeto;

public class lista10 {

	public static void main(String[] args) {
		
				Scanner scanner = new Scanner(System.in);
				
				//1
				int numero = 10;
				while (numero <=30) {
						System.out.println(numero);
						numero++; 
			}

				//2
				
				int contador = 1;
				int soma = 0;
				while(contador <=3) {
					System.out.println("Digite um número");
					int num = scanner.nextInt();
					soma = soma + num;
					contador++;

				}	
					
					System.out.println("A soma total é: " + soma);
					
				//3
					int contador2 = 1;
					int soma2 = 0;
					while(contador2 <=5) {
						System.out.println("Digite um número");
						int num2 = scanner.nextInt();
						soma2 = soma2 + num2;
						contador2++;

					}	
						
						System.out.println("A soma total é: " + soma2);
					
					
					System.out.println("====================================");
				//4
						 int num3;
						 int contar = 1;
						System.out.println("Digite um número");
						num3 = scanner.nextInt();
						 while (contar <= num3) {
						System.out.println(contar);
						contar++;
						
						 }
						 System.out.println("====================================");
				//5
						 
						 int numero2 = 1;
					        int soma3 = 0;
					        while (numero2 <= 5) {
					            soma3 = soma3 + numero2; 
					            numero2++;          
					        }
					
					       System.out.println("A soma dos números é: " + soma3);
					       System.out.println("====================================");
					
			   //6
					       
					  int contador5 = 1;
					  System.out.println("Informe um número:");
					  int num1 = scanner.nextInt();
					  while (contador5 <= 10) {
						 int valor = num1 * contador5;
						 System.out.println(num1 + "x" + contador5 + "=" + valor);
						 contador5++;

						  
					  }
					  System.out.println("====================================");
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
		}
		}

	}

}
