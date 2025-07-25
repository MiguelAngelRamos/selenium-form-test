package cl.kibernumacademy.form.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class FormularioPage {
  private WebDriver driver;

  // Localizadores
  private By firstName = By.id("firstName");
  private By lastName = By.id("lastName");
  private By userEmail = By.id("userEmail");

  private By genderMale = By.id("genderMale");
  private By genderFemale = By.id("genderFemale");
  private By genderOther = By.id("genderOther");

  private By userNumber = By.id("userNumber");

  private By hobbyReading = By.id("hobbyReading");
  private By hobbyMusic = By.id("hobbyMusic");
  private By hobbySports = By.id("hobbySports");

  private By currentAddress = By.id("currentAddress");
  private By stateSelect = By.id("stateSelect");

  private By citySelect = By.id("citySelect");
  private By submitButton = By.id("submitBtn");

  private By modalBodyContent = By.id("confirmationModal");

  public FormularioPage(WebDriver driver) {
    this.driver = driver;
  }

  public void setFirstName(String name) {
    driver.findElement(firstName).clear();
    driver.findElement(firstName).sendKeys(name);
  }
  public void setLastName(String last) {
    driver.findElement(lastName).clear();
    driver.findElement(lastName).sendKeys(last);
  }

  public void setUserEmail(String email) {
    driver.findElement(userEmail).clear();
    driver.findElement(userEmail).sendKeys(email);
  }

  public void setMobile(String mobile) {
    driver.findElement(userNumber).clear();
    driver.findElement(userNumber).sendKeys(mobile);
  }

  public void setAddress(String address) {
    driver.findElement(currentAddress).clear();
    driver.findElement(currentAddress).sendKeys(address);
  }

  /*
   *  * public void selectGender(String gender) {
     *     driver.findElement(By.xpath("//label[text()='" + gender + "']")).click();
     * }
   */
  public void selectGender(String gender) {
    switch(gender.toLowerCase()) {
      case "masculino":
        driver.findElement(genderMale).click();
        break;
      case "femenino":
        driver.findElement(genderFemale).click();
        break;
      case "otro":
        driver.findElement(genderOther).click();
        break;
      default:
        System.out.println("Género no válido");
        break;
    }
  }


}
