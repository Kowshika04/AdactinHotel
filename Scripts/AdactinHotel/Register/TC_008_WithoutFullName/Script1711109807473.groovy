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

WebUI.click(findTestObject('Register/Page_Adactin.com - Hotel Reservation System/a_New User Register Here'))

title = WebUI.getText(findTestObject('Register/Page_Adactin.com - New User Registration/New User Registration Form_Title'))

WebUI.verifyEqual(title, 'New User Registration Form (Fields marked with Red asterix (*) are mandatory)')

WebUI.setText(findTestObject('Register/Page_Adactin.com - New User Registration/input__username'), findTestData('AdactinHotelTestData').getValue(
        1, 1))

WebUI.setText(findTestObject('Register/Page_Adactin.com - New User Registration/input__password'), findTestData('AdactinHotelTestData').getValue(
        2, 1))

WebUI.setText(findTestObject('Register/Page_Adactin.com - New User Registration/input__re_password'), findTestData('AdactinHotelTestData').getValue(
        3, 1))

WebUI.setText(findTestObject('Register/Page_Adactin.com - New User Registration/input__email_add'), findTestData('AdactinHotelTestData').getValue(
        5, 1))

WebUI.setText(findTestObject('Register/Page_Adactin.com - New User Registration/input__captcha'), findTestData('AdactinHotelTestData').getValue(
        6, 1))

WebUI.click(findTestObject('Register/Page_Adactin.com - New User Registration/input_I agree to_tnc_box'))

WebUI.click(findTestObject('Register/Page_Adactin.com - New User Registration/input_Terms  Conditions_Submit'))

fullName = WebUI.getText(findTestObject('Register/Page_Adactin.com - New User Registration/label_Full Name is Empty'))

WebUI.verifyEqual(fullName, 'Full Name is Empty')

WebUI.closeBrowser()

