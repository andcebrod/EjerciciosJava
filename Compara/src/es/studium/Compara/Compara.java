package es.studium.Compara;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Compara {

		public static void main(String[] args) throws IOException {
			BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
			int num1,num2;
			System.out.println("Introduce el primer número: ");
			num1 = Integer.parseInt(lectura.readLine());
			System.out.println("Introduce el segundo número: ");
			num2 = Integer.parseInt(lectura.readLine());
			if(num1==num2) {
				System.out.println(Son iguales)
			}
	
		}
}
