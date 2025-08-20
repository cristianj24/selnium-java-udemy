package pages;

public class PaginaCheckoutCart extends BasePage {
    private String inputMail = "//input[@id='student_email']";
    private String buttonContinue="//button[@class='btn btn-md btn-dark']";
    
    public PaginaCheckoutCart() {
        super(driver);
    }
    public void writeMail(String keysToSend) {
        write(inputMail, keysToSend);
    }
    public void clickContinue() {
        clickElement(buttonContinue);
    }
}
