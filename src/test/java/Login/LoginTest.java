package Login;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {	
	
	WebDriver navegador; 
	
	@Before
	public void openBrowser() {
		// Abrir Navegador
		//System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().window().maximize();	 
	}
	
	@After
	public void quitBrowser() {
		// Fechando o navegador
		//navegador.close();
		//navegador.quit();
	}
	
	@Test
	public void buscaProduto() {
		// Navegar para a pagina
		navegador.get("http://amazon.com.br");
		Assert.assertEquals("Livros", navegador.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).getText());
		
		// Fazer uma busca de produto
		navegador.findElement(By.id("twotabsearchtextbox")).sendKeys("smartphone");
		navegador.findElement(By.id("nav-search-submit-button")).click();		
	}
	

}
