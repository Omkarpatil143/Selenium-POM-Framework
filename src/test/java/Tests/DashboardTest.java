package Tests;
import org.testng.annotations.Test;

import com.example.base;
import com.example.pages.DashboardPage;
import com.example.pages.LoginPage;

import dev.failsafe.internal.util.Assert;

public class DashboardTest extends base {
@Test
    public void testDashboardHeader()
{
    Setup();
   LoginPage loginpage = new LoginPage(driver);
    loginpage.FinalLogin("Admin", "admin123");
    DashboardPage dashboardpage=new DashboardPage(driver);
    boolean Dash=dashboardpage.isDashboardHeaderDisplayed();
    System.out.println("Dashboard header is displayed: " + Dash);
    
   TearDown();
} 
 
}  