import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

import internal.GlobalVariable

public class AbsoluteXpath {
	String buttonYesModal = "//*[@id='__layout']/div/div[2]/div[2]/div/main/div/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div/footer/div/div[1]/div/button";
	String buttonDetailNotSettled = "//*[@id='__layout']/div/div[2]/div[2]/div/main/div/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[10]";
	String buttonYesModalSettle = "//*[@id='__layout']/div/div[2]/div[2]/div/main/div/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div[3]/div/div[2]/div[1]/div/div/footer/div/div[1]/div/button/div";
	String totalTransactionData = "//*[@id='__layout']/div/div[2]/div[2]/div/main/div/div/div[2]/div[3]/div/div/div/div/div/div[3]/div[1]/div/b[2]";
	String buttonYesRejectModal = "//*[@id='__layout']/div/div[2]/div[2]/div/main/div/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/div/footer/div/div[1]/div/button/div";
	String buttonYesApprove = "//*[@id='__layout']/div/div[2]/div[2]/div/main/div/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div[1]/div/div/footer/div/div[1]/div/button/div";
	String buttonYesComplete = "//*[@id='__layout']/div/div[2]/div[2]/div/main/div/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div[1]/div[4]/div/div[2]/div[1]/div/div/footer/div/div[1]/div/button/div";
	String buttonYesReject = "//*[@id='__layout']/div/div[2]/div[2]/div/main/div/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/div/div/footer/div/div[1]/div/button/div";
	String buttonConfirm = "//*[@id='__layout']/div/div[3]/div/div[1]/div/div/div[3]/div/div[1]/div/button/div";
	
}
