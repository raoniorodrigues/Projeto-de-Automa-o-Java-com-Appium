package org.example;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class Appium {
    public static void main(String[] args) {
        // Configurar as capacidades desejadas (Desired Capabilities)
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554"); // Substitua pelo nome do seu dispositivo Android
        capabilities.setCapability("platformName", "Android");
        //capabilities.setCapability("appPackage", "com.android.calculator2");
        //capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        capabilities.setCapability("app", "/Users/raonicandidookabayashirodrigues/Documents/Automation/JavaAppiumRamblasAcademy/app/app.apk");


        // Inicializar o driver do Appium
        try {
            URL appiumServerURL = new URL("http://localhost:4723/wd/hub"); // Substitua pela URL correta do servidor do Appium
            AndroidDriver<MobileElement> driver = new AndroidDriver<>(appiumServerURL, capabilities);

            // Aguardar um tempo para visualização
            Thread.sleep(5000);

            // Realize suas ações de teste aqui, como clicar em botões, inserir valores etc.

            // Fechar o driver
            driver.quit();
        } catch (MalformedURLException e) {
            System.out.println("URL inválida: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Interrupção do thread: " + e.getMessage());
        }
    }
}
