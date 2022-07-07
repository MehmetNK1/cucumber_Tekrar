package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage = new GuruPage();
    @Given("cookies sorulursa kabul eder")
    public void cookies_sorulursa_kabul_eder() {
        Driver.getDriver().switchTo().frame(guruPage.cookiesIframe);
        guruPage.acceptCookies.click();
    }
    @Given("{string} , surunundaki tum degerleri yazdirir")
    public void surunundaki_tum_degerleri_yazdirir(String istenenSutun) {

        List<WebElement> tabloBaslikListesi = guruPage.baslikListesi;

        int istenenBaslikIndexi =-3;
        for (int i =0; i < tabloBaslikListesi.size(); i++){
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikIndexi=i+1;
                break;
            }
        }

        if (istenenBaslikIndexi != -3){
            List<WebElement> istenenSutundakiElementler=
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));

            for (WebElement each : istenenSutundakiElementler){
                System.out.println(each.getText());
            }

        }else{
            System.out.println("istenen baslik bulunamadi");
        }
    }
}
