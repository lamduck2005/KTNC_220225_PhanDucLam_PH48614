import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDriver {
    ChromeDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test() {
        driver.get("https://vitimex.com.vn");
        WebElement cuaHangLink = driver.findElement(By.id("menu_item_36"));
        cuaHangLink.click();

        WebElement tinhThanhPhoSelect = driver.findElement(By.id("province"));
        WebElement haNoiOption = tinhThanhPhoSelect.findElement(By.xpath("//*[@id=\"province\"]/option[2]"));

        haNoiOption.click();

        WebElement searchInput = driver.findElement(By.id("search-showroom"));
        searchInput.sendKeys("Vitimex BigC Thăng Long - Hà Nội");

//        Thread.sleep(2000);
    }

    @Test
    public void test2() {
        driver.get("https://vitimex.com.vn");
        WebElement sanPhamLink = driver.findElement(By.id("menu_item_1"));
        sanPhamLink.click();

        WebElement sanPhamLink1 = driver.findElement(By.xpath("//*[@id=\"myPage\"]/div[2]/div[2]/div/div/div[1]/div/div[208]/a"));
        sanPhamLink1.click();

        WebElement mauSac = driver.findElement(By.xpath("//*[@id=\"page0\"]"));
        mauSac.click();

        WebElement kichThuoc = driver.findElement(By.xpath("//*[@id=\"size4\"]"));
        kichThuoc.click();

        WebElement themVaoGioHang = driver.findElement(By.xpath("//*[@id=\"addCart_page0\"]"));
        themVaoGioHang.click();


    }

    @AfterEach
    public void cleanUp() {
//        driver.quit();

    }
}
