package demo.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.OpsSeleniumApplication;
import demo.pages.LoginPage;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = OpsSeleniumApplication.class)
public class LoginTest {

	@Autowired
	private LoginPage loginPage;

	@Test
	public void testLogin() {

	}
}
