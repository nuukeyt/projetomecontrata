package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import junit.framework.Assert;

public class cadastroSteps {
	private WebDriver driver;
	@Dado("que foi feita a aplicacao no site")
	public void queFoiFeitaAAplicacaoNoSite() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\WebDriver\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me");
		driver.manage().window().maximize();
	}
	@Quando("clicar em novo usuario")
	public void clicarEmNovoUsuario() {
		driver.findElement(By.xpath("//a[contains(.,'Novo usuário?')]")).click();
	}
	
	@E("preencher o campo de nome {string}")
	public void preencherOCampoDeNome(String usuario) {
		driver.findElement(By.id("nome")).sendKeys(usuario);
	}

	@E("preencha o campo de email {string}")
	public void preenchaOCampoDeEmail(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
	}

	@E("preencha o campo de senha {string}")
	public void preenchaOCampoDeSenha(String senha) {
		driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys(senha);
	}
	@Quando("clicar no botao de cadastro")
	public void clicarNoBotaoDeCadastro() {
		driver.findElement(By.xpath("//input[@type= 'submit']")).click();
	}

	@Entao("visualizo a mensagem de sucesso")
	public void visualizoAMensagemDeSucesso() {
		String texto = driver.findElement(By.xpath("//div[@role= 'alert']")).getText();
		Assert.assertEquals("Usuário inserido com sucesso", texto);
	}
}
