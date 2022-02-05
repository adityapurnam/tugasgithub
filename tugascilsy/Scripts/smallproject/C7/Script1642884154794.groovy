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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('midtrans/buynow/buy'))

WebUI.setText(findTestObject('midtrans/buynow/inputharga'), GlobalVariable.harga)

WebUI.setText(findTestObject('midtrans/buynow/name'), GlobalVariable.name)

WebUI.setText(findTestObject('midtrans/buynow/email'), GlobalVariable.betlemail)

WebUI.setText(findTestObject('midtrans/buynow/phone'), GlobalVariable.phone)

WebUI.setText(findTestObject('midtrans/buynow/city'), GlobalVariable.city)

WebUI.setText(findTestObject('midtrans/buynow/addres'), GlobalVariable.addres)

WebUI.setText(findTestObject('midtrans/buynow/postalcode'), GlobalVariable.code)

WebUI.click(findTestObject('midtrans/buynow/buttoncheckout'))

WebUI.click(findTestObject('midtrans/buynow/shippingdetail'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('midtrans/iframe/continue'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('midtrans/iframe/visa'))

WebUI.setText(findTestObject('midtrans/iframe/inputcard'), GlobalVariable.betlnocc)

WebUI.setText(findTestObject('midtrans/iframe/inputexpirydate'), GlobalVariable.btlexpdt22)

WebUI.setText(findTestObject('midtrans/iframe/cvv'), GlobalVariable.betlcvv)

WebUI.click(findTestObject('midtrans/iframe/paynow'))

WebUI.closeBrowser()

