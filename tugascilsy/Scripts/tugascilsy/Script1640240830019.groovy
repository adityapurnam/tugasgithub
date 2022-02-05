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

WebUI.navigateToUrl('https://www.cilsy.id/')

WebUI.click(findTestObject('Object Repository/Page_Kursus Online Server dan Jaringan  Cilsy.id/a_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Masuk  Cilsy.id/button_MASUK'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk  Cilsy.id/input_Email_email'), 'wijaya@mailnesia.com')

WebUI.click(findTestObject('Object Repository/Page_Masuk  Cilsy.id/button_MASUK'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  Cilsy.id/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Masuk  Cilsy.id/button_MASUK'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk  Cilsy.id/input_Email_email'), 'wijaya@mailnesia.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  Cilsy.id/input_Password_password'), 'Tscr9DIxB28=')

WebUI.click(findTestObject('Object Repository/Page_Masuk  Cilsy.id/button_MASUK'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk  Cilsy.id/input_Email_email'), 'wijaya@mailnesia.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  Cilsy.id/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Masuk  Cilsy.id/button_MASUK'))

WebUI.click(findTestObject('Object Repository/Page_Kursus Online Server dan Jaringan  Cilsy.id/a_Browse'))

WebUI.click(findTestObject('Object Repository/Page_Kursus Online Server dan Jaringan  Cilsy.id/a_Tutorial'))

WebUI.click(findTestObject('Object Repository/Page_Browse Tutorial  Cilsy.id/strong_Tutorial Administrasi Server dengan _fc19b7'))

WebUI.click(findTestObject('Object Repository/Page_Tutorial Administrasi Server dengan Ce_10d4f4/img_Lihat Semua Pemberitahuan_icon'))

WebUI.click(findTestObject('Object Repository/Page_Tutorial Administrasi Server dengan Ce_10d4f4/a_Logout'))

WebUI.closeBrowser()

