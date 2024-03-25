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

WebUI.click(findTestObject('Register/Page_Adactin.com - New User Registration/input_Terms  Conditions_Submit'))

userName = WebUI.getText(findTestObject('Register/Page_Adactin.com - New User Registration/label_Username is Empty'))

WebUI.verifyEqual(userName, 'Username is Empty')

password = WebUI.getText(findTestObject('Register/Page_Adactin.com - New User Registration/label_Password is Empty'))

WebUI.verifyEqual(password, 'Password is Empty')

confirmPassword = WebUI.getText(findTestObject('Register/Page_Adactin.com - New User Registration/label_Confirm Password is Empty'))

WebUI.verifyEqual(confirmPassword, 'Confirm Password is Empty')

fullName = WebUI.getText(findTestObject('Register/Page_Adactin.com - New User Registration/label_Full Name is Empty'))

WebUI.verifyEqual(fullName, 'Full Name is Empty')

email = WebUI.getText(findTestObject('Register/Page_Adactin.com - New User Registration/label_Email Address is Empty'))

WebUI.verifyEqual(email, 'Email Address is Empty')

captcha = WebUI.getText(findTestObject('Register/Page_Adactin.com - New User Registration/label_Captcha is Empty'))

WebUI.verifyEqual(captcha, 'Captcha is Empty')

termsAndConditions = WebUI.getText(findTestObject('Register/Page_Adactin.com - New User Registration/label_You must agree to Terms and Conditions'))

WebUI.verifyEqual(termsAndConditions, 'You must agree to Terms and Conditions')

WebUI.closeBrowser()

