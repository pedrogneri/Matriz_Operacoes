//
//  MatrizOperacoes.java
//  MatrizOperacoes
//
//  Created by Pedro Guilherme Neri on 02/09/2018.
//  Copyright © 2018 Pedro Guilherme Neri. All rights reserved.
//

package matriz;
public class MatrizOperacoes {
	
	int[][] matriz = {
	          {-1,3},
	          {4,2}
	         
	};
	
	public static void main(String[] args) {
	
		int[][] matriz2 = {
				{1,2},
				{3,4}
		    
		};
		
		MatrizOperacoes m = new MatrizOperacoes();
				
		int soma[][] = m.somaMatriz(matriz2);
		int subtracaoMatriz[][] = m.subtracaoMatriz(matriz2);
		int multiplicacaoMatriz[][] = m.multiplicacaoMatriz(matriz2);
		int transpostaMatriz[][] = m.transpostaMatriz();
		int determinante = m.determinanteMatriz();
		
	}
	
	public int[][] somaMatriz(int matriz2[][]) {
		
		int linha = this.matriz.length;
		int coluna = this.matriz[0].length;
		
		int soma[][] = new int[linha][coluna];
		
		try {

		System.out.println("Matriz Soma");
		for (int x = 0;x < matriz.length; x++) {
			for (int y = 0;y < matriz[x].length; y++) {
			   soma[x][y] = matriz[x][y] + matriz2[x][y]; 
			   System.out.print(soma[x][y]+" ");
			}
			System.out.println("\n");
		}
		
		}
		catch (IndexOutOfBoundsException e){
			System.out.println("erro de restrição de dimensão");
		}

		return soma;
	}
	
	public int[][] subtracaoMatriz(int matriz2[][]) {
			
			int linha = this.matriz.length;
			int coluna = this.matriz[0].length;
			
			int subtracao[][] = new int[linha][coluna];
			
			try {
			
			System.out.println("Matriz Resto");
			for (int x = 0;x < matriz.length; x++) {
				for (int y = 0;y < matriz[x].length; y++) {
				   subtracao[x][y] = matriz[x][y] - matriz2[x][y]; 
				   System.out.print(subtracao[x][y]+" ");
				}
				System.out.println("\n");
			}
			
			}
			catch (IndexOutOfBoundsException e){
				System.out.println("erro de restrição de dimensão");
			}
	
			return subtracao;
		}
	
	public int[][] multiplicacaoMatriz(int matriz2[][]){
		
		int linha = this.matriz.length;
		int coluna = this.matriz[0].length;
		
		int multiplicacao[][] = new int[linha][coluna];
		
		try {
			
			System.out.println("Matriz Multiplicação");
			for (int x = 0;x < matriz.length; x++) {
					for (int y2 = 0;y2< matriz2[x].length; y2++) {
						for (int y = 0;y < matriz[x].length; y++) {
                             multiplicacao[x][y2] += matriz[x][y] * matriz2[y][y2]; 
					    }
				        System.out.print(multiplicacao[x][y2]+" ");
					}
					System.out.println("\n");
				}
			}
			catch (IndexOutOfBoundsException e){
				System.out.println("erro de restrição de dimensão");
			}
		
		return multiplicacao;
	}
	
	public int[][] transpostaMatriz(){
			
		int linha = this.matriz.length;
		int coluna = this.matriz[0].length;
		
		int transposta[][] = new int[coluna][linha];
		
		try {
			
		System.out.println("Matriz Transposta");
		for (int x = 0;x < matriz.length; x++) {
			for (int y = 0;y < matriz[x].length; y++) {
				transposta[y][x] = matriz[x][y]; 
			}
		}
		
		}
		catch (IndexOutOfBoundsException e){
			System.out.println("erro de restrição de dimensão");
		}
	
		return transposta;
	}
	
	public int determinanteMatriz(){
		int determinante = 0;
	
		System.out.println("Matriz Determinante");
		
		if (matriz.length == 1) {
			determinante = Math.abs(matriz[0][0]);
		}else if (matriz.length == 2) {
			determinante = determinanteMatriz2x2();
		}else{
			System.out.println("Ainda nao ha essa função no programa!");
		}
		
		System.out.print(determinante);
	
		return determinante;
	}
	
	public int determinanteMatriz2x2() {	
		int determinante = this.matriz[0][0] * this.matriz[1][1] - this.matriz[1][0] * this.matriz[0][1];
		return Math.abs(determinante);
	}

}













