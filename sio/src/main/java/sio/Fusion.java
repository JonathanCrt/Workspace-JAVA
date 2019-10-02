package sio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Fusion {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("D:\\Travail\\BTS\\french-client.csv"));
		BufferedReader bw = new BufferedReader(new FileReader("D:\\Travail\\BTS\\german-client.csv"));
		FileWriter fileWriter = new FileWriter("D:\\Travail\\FusionFinal.txt");

		String ligne = null;

		while ((ligne = br.readLine()) != null) {
			// Retourner la ligne dans un tableau
			fileWriter.append(ligne);
			String[] data = ligne.split(",");

			// Afficher le contenu d'un tableau
			for (String val : data) {
				System.out.println(val);

			}
			ligne = br.readLine();

		}
		br.close();

		while ((ligne = bw.readLine()) != null) {
			// Retourner la ligne dans un tableau
			fileWriter.append(ligne);
			String[] data = ligne.split(",");

			// Afficher le contenu d'un tableau
			for (String val : data) {
				System.out.println(val);

			}
			ligne = bw.readLine();

		}
		bw.close();
		fileWriter.close();
	}
}
