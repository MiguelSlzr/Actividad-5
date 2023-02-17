package Actividad4;

public class Matriz {
	//int[][] arr1 = new int [n][m]
	//int[][] arr2 = new int [m][o]
	
	public int[][] multiplicarMatrices(int[][] arrA, int[][] arrB) {
		int filasB = arrB.length;
		int columnasB = arrB[0].length;
		int columnasA = arrA[0].length;
		int filasA = arrA.length;
		int[][] arrC = new int [filasA][columnasB];
		
		if (columnasA == filasB) {
			
			for (int k = 0; k < columnasB; k++) {
			    for (int i = 0; i < filasA; i++) {
			        for (int j = 0; j < columnasA; j++) {
			        	 arrC[i][k] += arrA[i][j] * arrB[j][k];
			        }
			    }
			}
			System.out.println("El producto de las matrices es: ");
		}
		
		else {
			System.out.println("No se puede realizar la multiplicación");
		}
		
		for (int i=0; i < arrC.length; i++) {
			  System.out.print("|");
			  for (int j=0; j < arrC[i].length; j++) {
			    System.out.print (arrC[i][j]);
			    if (j!=arrC[i].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}
		
		return (arrC);
	}
	
	public int[][] transpuestaMatriz(int[][] arrA) {
		int filasA = arrA.length;
		int columnasA = arrA[0].length;
		int[][] transp = new int [columnasA][filasA];
		
		for(int i = 0; i < columnasA; i++) {
			for(int j = 0; j < filasA; j++) {
				transp[i][j] = arrA[j][i];
			}
		}
		
		System.out.println("La transpuesta de la matriz es: ");
		
		for (int i=0; i < transp.length; i++) {
			  System.out.print("|");
			  for (int j=0; j < transp[i].length; j++) {
			    System.out.print(transp[i][j]);
			    if (j!=transp[i].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}
		
		return(transp);
	}
	
	public int sumaDiagonal(int[][] arrA){
		int filasA = arrA.length;
		int columnasA = arrA[0].length;
		int suma = 0;
		
		if(filasA == columnasA) {
			for (int i=0; i < filasA; i++) {
				suma += arrA[i][i];
			}
			System.out.println("La suma de la diagonal principal es: ");
		}
		else {
			System.out.println("No se puede obtener la suma de la diagonal principal para esta matriz");
		}
		return(suma);
	}
	
	public int maximoMatriz(int[][] arrA){
		int max = 0;
		
		for(int i = 0; i < arrA.length; i++){
			for(int j = 0; j < arrA[i].length; j++) {
				if(max < arrA[i][j]) {
					max = arrA[i][j];
				}
			}
		}
		System.out.println("El número más grande de la matriz es: ");
		return(max);
	}
	
	public int[][] sumaMatrices(int[][] arrA, int[][] arrB){
		
		int filasA = arrA.length;
		int columnasA = arrA[0].length;
		int filasB = arrB.length;
		int columnasB = arrB[0].length;
		int[][] arrC = new int [filasA][columnasA];
		
		if(filasA == filasB && columnasA == columnasB) {
			for (int i=0; i < filasA; i++) {
				for(int j=0; j < columnasA; j++) {
					arrC[i][j] = arrA[i][j] + arrB[i][j];
				}
			}
			System.out.println("La suma de matrices es: ");
		}
		else {
			System.out.println("No se pueden sumar las matrices");
		}
		
		
		
		for (int i=0; i < arrC.length; i++) {
			  System.out.print("|");
			  for (int j=0; j < arrC[i].length; j++) {
			    System.out.print (arrC[i][j]);
			    if (j!=arrC[i].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}
		
		return(arrC);
	}
	
	public int[][] escalarPorMatriz(int[][] arrA, int num){
		int filasA = arrA.length;
		int columnasA = arrA[0].length;
		int[][] arrB = new int [filasA][columnasA];
		
		for (int i=0; i < arrA.length; i++) {
			 for (int j=0; j < arrA[i].length; j++) {
			    arrB[i][j] = num * arrA[i][j];
			  }
		}
		
		System.out.println("El escalar " + num + " por la matriz es: ");
		
		for (int i=0; i < arrB.length; i++) {
			  System.out.print("|");
			  for (int j=0; j < arrB[i].length; j++) {
			    System.out.print (arrB[i][j]);
			    if (j!=arrB[i].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}
		
		return(arrB);
	}
}
