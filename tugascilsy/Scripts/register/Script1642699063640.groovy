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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.delay(10)

WebUI.click(findTestObject('midtrans/regist/signupawal'))

WebUI.switchToWindowUrl('https://account.midtrans.com/register', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('midtrans/regist/businessname'), 'arka')

WebUI.setText(findTestObject('midtrans/regist/fullname'), 'arkadia')

WebUI.setText(findTestObject('midtrans/regist/email'), 'arka@mailnesia.com')

WebUI.setText(findTestObject('midtrans/regist/phonenumber'), '81209189383')

WebUI.setText(findTestObject('midtrans/regist/password'), '12345678Aa')

WebUI.setText(findTestObject('midtrans/regist/passconfirmation'), '12345678Aa')

WebUI.click(findTestObject('midtrans/regist/register'))

WebUI.verifyImagePresent(findTestObject('midtrans/regist/imageverify'))

