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

WebUI.click(findTestObject('Object Repository/Page_NPRU Alumni/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__Std_ID'), '614259100')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__classroom'), '61/1')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__Name_LastName'), 'ออ อด')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__ID_Card'), '1234567891234')

WebUI.click(findTestObject('Object Repository/Page_NPRU Alumni/input__Sex'))

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__Tel'), '0231456987')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__E_mail'), 'w@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__Facebook'), 'f')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__Instagram'), 'ig')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__Name_LastName'), 'qw')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__End_Year'), 'su')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__district'), 'บล')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__canton'), 'สอง')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__province'), 'สุ1000')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__Postal_code'), '72110')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__Company_Name'), 'ยวย')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/textarea__Company_Address'), '12/100')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__Profession'), 'we')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__Rank'), 'web')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__Company_Tel'), '098723456')

WebUI.setText(findTestObject('Object Repository/Page_NPRU Alumni/input__Username'), 'earth111')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NPRU Alumni/input__Password'), 'VIjOZClaB9I=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NPRU Alumni/input__Re_Password'), 'VIjOZClaB9I=')

WebUI.click(findTestObject('Object Repository/Page_NPRU Alumni/input__submit'))

WebUI.verifyTextPresent('ไม่สามารถเพิ่มข้อมูลได้ค่ะ !', false)

WebUI.closeBrowser()

