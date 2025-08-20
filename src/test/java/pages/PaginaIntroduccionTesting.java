package pages;

public class PaginaIntroduccionTesting extends BasePage {
    private String introduccionTestingLink = "//a[@class='sc-dJkDXt fodGEh']";

    public PaginaIntroduccionTesting() {
        super(driver);
    }
    public void clickIntroduccionTestingLink() {
        clickElement(introduccionTestingLink);
    }
}
