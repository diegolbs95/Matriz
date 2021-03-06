package matriz;

public class program {

	public static void main(String[] args) {
		
		//PARA DE CLARAR UM ARRANJO TEMOS QUE COLOCAR ABRE E FECHA CONCHETES
		//PARA INDICAR QUE A MATRIZ TEM MAIS DE UMA DIMENSAO COLAMOS MAIS  DE UM ABRE E FECHA CONCHETES
		//DEPOIS DO NEW COLOCAMOS A QUANTIDADE DE LINHA E COLUNAS DA MATRIZ DENTRO DO CONCHETES
		int [][] mat = new int[5][5] ;
		
		//COMANDO DE ATRIBUIÇAO 
		//LINHA 1 COLUNA 3 RECEBE 10
		mat[1][3] = 10 ;
		
		mat[2][1] = 5 ;
		
		int soma = mat[1][3] + mat[2][1];
		
		System.out.println(soma);
		
		

	}

}
