package es.studium.SumaParesProductosImpares;

import java.io.IOException;

public class SumaParesProductosImpares 
{
	public static void main(String[] args) throws IOException {
	int i, suma, multi;
	multi =1;
	suma = 0;
	for (i=1;i<=40;i++) 
	{
		
		if (i%2==0) {
			suma=i+suma;
		}
		else {
			multi=i*multi;
			}
		
	}
	System.out.println("La suma de los 20 primeros números pares es "+suma);
	System.out.println("El producto de los 20 primeros números impares es "+multi);
	}
}
