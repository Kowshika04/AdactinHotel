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

WebUI.selectOptionByLabel(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/Select Location'), findTestData('AdactinHotelTestData').getValue(
        3, 1), false)

WebUI.selectOptionByLabel(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/Select Number of Rooms'), findTestData(
        'AdactinHotelTestData').getValue(6, 1), false)

WebUI.selectOptionByLabel(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/Select Hotel'), findTestData('AdactinHotelTestData').getValue(
        4, 1), false)

WebUI.selectOptionByLabel(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/Select Room Type'), findTestData(
        'AdactinHotelTestData').getValue(5, 1), false)

WebUI.clearText(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/datepick_in'))

WebUI.setText(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/datepick_in'), findTestData('AdactinHotelTestData').getValue(
        7, 1), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/datepick_out'))

WebUI.setText(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/datepick_out'), findTestData('AdactinHotelTestData').getValue(
        8, 1), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/Adults per Room'), findTestData('AdactinHotelTestData').getValue(
        9, 1), false)

WebUI.selectOptionByLabel(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/childrenPerRoom'), findTestData('AdactinHotelTestData').getValue(
        10, 1), false)

WebUI.click(findTestObject('Search Hotel/Page_Adactin.com - Search Hotel/Submit'))

data2 = WebUI.getText(findTestObject('Object Repository/Search Hotel/Page_Adactin.com - Search Hotel/Page_Adactin.com - Select Hotel/td_Select Hotel'))

WebUI.verifyEqual(data2, 'Select Hotel')

WebUI.click(findTestObject('SelectHotel/Page_Adactin.com - Select Hotel/input_Total Price (excl. GST)_radiobutton_0'))

WebUI.click(findTestObject('SelectHotel/Page_Adactin.com - Select Hotel/input_Total Price (excl. GST)_continue'))

data3 = WebUI.getText(findTestObject('SelectHotel/Page_Adactin.com - Book A Hotel/td_Book A Hotel'))

WebUI.verifyEqual(data3, 'Book A Hotel')

WebUI.setText(findTestObject('Booking/Page_Adactin.com - Book A Hotel/input__first_name'), findTestData('AdactinHotelTestData').getValue(
        11, 1))

WebUI.setText(findTestObject('Booking/Page_Adactin.com - Book A Hotel/input__last_name'), findTestData('AdactinHotelTestData').getValue(
        12, 1))

WebUI.setText(findTestObject('Booking/Page_Adactin.com - Book A Hotel/textarea__address'), findTestData('AdactinHotelTestData').getValue(
        13, 1))

WebUI.setText(findTestObject('Booking/Page_Adactin.com - Book A Hotel/input__cc_num'), findTestData('AdactinHotelTestData').getValue(
        14, 1))

WebUI.selectOptionByLabel(findTestObject('Booking/Page_Adactin.com - Book A Hotel/Select Credit Card Type'), findTestData(
        'AdactinHotelTestData').getValue(15, 1), false)

WebUI.selectOptionByLabel(findTestObject('Booking/Page_Adactin.com - Book A Hotel/Select Year'), findTestData('AdactinHotelTestData').getValue(
        17, 1), false)

WebUI.setText(findTestObject('Booking/Page_Adactin.com - Book A Hotel/input__cc_cvv'), findTestData('AdactinHotelTestData').getValue(
        18, 1))

WebUI.click(findTestObject('Booking/Page_Adactin.com - Book A Hotel/input__book_now'))

data4 = WebUI.getText(findTestObject('Booking/Page_Adactin.com - Book A Hotel/label_Please Select your Credit Card Expiry Month'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(data4, 'Please Select your Credit Card Expiry Month')

WebUI.closeBrowser()

