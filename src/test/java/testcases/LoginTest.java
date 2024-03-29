package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void LoginFailureTest() {
		LoginPage login = new LoginPage(GetDriver());
		login.LoginFunction("abc@xyz.com", "Abc@12345");

		WebElement ErrorMsg = GetDriver().findElement(By.className("error_msg"));
		System.out.println(ErrorMsg.getText());

		String actMsg = ErrorMsg.getText();
		String expMsg = "The email or password you have entered is invalid.";
		Assert.assertEquals(actMsg, expMsg);

	}

	@Test
	public void LoginSuccessTest() {
		LoginPage login = new LoginPage(GetDriver());
		login.LoginFunction("real@abc.com", "RealPwd@1234");
	}

	@Test
	public void LoginSuccessTest2() {
		LoginPage login = new LoginPage(GetDriver());
		login.LoginFunction("real@abc.com", "RealPwd@1234");
	}

}
