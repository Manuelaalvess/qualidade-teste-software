// Exercicio pratico: Cadastro de Usuario
// Step definitions do Cucumber, automatizando o cadastroUsuario.feature com Selenium WebDriver

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CadastroUsuarioSteps {

    private WebDriver driver = new ChromeDriver();

    @Dado("que estou na pagina de cadastro")
    public void queEstouNaPaginaDeCadastro() {
        driver.get("http://localhost:8080/cadastro");
    }

    @Quando("eu preencho o campo nome com {string}")
    public void euPreenchoOCampoNomeCom(String nome) {
        driver.findElement(By.id("nome")).sendKeys(nome);
    }

    @Quando("eu preencho o campo email com {string}")
    public void euPreenchoOCampoEmailCom(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    @Quando("eu deixo o campo email vazio")
    public void euDeixoOCampoEmailVazio() {
        driver.findElement(By.id("email")).clear();
    }

    @Quando("eu preencho o campo senha com {string}")
    public void euPreenchoOCampoSenhaCom(String senha) {
        driver.findElement(By.id("senha")).sendKeys(senha);
    }

    @Quando("eu clico no botao cadastrar")
    public void euClicoNoBotaoCadastrar() {
        driver.findElement(By.id("btnCadastrar")).click();
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
