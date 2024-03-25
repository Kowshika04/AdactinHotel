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
        'AdactinHotelTestData').getValue(1, 1))

WebUI.setText(findTestObject('Login/Page_Adactin.com - Hotel Reservation System/input_Password_password'), findTestData(
        'AdactinHotelTestData').getValue(2, 1))

WebUI.click(findTestObject('Login/Page_Adactin.com - Hotel Reservation System/input_Forgot Password_login'))

data1 = WebUI.getAttribute(findTestObject('Login/Page_Adactin.com - Hotel Reservation System/input__username_show'), 'value')

WebUI.verifyEqual(data1, 'Hello Shanmathi22!')

System.out.println(data1)

WebUI.selectOptionByLabel(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/Select Location'), findTestData('AdactinHotelTestData').getValue(
        3, 1), false)

WebUI.selectOptionByLabel(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/Select Number of Rooms'), findTestData(
        'AdactinHotelTestData').getValue(6, 2), false)

WebUI.clearText(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/datepick_in'))

WebUI.setText(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/datepick_in'), findTestData('AdactinHotelTestData').getValue(
        7, 1), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/datepick_out'))

WebUI.setText(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/datepick_out'), findTestData('AdactinHotelTestData').getValue(
        8, 1), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/Adults per Room'), findTestData('AdactinHotelTestData').getValue(
        9, 1), false)

WebUI.click(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/Submit'))

data2 = WebUI.getText(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/span_Please Select Total Number of Rooms'))

WebUI.verifyEqual(data2, 'Please Select Total Number of Rooms')

System.out.println(data2)

WebUI.closeBrowser()

