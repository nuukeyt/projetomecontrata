package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import junit.framework.Assert;

public class Steps {
	private WebDriver driver;
	@Dado("que estou acessando a aplicacao")
	public void queEstouAcessandoAAplicacao() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Driver Chrome\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me");
	}

	@Quando("informo o usuario {string}")
	public void informoOUsuario(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
	}

	@Quando("a senha {string}")
	public void aSenha(String senha) {
		driver.findElement(By.id("senha")).sendKeys(senha);
	}

	@Quando("seleciono entrar")
	public void selecionoEntrar() {
		driver.findElement(By.tagName("button")).click();
	}

	@Entao("visualizo a pagina inicial")
	public void visualizoAPaginaInicial() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals("Bem vindo, pedrinskate2!", texto);
		
	}

	@Quando("seleciono Contas")
	public void selecionoContas() {
		driver.findElement(By.className("dropdown-toggle")).click();
	}

	@Quando("seleciono Adicionar")
	public void selecionoAdicionar() {
		String palavra = driver.findElement(By.linkText("Adicionar")).getText();
		Assert.assertEquals("Adicionar", palavra);
		driver.findElement(By.linkText("Adicionar")).click();
	}

	@Quando("informo a conta {string}")
	public void informoAConta(String conta) {
		driver.findElement(By.id("nome")).sendKeys(conta);
	}

	@Quando("seleciono Salvar")
	public void selecionoSalvar() {
		driver.findElement(By.tagName("button")).click();
	}

	@Entao("a conta e inserida com sucesso")
	public void aContaEInseridaComSucesso() {
		String frase = driver.findElement(By.linkText("Conta adicionada com sucesso!")).getText();
		Assert.assertEquals("Conta, adicionada com sucesso!", frase);
		
		
	}
}
