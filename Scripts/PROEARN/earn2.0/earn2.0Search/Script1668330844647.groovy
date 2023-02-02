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

switch (testType) {
    case 'POSITIVE':
		successSearchBy()
    break
    case 'NEGATIVE':
		failedSearchBy()
    break
}

def setupStakingPage() {
	WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'fiky.anggra@usenobi.com', ('password') : 'q9alYSqJqoOAgOPRsuUgZQ=='], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/NobiEarn/menu'), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('PROEARN/Pages/NobiEarn/menu'))
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a' , ('elementParameter') : 'href' , ('elementValue') : '/transaction/earn-v2']), GlobalVariable.G_TIMEOUT)

	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a' , ('elementParameter') : 'href' , ('elementValue') : '/transaction/earn-v2']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'b' , ('elementByText') : 'Transaction Processing Today']), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'b' , ('elementByText') : 'Transaction Processing Today']), GlobalVariable.G_TIMEOUT)
	
	WebUI.scrollToElement(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'b' , ('elementByText') : 'Transaction Processing Today']), GlobalVariable.G_TIMEOUT)
	
	WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText'): 'Search By Ref ID']),GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText'): 'Search By Ref ID']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'a', ('elementByText') : search]), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'a', ('elementByText') : search]), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input' , ('elementParameter') : 'placeholder', ('elementValue') : search]), GlobalVariable.G_TIMEOUT)
	
}

def successSearchBy() {
	setupStakingPage()

	WebUI.setText(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input' , ('elementParameter') : 'placeholder', ('elementValue') : search]), searchBy)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : '*' , ('elementParameter') : 'class', ('elementValue') : 'ri-search-line']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : resultSearch]), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div' , ('elementByText') : resultSearch]), GlobalVariable.G_TIMEOUT)

}

def failedSearchBy() {	
	setupStakingPage()
	
	WebUI.setText(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input', ('elementParameter') : 'placeholder' , ('elementValue') : search]), searchBy)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : '*', ('elementParameter') : 'class' , ('elementValue'): 'ri-search-line']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : '*', ('elementByText') : resultSearch]), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : '*', ('elementByText') : resultSearch]), GlobalVariable.G_TIMEOUT)
	
}

