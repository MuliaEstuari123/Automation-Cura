package curaCare

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testobject.ConditionType

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.time.format.DateTimeFormatter
import java.text.SimpleDateFormat

import internal.GlobalVariable

public class functionAppoinment {


	@Keyword
	public void LoginCura(String username,String password) {

		WebUI.click(new TestObject().addProperty('id',ConditionType.EQUALS,"btn-make-appointment"))

		WebUI.setText(new TestObject().addProperty('id',ConditionType.EQUALS,"txt-username"),username)

		WebUI.setText(new TestObject().addProperty('id',ConditionType.EQUALS,"txt-password"),password)

		WebUI.click(new TestObject().addProperty('id',ConditionType.EQUALS,"btn-login"))
	}


	@Keyword
	public void MakeAppointment(String command) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar = Calendar.getInstance();
		String currentDate = dateFormat.format(calendar.getTime());


		WebUI.selectOptionByIndex(new TestObject().addProperty('id',ConditionType.EQUALS,"combo_facility"),2)

		WebUI.click(new TestObject().addProperty('id',ConditionType.EQUALS,"chk_hospotal_readmission"))

		WebUI.click(new TestObject().addProperty('id',ConditionType.EQUALS,"radio_program_medicaid"))

		WebUI.setText(new TestObject().addProperty('id',ConditionType.EQUALS,"txt_visit_date"),currentDate)
		
		WebUI.click(new TestObject().addProperty('id',ConditionType.EQUALS,"txt_comment"))

		WebUI.setText(new TestObject().addProperty('id',ConditionType.EQUALS,"txt_comment"),command)
	}
}
