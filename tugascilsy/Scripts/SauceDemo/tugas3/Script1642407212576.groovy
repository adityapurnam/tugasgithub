import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.sendKeys(findTestObject('Sauce_Demo/username'), 'standard_user')

WebUI.sendKeys(findTestObject('Sauce_Demo/password'), 'secret_sauce')

WebUI.click(findTestObject('Sauce_Demo/login_button'))




List listofprice = WebUI.findWebElements(findTestObject('Sauce_Demo/item_price'), 6)

List listofelements = WebUI.findWebElements(findTestObject('Sauce_Demo/item_list'), 6)







for (int i = 0; i < 3; i++) {
	
	
	
	listofelements.get(i).click()
	System.out.println(listofprice.get(i).getText())
	
		
}

WebUI.click(findTestObject('Sauce_Demo/cart'))
List cartprice = WebUI.findWebElements(findTestObject('Sauce_Demo/cart_price'), 6)
System.out.println(cartprice.get(i).getText())
WebUI.click(findTestObject('Sauce_Demo/continue_shopping'))
