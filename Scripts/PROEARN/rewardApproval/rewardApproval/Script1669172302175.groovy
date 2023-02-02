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

import org.openqa.selenium.By as By

import org.openqa.selenium.WebDriver as WebDriver

import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

//Call Test Case From Platform For Login Houston
WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'fiky.anggra@usenobi.com', ('password') : 'q9alYSqJqoOAgOPRsuUgZQ=='], FailureHandling.STOP_ON_FAILURE)

//Redirect To Reward Approval Page
WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/investment/reward-approval']), GlobalVariable.G_TIMEOUT)
WebUI.scrollToElement(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/investment/reward-approval']),GlobalVariable.G_TIMEOUT)
WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/investment/reward-approval']),FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'h2', ('elementByText') : 'REWARD APPROVAL']), GlobalVariable.G_TIMEOUT)

WebDriver driver =  DriverFactory.getWebDriver()

WebElement table = driver.findElement(By.xpath("//table/tbody"))

List <WebElement> rowsTable = table.findElements(By.tagName("tr"))

int rowsCount = rowsTable.size()

for (int row = 0; row < rowsCount; row++) {
	myDate = new Date()
	dateToday = myDate.format('EEE')
	if (dateToday == "sat") {
		WebUI.verifyElementClickable(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') :'tr'+[row+1], ('elementTwo') : 'td'+[12], ('elementTag') : 'button' , ('twoElementByText'): 'Approve']))
	} else {
		WebUI.verifyElementNotClickable(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') :'tr'+[row+1], ('elementTwo') : 'td'+[12], ('elementTag') : 'button' , ('twoElementByText'): 'Approve']))
	}
}

