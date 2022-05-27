package Login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginTest {
	
	//Executar tudo que for solicitado no inicio da classe 
	@BeforeClass
	public static void beforeClassNotation() {
		System.out.println("beforeClass");
	}
	
	//Executar tudo que for solicitado no fim da classe
	@AfterClass
	public static void afterClassNotation() {		
		System.out.println("afterClass");
	}
	
	//Vai ser executar antes de cada @Test
	@Before
	public void beforeEachNotation() {
		System.out.println("before");
	}
	
	//Vai ser executar apos cada @Test
	@After
	public void afterNotation() {
		System.out.println("after");
	}	
	
	@Test
	public void testNotation() {
		System.out.println("test");
	}
	
	@Test
	public void testDoisNotation() {
		System.out.println("testDois");
	}
		


}
