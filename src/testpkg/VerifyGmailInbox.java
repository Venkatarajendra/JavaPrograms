package testpkg;

import java.util.List;

import org.openqa.selenium.WebElement;

public class VerifyGmailInbox {	
	
	public boolean verifyField(List<WebElement> inputList, String inputstr) {
		boolean result=false;
		for (int i=0; i<inputList.size(); i++) {
			String act = inputList.get(i).getText();
			if(act.equalsIgnoreCase(inputstr)) {
				result = true;
				break;
				//System.out.println("Given field exists");
			}
			
			
		}
		
		return result;
		
	}
	
	
	

}
