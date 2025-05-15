package Examen13_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class copyPaste {
	public static void main(String[]args) throws IOException {
		
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			inputStream = new BufferedReader(new FileReader("Tu direccion de archivo"));
			outputStream = new PrintWriter(new FileWriter("Direccion del archivo que se va a pegar"));
			
			String linea;
			while((linea = inputStream.readLine())!=null) {
				outputStream.println(linea);
				System.out.println("La operación se realizó con éxito");
			}
			
			}finally{
				if(inputStream != null) {
					System.out.println("Nada más que copiar");
					inputStream.close();
				}
				if(outputStream !=null) {
					outputStream.close();
				}
		}
	}
}
