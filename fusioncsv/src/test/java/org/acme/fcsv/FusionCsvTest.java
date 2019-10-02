package org.acme.fcsv;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FusionCsvTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGoodFileNamesFusionCsv() {
		try {
			// tentative de cr�ation de l'instance
			// la cr�ation de l'objet �choue si les fichiers ne sont pas trouv�s
			FusionCsv fcsv = new FusionCsv("french-small.csv", "german-small.csv");
		} catch (IOException e) {
			// si on est ici, c'est qu'une exception a �t� lanc�e par le constructeur
			fail("Erreur de lecture : " + e.getMessage());
		}
	}

	@Test
	public void testBadFileNamesArgFusionCsv() {
		fail("Not implemented");
	}

	@Test
	public void testSimpleExportTo() {
		try {
			FusionCsv fcsv = new FusionCsv("french-client.csv", "german-client.csv");
			fcsv.exportTo("test-export.csv");
			
			assertTrue(new File("test-export.csv").exists());

		} catch (Exception e) {
			fail("Erreur export " + e.getMessage());

		} finally {
				new File("test-export.csv").delete();
		
	}

	public void AvgHeightMale() {
		try {
			FusionCsv fcsv = new FusionCsv("french-client.csv", "german-client.csv");
			assertEquals(176.0, fcsv.getAvgHeightMale(), 10);
		} catch (Exception e) {
			fail("Erreur r�sultat" + e);
		}
	}

	public void AvgHeightFemale() {
		try {
			FusionCsv fcsv = new FusionCsv("french-client.csv", "german-client.csv");
			assertEquals(158.0, fcsv.getAvgHeightMale(), 10);
		} catch (Exception e) {
			fail("Erreur r�sultat" + e);
		}
	}

}
