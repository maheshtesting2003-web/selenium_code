package methods_of_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebElementAWP {

    public static void main(String[] args) throws InterruptedException {
        
        // 1. Initialize WebDriver (Assuming Selenium 4.6+ where driver management is automatic)
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        // Initialize WebDriverWait for custom modal transitions
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Replace with the actual path or URL to your HTML file
            driver.get("https://automationwithpiyush.vercel.app/elements.html"); 

            // ==========================================
            // PART 1: GUI Input Forms
            // ==========================================
            System.out.println("Filling out the form...");
            
            driver.findElement(By.id("name")).sendKeys("Piyush Baldaniya");
            driver.findElement(By.id("email")).sendKeys("Automation.With.Piyush@gmail.com");
            driver.findElement(By.id("address")).sendKeys("Noida, Uttar Pradesh, India");

            // Radio Buttons & Checkboxes
            driver.findElement(By.xpath("//input[@name='gender' and @value='male']")).click();
            driver.findElement(By.id("monday")).click();
            driver.findElement(By.id("wednesday")).click();

            // Select Dropdown
            Select countrySelect = new Select(driver.findElement(By.id("country")));
            countrySelect.selectByValue("india");

            // Date Picker
            driver.findElement(By.id("datepicker")).sendKeys("01-02-2026");


            // ==========================================
            // PART 2: Custom Modals & Popups
            // ==========================================
            System.out.println("Handling custom modals...");
            
            // 2A. Notice Alert
            driver.findElement(By.xpath("//button[contains(text(), 'Notice Alert')]")).click();
            WebElement confirmBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("modal-btn-confirm")));
            confirmBtn.click();
            
            // Wait for modal to disappear before clicking next
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("custom-modal-backdrop")));

            // 2B. Confirm Action
            driver.findElement(By.xpath("//button[contains(text(), 'Confirm Action')]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("modal-btn-confirm"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("custom-modal-backdrop")));

            // 2C. Input Prompt
            driver.findElement(By.xpath("//button[contains(text(), 'Input Prompt')]")).click();
            WebElement modalInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modal-input")));
            modalInput.clear();
            modalInput.sendKeys("Automation Master");
            driver.findElement(By.id("modal-btn-confirm")).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("custom-modal-backdrop")));


            // ==========================================
            // PART 3: Advanced Interactions (Actions Class)
            // ==========================================
            System.out.println("Performing advanced interactions...");
            Actions actions = new Actions(driver);

            // Double Click
            WebElement doubleClickBtn = driver.findElement(By.xpath("//button[contains(text(), 'Double Click to Copy')]"));
            actions.doubleClick(doubleClickBtn).perform();

            // Drag and Drop
            WebElement source = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droppable"));
            
            // Adding a slight pause so you can see it happen visually
            Thread.sleep(1000); 
            actions.dragAndDrop(source, target).perform();

            // ==========================================
            // PART 4: Read Data from Static Table
            // ==========================================
            System.out.println("Reading table data...");
            String bookPrice = driver.findElement(By.xpath("//table[@id='productTable']//tr[td[text()='Learn Selenium']]/td[4]")).getText();
            System.out.println("Price of 'Learn Selenium' book is: " + bookPrice);

            System.out.println("Test Execution Completed Successfully!");

        } finally {
            // Optional: Pause to view the final state before closing
            Thread.sleep(3000); 
            driver.quit();
        }
    }
}
