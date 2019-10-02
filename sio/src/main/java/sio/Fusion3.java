package sio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.*;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Fusion3 {

	public static void main(String[] args) throws IOException {

		int cpt = 0;

		BufferedReader br1 = new BufferedReader(
				new FileReader("D:\\Travail\\BTS\\Code\\Kpu\\POO-java\\french-client.csv"));
		BufferedReader br2 = new BufferedReader(
				new FileReader("D:\\Travail\\BTS\\Code\\Kpu\\POO-java\\german-client.csv"));
		String ligneA = br1.readLine();
		String ligneB = br2.readLine();

		while (ligneA != null || ligneB != null) {
			if (cpt % 2 == 0 && ligneA != null) {

				ligneA=br1.readLine();
				System.out.println(ligneA);
				
				cpt++;

			} else if (ligneB != null) {
				ligneB=br2.readLine();
				System.out.println(ligneB);
				
				cpt++;

			}

		}
	}

}
