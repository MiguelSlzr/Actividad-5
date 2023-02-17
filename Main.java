package Actividad4;

public class Main {

	public static void main(String[] args) {
		Matriz miMatriz = new Matriz();
		int matrizA[][] = new int[3][3];	
		matrizA[0][0] = 1;
		matrizA[0][1] = 2;
		matrizA[0][2] = 3;
		matrizA[1][0] = 4;
		matrizA[1][1] = 5;
		matrizA[1][2] = 6;
		matrizA[2][0] = 7;
		matrizA[2][1] = 8;
		matrizA[2][2] = 9;
		
		int matrizB[][] = new int[3][3];
		matrizB[0][0] = 1;
		matrizB[0][1] = 2;
		matrizB[0][2] = 3;
		matrizB[1][0] = 4;
		matrizB[1][1] = 5;
		matrizB[1][2] = 6;
		matrizB[2][0] = 7;
		matrizB[2][1] = 8;
		matrizB[2][2] = 9;
		
		int numero = 5;
		
		
		miMatriz.multiplicarMatrices(matrizA, matrizB);
		
		System.out.println("");
		
		miMatriz.transpuestaMatriz(matrizA);
		
		System.out.println("");
		
		System.out.println(miMatriz.sumaDiagonal(matrizA));
		
		System.out.println("");
		
		System.out.println(miMatriz.maximoMatriz(matrizA));
		
		System.out.println("");
		
		miMatriz.sumaMatrices(matrizA, matrizB);
		
		System.out.println("");
		
		miMatriz.escalarPorMatriz(matrizA, numero);
	}

}
