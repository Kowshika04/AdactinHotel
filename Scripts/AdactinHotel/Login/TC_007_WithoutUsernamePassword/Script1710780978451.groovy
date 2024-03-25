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

WebUI.openBrowser('https://adactinhotelapp.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Login/Page_Adactin.com - Hotel Reservation System/input_Username_username'), findTestData(
        'AdactinHotelTestData').getValue(1, 19))

WebUI.setText(findTestObject('Login/Page_Adactin.com - Hotel Reservation System/input_Password_password'), findTestData(
        'AdactinHotelTestData').getValue(2, 19))

WebUI.click(findTestObject('Login/Page_Adactin.com - Hotel Reservation System/input_Forgot Password_login'))

data7 = WebUI.getText(findTestObject('Login/Page_Adactin.com - Hotel Reservation System/span_Enter Username'))

WebUI.verifyEqual(data7, 'Enter Username')

WebUI.closeBrowser()

