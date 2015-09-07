package demo.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractPage {

	@Autowired
	protected WebDriver webdriver;
}
