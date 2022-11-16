package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import junit.framework.Assert;

public class barrigaLoginSteps {
	private WebDriver driver;
	@Dado ("que foi feita a aplicacao {string}")
	public void queFoiFeitaAAplicacao(String site) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		
	}
	@Quando("colocar o email {string}")
	public void colocarOEmail(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
		
	}
	@E("colocar a senha {string}")
	public void colocarASenha(String senha) {
		driver.findElement(By.id("senha")).sendKeys(senha);
	}
	@E("clickar no botao de entrar")
	public void clickarNoBotaoDeEntrar() {
		driver.findElement(By.xpath("//button [@type= 'submit']")).click();
		
	}
	@Entao ("visualizo a mensagem de bem vindo")
	public void visualizoAMensagemDeBemVindo() {
		String mensagem = driver.findElement(By.xpath("//div[@class='alert alert-success'][contains(.,'Bem vindo, test992115!')]")).getText();
		Assert.assertEquals("Bem vindo, test992115!", mensagem);
	}
}
