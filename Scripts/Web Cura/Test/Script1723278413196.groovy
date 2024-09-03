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
import com.kms.katalon.core.testobject.ConditionType


WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)


WebUI.click(new TestObject().addProperty('id',ConditionType.EQUALS,'btn-make-appointment'))


username = WebUI.getAttribute(findTestObject('Object Repository/Page_CURA Healthcare Service/text_username_cura/Page_CURA Healthcare Service/text_username'),'value')

System.out.println(username)

password = WebUI.getAttribute(findTestObject('Object Repository/Page_CURA Healthcare Service/text_Password'),'value')

System.out.println(password)


CustomKeywords.'curaCare.functionAppoinment.inputUsername_Password'(username, password)


WebUI.click(new TestObject().addProperty('id',ConditionType.EQUALS,'btn-login'))


























