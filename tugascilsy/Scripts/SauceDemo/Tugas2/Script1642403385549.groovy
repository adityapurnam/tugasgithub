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

price1 = listofprice.get(0).getText()

System.out.println(price1)

listofelements.get(0).click()

price2 = listofprice.get(1).getText()

System.out.println(price2)

listofelements.get(1).click()

WebUI.click(findTestObject('Sauce_Demo/cart'))

List cartprice = WebUI.findWebElements(findTestObject('Sauce_Demo/cart_price'), 6)

cartpricelist1 = cartprice.get(0).getText()

System.out.println(cartpricelist1)

cartpricelist2 = cartprice.get(1).getText()

System.out.println(cartpricelist2)

if ((price1 == cartpricelist1) && (price2 == cartpricelist2)) {
    System.out.println('Harga Sama')
} else {
    System.out.println('Harga Beda')
}

WebUI.click(findTestObject('Sauce_Demo/checkout'))

WebUI.sendKeys(findTestObject('Sauce_Demo/firstname'), 'etwetw')

WebUI.sendKeys(findTestObject('Sauce_Demo/lastname'), 'etwetw')

WebUI.sendKeys(findTestObject('Sauce_Demo/zip'), '576587')

WebUI.click(findTestObject('Sauce_Demo/continue_button'))

cart1 = WebUI.getText(findTestObject('Sauce_Demo/cartitem1'))

cart2 = WebUI.getText(findTestObject('Sauce_Demo/cartitem2'))

checkout = WebUI.getText(findTestObject('Sauce_Demo/subtotal'))

cart1 = cart1.replaceAll('\\D+', '')

cart2 = cart2.replaceAll('\\D+', '')

checkout = checkout.replaceAll('\\D+', '')

// checkout = checkout.replace("Item total: $","")
double cart1new = Double.parseDouble(cart1)
System.out.println(cart1new)
double cart2new = Double.parseDouble(cart2)
System.out.println(cart2new)
double checkoutnew = Double.parseDouble(checkout)
System.out.println(checkoutnew)

double Hasil = cart1new + cart2new

System.out.println(Hasil)

WebUI.verifyEqual(checkoutnew, Hasil)

