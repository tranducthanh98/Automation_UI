package Tests;

import org.testng.annotations.BeforeTest;

public class a extends BaseTest{
    @BeforeTest
    @Override
    public void OpenBrowser() throws InterruptedException {
        super.OpenBrowser();
    }

    @Override
    public void User() {
        super.User();
    }
}
