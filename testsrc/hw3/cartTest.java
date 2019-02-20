package hw3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class cartTest {

	private cart undertest;

	@Before
	public void setUp() throws Exception {
		undertest = new cart();
		
	}
     
	@Test
	public void test() {
	
		int result= 0;
		int result2=0;
		assertEquals(result,undertest.getsize());
		//assertEquals(result2,undertest.toatal());
	}
	@Test
	public void test1() {

		int result= 1;
		int result2=127;
		undertest.addpro("JAVA BOOK" , 127, 1);
		assertEquals(result,undertest.getsize());
		assertEquals(result2,undertest.toatal());
	}
	
	@Test
	public void test2() {
	
		int result=2 ;
		int result2=227;
		undertest.addpro("JAVA BOOK" , 127, 1);
		undertest.addpro("WEB BOOK" , 100, 1);
		assertEquals(result,undertest.getsize());
assertEquals(result2,undertest.toatal());
	}

}
