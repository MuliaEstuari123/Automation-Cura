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
import java.time.format.DateTimeFormatter
import java.text.SimpleDateFormat


String command = 'I already apply appointment'

SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
Calendar calendar = Calendar.getInstance();
String currentDate = dateFormat.format(calendar.getTime());


calendar.add(Calendar.DATE, 2);
String futureDate = dateFormat.format(calendar.getTime());


WebUI.callTestCase(findTestCase('Web Cura/Login Cura'), [('username'):'John Doe',('password'):'ThisIsNotAPassword'])


WebUI.selectOptionByIndex(new TestObject().addProperty('id',ConditionType.EQUALS,"combo_facility"),2)

WebUI.click(new TestObject().addProperty('id',ConditionType.EQUALS,"chk_hospotal_readmission"))

WebUI.click(new TestObject().addProperty('id',ConditionType.EQUALS,"radio_program_medicaid"))


WebUI.setText(new TestObject().addProperty('id',ConditionType.EQUALS,"txt_visit_date"),currentDate)

WebUI.click(new TestObject().addProperty('id',ConditionType.EQUALS,"txt_comment"))

WebUI.setText(new TestObject().addProperty('id',ConditionType.EQUALS,"txt_comment"),command)

WebUI.click(new TestObject().addProperty('id',ConditionType.EQUALS,"btn-book-appointment"))
















