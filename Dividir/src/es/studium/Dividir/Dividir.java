package es.studium.Dividir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dividir
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num1,num2;
		float division;
		System.out.println("Ingrese n�mero: ");
		num1 = Integer.parseInt(lectura.readLine());
		System.out.println("Deme otro n�mero: ");
		num2 = Integer.parseInt(lectura.readLine());
		division = dividir(num1,num2);
		System.out.println("La divisi�n es "+division);
}
	public static float dividir(int a, int b)
	{
	float resultado;
	resultado = (float) a /(float) b;
	return(resultado);
	}
}