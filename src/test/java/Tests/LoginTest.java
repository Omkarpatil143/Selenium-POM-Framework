package Tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.example.base;
import com.example.pages.LoginPage; 

public class LoginTest extends base {
    @BeforeMethod
    public void OpenBroweser() {
        Setup();
    }
    @Test 
    public void LoginTestj() {
       LoginPage login = new LoginPage(driver);
        login.FinalLogin("Admin","Admin");
       

    }
    @AfterMethod 
    public void CloseBroweser()
    {
        TearDown();
    }
}
