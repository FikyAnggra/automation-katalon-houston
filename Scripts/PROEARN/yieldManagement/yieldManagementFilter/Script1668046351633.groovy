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

switch (filterBy) {
	case 'coin':
		filterByCoin()
	break 
}

def setupYieldManagementPage() {
	//Call Test Case From Platform For Login Houston
	WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'sepriana@usenobi.com', ('password') : 'p4y+y39Ir5M5s9+buYNYVA=='], FailureHandling.STOP_ON_FAILURE)
	
	//if showed confirmation to logged out
//	if(WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'div', ('elementParameter') : 'class', ('elementValue') : 'tw-px-4 tw-py-3 tw-text-center']), 0, FailureHandling.STOP_ON_FAILURE)) {
//		//click yes
//		WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'Yes']))
//	}
	
	//Redirect To Yield Management Page
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/investment/yield-management']), GlobalVariable.G_TIMEOUT)
	WebUI.scrollToElement(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/investment/yield-management']),GlobalVariable.G_TIMEOUT)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/investment/yield-management']),FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'h2', ('elementByText') : 'YIELD MANAGEMENT']), GlobalVariable.G_TIMEOUT)

}



def filterByCoin() {
	setupYieldManagementPage()
	
	//Filter Coin List
	//dispyaled coin list
	WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : '1']), GlobalVariable.G_TIMEOUT)
	
	//choose coin
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'option', ('elementByText') : filterChoose]),FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'option', ('elementByText') : filterChoose]), GlobalVariable.G_TIMEOUT)
	
	//click button
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'Go']), GlobalVariable.G_TIMEOUT)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'Go']),FailureHandling.STOP_ON_FAILURE)
	
	//verify coin filtered
		if (WebUI.getText(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'option', ('elementByText') : filterChoose]), FailureHandling.CONTINUE_ON_FAILURE)	) {
		WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagWithText', [('elementTag') : 'div',('elementParameter') : 'class' ,('elementValue') : 'tw-py-2 tw-px-4 tw-rounded bg-light' , ('elementByText') : filterChoose]), GlobalVariable.G_TIMEOUT)
	}
	
}



