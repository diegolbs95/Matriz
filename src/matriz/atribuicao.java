package matriz;

import java.util.Scanner;

public class atribuicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int [][] mat = new int[N][N] ;
		for (int i = 0; i < N; i++) {//PREENCHENDO AS COLUNAS DA MATRIZ
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
				
			}
		}
		// SABER A DIAGONAL PRINCIPAL
		System.out.println("Diagonal principal:");
		for (int i = 0; i < N; i++) {
			System.out.print(mat[i][i]+" ");
		
		}
		 System.out.println();
		 int conta = 0;//COMO CONTAR A QUANTIDADE DE NUMEROS NEGATIVOS
		 for (int i = 0; i < N; i++) {
			 for (int j = 0; j < N; j++) {
				 if (mat[i][j] < 0) {
					 conta++;
				}	
			}
		}
		 System.out.print("Numeros negativos = "+conta);
		
		
		
		
		
					
				sc.close();
		}
	}
		
		
		
		


