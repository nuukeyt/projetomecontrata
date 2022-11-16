package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class cursoemvideoSteps {
	
	private WebDriver driver;
	@Dado("que foi feita a aplicacao no site {string}")
	public void queFoiFeitaAAplicacaoNoSite(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}

	@Quando("clickar em profissao analista de testes")
	public void clickarEmProfissaoAnalistaDeTestes() {
		driver.findElement(By.xpath("//a [@class='fade-in-up-1']")).click();
		
	}

	@Entao("faco a inscricao")
	public void facoAInscricao() {
	}

	@E("visualizo a pagina de compra")
	public void visualizoAPaginaDeCompra() {
		
	}
}
