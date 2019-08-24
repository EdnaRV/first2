
import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		
		
		Scanner scanner = null;
		try {
			System.out.println("Ingresa opcion");
		    scanner = new Scanner(System.in);
			int opc=scanner.nextInt();
			
		    
		    switch(opc) {
			case 1:
				System.out.println("Ingresa 10 numeros");
				
				/*int asum[];
				asum= new int[9];*/
				int total=0;
				
				
				
				for(int i=0; i<=9 ; i++) {
					int sumaA=scanner.nextInt();
					total= total + sumaA;
					System.out.println("Suma" + total);
				}
				break;
			case 2:
				for(int j=0; j<=4 ;j++) {
					System.out.println("\n");
					for(int k=j; k<=4 ;k++)
						System.out.print("*");
				
				}
				break;
			case 3:
				int j=1, i=0, n=1;
				
				for(j=1; j <= 4 ; j++) {
					
					
					for(i=1; i <= n ; i++) {
						System.out.print(i);			
					}
						
					n++;
					System.out.println("\n");
								
				}
				break;
			case 4:
				int i4, n4=1;
				
				for(int l=1; l<=4 ; l++) {
					
					for(i4=1 ; n4<=i4 ; i4++) {
						n4++;
						System.out.print(n4);
					}
					
				System.out.print("\n");
				}
					
			
			
			
			
				break;
			}
				
		
		}
		finally {
		    if(scanner!=null)
		        scanner.close();
		}
		
		
					
			
			
			
		
		}

	}

