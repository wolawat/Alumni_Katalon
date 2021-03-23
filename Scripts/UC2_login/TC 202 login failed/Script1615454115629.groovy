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

WebUI.setViewPortSize(1600, 900)

WebUI.navigateToUrl('http://localhost/Alumni/index.php/Alumni/index')

WebUI.click(findTestObject('Object Repository/Page_NPRU Alumni/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input_Register_Username'), 'thanayutz')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NPRU Alumni/input_Register_Password'), 'SFTQUhjBfIY=')

WebUI.sendKeys(findTestObject('Object Repository/Page_NPRU Alumni/input_Register_Password'), Keys.chord(Keys.ENTER))

WebUI.verifyAlertPresent(0, FailureHandling.STOP_ON_FAILURE)

'Get text alert on the alert when it\'s shown'
alertText = WebUI.getAlertText()

'Verify text alert is correct or not'
WebUI.verifyMatch(alertText, 'กรุณาสมัครสมาชิกก่อนค่ะ!', false)

WebUI.closeBrowser()

