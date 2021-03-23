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

WebUI.click(findTestObject('Object Repository/reg/Page_NPRU Alumni/a_Register'))

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Std_ID'), '714259015')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__classroom'), '61/100')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Name_LastName'), 'holloween')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__ID_Card'), '1729800227189')

WebUI.click(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Sex'))

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Tel'), '0657756982')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__E_mail'), 'noch@gmail.com')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Facebook'), 'facebook')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Instagram'), 'instagram')

WebUI.click(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Name_LastName'))

WebUI.click(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Name_LastName'))

WebUI.setText(findTestObject('reg/Page_NPRU Alumni/input__Name_LastName - Copy'), 'holloween')

WebUI.click(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__canton'))

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__End_Year'), '2561')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__district'), 'bangtatan')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__canton'), 'songphinong')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__province'), 'supan')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Postal_code'), '72110')

WebUI.click(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Company_Name'))

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__classroom'), '61/101')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Company_Name'), 'noch')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/textarea__Company_Address'), '1158')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Profession'), 'dev')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Rank'), 'dev')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Company_Tel'), '0654486950')

WebUI.setText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Username'), 'nochee')

WebUI.setEncryptedText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Password'), 'VIjOZClaB9I=')

WebUI.setEncryptedText(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__Re_Password'), 'VIjOZClaB9I=')

WebUI.click(findTestObject('Object Repository/reg/Page_NPRU Alumni/input__submit'))

WebUI.verifyTextPresent('สาขาวิศวกรรมซอฟต์แวร์', false)

WebUI.closeBrowser()

