package org.logout1;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Blaze {
	public static void main(String[] args) throws IOException {
		Baseclass baseclass=new Baseclass();
		baseclass.getDriver();
		
		baseclass.loadurl("https://www.snapdeal.com/?utm_term=437025299421_104151711009_%7Bbidstrategy%7D&gclid=EAIaIQobChMIu63ltfGn9gIV2worCh0R9ACUEAAYASAAEgKkhPD_BwE&utm_campaign=brand_account_brandcat_cpt_1d_ftu&utm_source=earth_sembrand&utm_medium=snapdeal");
		baseclass.maximise();
		
		WebElement ok = baseclass.findLocatorByXpath("//span[@class='accountUserName col-xs-12 reset-padding']");
		ok.click();
		WebElement ok1 = baseclass.findLocatorByXpath("(//a[@href='https://www.snapdeal.com/login'])[1]");
		ok1.click();
	}

}
