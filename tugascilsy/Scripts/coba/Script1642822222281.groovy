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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.click(findTestObject('midtrans/buynow/buy'))

WebUI.setText(findTestObject('midtrans/buynow/name'), GlobalVariable.name)

adit = WebUI.getAttribute(findTestObject('midtrans/buynow/name'), 'value')

System.out.println(adit)

WebUI.setText(findTestObject('midtrans/buynow/email'), GlobalVariable.betlemail)

email = WebUI.getAttribute(findTestObject('midtrans/buynow/email'), 'value')

System.out.println(email)

WebUI.setText(findTestObject('midtrans/buynow/phone'), GlobalVariable.phone)

no = WebUI.getAttribute(findTestObject('midtrans/buynow/phone'), 'value')

System.out.println(no)

WebUI.setText(findTestObject('midtrans/buynow/city'), GlobalVariable.city)

city = WebUI.getAttribute(findTestObject('midtrans/buynow/city'), 'value')

System.out.println(city)

WebUI.setText(findTestObject('midtrans/buynow/addres'), GlobalVariable.addres)

addr = WebUI.getAttribute(findTestObject('midtrans/buynow/addres'), 'value')

System.out.println(addr)

WebUI.setText(findTestObject('midtrans/buynow/postalcode'), GlobalVariable.code)

code = WebUI.getAttribute(findTestObject('midtrans/buynow/postalcode'), 'value')

System.out.println(code)

WebUI.click(findTestObject('midtrans/buynow/buttoncheckout'))

WebUI.click(findTestObject('midtrans/buynow/shippingdetail'))

newaddres = WebUI.getText(findTestObject('midtrans/buynow/addrshipingnew'))

System.out.println(newaddres)

String baruaddress = (((addr + ' ') + city) + ' ') + code

System.out.println(baruaddress)

WebUI.verifyEqual(baruaddress, newaddres)