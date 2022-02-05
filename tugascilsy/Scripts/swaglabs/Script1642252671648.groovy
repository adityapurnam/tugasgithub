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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.saucedemo.com/')

for (def index : (1..3)) {
    WebUI.setText(findTestObject('swaglabs/input_username'), findTestData('swaglabs').getValue(2, index))

    WebUI.setText(findTestObject('swaglabs/input_password'), findTestData('swaglabs').getValue(3, index))

    WebUI.click(findTestObject('swaglabs/button_login'))

    String isSuksesLogin = findTestData('swaglabs').getValue(4, index)

    if (isSuksesLogin == 'gagal') {
        WebUI.verifyElementPresent(findTestObject('swaglabs/invalidnouspas'), 0)
    } else {
        WebUI.verifyElementPresent(findTestObject('swaglabs/verifytext'), 0)
    }
}

WebUI.click(findTestObject('swaglabs/addcartbajup'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('swaglabs/addcartjaket'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('swaglabs/addcartlampu'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('swaglabs/addcarttas'))

WebUI.click(findTestObject('swaglabs/keranjang'))

WebUI.click(findTestObject('swaglabs/checkout'))

WebUI.setText(findTestObject('swaglabs/inputfirstname'), 'mawar')

WebUI.setText(findTestObject('swaglabs/inputlastname'), 'bunga mawar')

WebUI.setText(findTestObject('swaglabs/inputzip'), '123456')

WebUI.click(findTestObject('swaglabs/continuecheckout'))

WebUI.click(findTestObject('swaglabs/finish'))

WebUI.closeBrowser()

