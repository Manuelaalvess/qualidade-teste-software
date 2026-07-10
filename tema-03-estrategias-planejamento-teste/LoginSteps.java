// Tema 3. Estrategias e planejamento de teste
// Step definitions do Cucumber, cada linha do login.feature
// vira uma chamada real ao Selenium WebDriver no navegador

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    private WebDriver driver = new ChromeDriver();

    @Dado("que estou na pagina de login")
    public void queEstouNaPaginaDeLogin() {
        driver.get("http://localhost:8080/login");
    }

    @Quando("eu preencho o campo usuario com {string}")
    public void euPreenchoOCampoUsuarioCom(String usuario) {
        driver.findElement(By.id("usuario")).sendKeys(usuario);
    }

    @Quando("eu preencho o campo senha com {string}")
    public void euPreenchoOCampoSenhaCom(String senha) {
        driver.findElement(By.id("senha")).sendKeys(senha);
    }

    @Quando("eu clico no botao entrar")
    public void euClicoNoBotaoEntrar() {
        driver.findElement(By.id("btnEntrar")).click();
    }

    @Entao("eu devo ver a mensagem {string}")
    public void euDevoVerAMensagem(String mensagemEsperada) {
        String mensagem = driver.findElement(By.id("mensagem")).getText();
        assertEquals(mensagemEsperada, mensagem);
    }

    @Entao("eu devo ver a mensagem de erro {string}")
    public void euDevoVerAMensagemDeErro(String mensagemEsperada) {
        String mensagem = driver.findElement(By.id("erro")).getText();
        assertEquals(mensagemEsperada, mensagem);
    }
}
