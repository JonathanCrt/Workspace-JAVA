package org.acme.fcsv;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class ClientTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	public void isAdultYoung(){
		Client c = new Client(1,"Male",LocalDate.now(),null,null,null,null,null,null,null);
		assertFalse(c.isAdult());
	}
	
	public void isAdultOld(){
		Client c = new Client(1,"Male",LocalDate.now(),null,null,null,null,null,null,null);
		assertFalse(c.isAdult());
	}
	public void testCheckHeight(){
		Client inch = new Client(3,"Male",LocalDate.of(1960, 06, 14),"176","5' 4\"",null,null,null,null,null);
		assertFalse(inch.isAdult());
	}
	
	

}
