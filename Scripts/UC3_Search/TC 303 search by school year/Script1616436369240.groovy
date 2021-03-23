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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/Alumni/index.php/Alumni/index')

WebUI.click(findTestObject('Object Repository/Page_NPRU Alumni/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input_Register_Username'), 'earth')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NPRU Alumni/input_Register_Password'), 'VIjOZClaB9I=')

WebUI.click(findTestObject('Object Repository/Page_NPRU Alumni/input_Register_login'))

WebUI.click(findTestObject('Object Repository/Page_NPRU Alumni/i__fas fa-search'))

WebUI.click(findTestObject('search/Page_NPRU Alumni/button_yaer'))

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__End_Year'), '2561')

WebUI.click(findTestObject('Object Repository/Page_NPRU Alumni/input__search'))

WebUI.verifyTextPresent('61/111', false)

WebUI.closeBrowser()

