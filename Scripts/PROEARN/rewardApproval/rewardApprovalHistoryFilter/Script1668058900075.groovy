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


switch (filterBy) {
	case 'oneCoin':
		coinList()

		break
	case 'moreThanOneCoin':
		WebUI.closeBrowser()

}

def setupRewardHistory() {
	
	//Call Test Case From Platform For Login Houston
	WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'sepriana@usenobi.com', ('password') : 'p4y+y39Ir5M5s9+buYNYVA=='], FailureHandling.STOP_ON_FAILURE)
	
	//if showed confirmation to logged out
	if(WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'div', ('elementParameter') : 'class', ('elementValue') : 'tw-px-4 tw-py-3 tw-text-center']), 0, FailureHandling.STOP_ON_FAILURE)) {
		//click yes
		WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'Yes']))
	}
	

	//Redirect To Reward Approval Page
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/investment/reward-approval']), GlobalVariable.G_TIMEOUT)
	WebUI.scrollToElement(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/investment/reward-approval']),GlobalVariable.G_TIMEOUT)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/investment/reward-approval']),FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'h2', ('elementByText') : 'REWARD APPROVAL']), GlobalVariable.G_TIMEOUT)
	
	//Redirect to Reward Approval History Page
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'History']), GlobalVariable.G_TIMEOUT)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'History']),FailureHandling.STOP_ON_FAILURE)

}


def coinList() {
	
	setupRewardHistory()
	
	//Filter Coin List History
	//dispyaled coin list
	WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : '1']), GlobalVariable.G_TIMEOUT)
	
	//choose coin
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'option', ('elementByText') : filterChoose]),FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'option', ('elementByText') : filterChoose]), GlobalVariable.G_TIMEOUT)
	
	//click button
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'Go']), GlobalVariable.G_TIMEOUT)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'Go']),FailureHandling.STOP_ON_FAILURE)
	
	//validasi table header
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : "th", ('elementTag') : 'Div', ('twoElementByText') : "Cycle"]), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : "th", ('elementTag') : 'Div', ('twoElementByText') : "Period"]), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : "th", ('elementTag') : 'Div', ('twoElementByText') : "Coin"]), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : "th", ('elementTag') : 'Div', ('twoElementByText') : "Starting Balance"]), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : "th", ('elementTag') : 'Div', ('twoElementByText') : "Ending Balance"]), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : "th", ('elementTag') : 'Div', ('twoElementByText') : "Weekly Avg Balance"]), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : "th", ('elementTag') : 'Div', ('twoElementByText') : "Deposit"]), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : "th", ('elementTag') : 'Div', ('twoElementByText') : "Withdraw"]), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : "th", ('elementTag') : 'Div', ('twoElementByText') : "Reward Payable / USD / IDR"]), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : "th", ('elementTag') : 'Div', ('twoElementByText') : "Platform Gain / USD / IDR"]), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : "th", ('elementTag') : 'Div', ('twoElementByText') : "APY (%)"]), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : "th", ('elementTag') : 'Div', ('twoElementByText') : "NIM"]), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : "th", ('elementTag') : 'Div', ('twoElementByText') : "APY User"]), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : "th", ('elementTag') : 'Div', ('twoElementByText') : "Status"]), GlobalVariable.G_TIMEOUT)
	
	WebDriver driver =  DriverFactory.getWebDriver()
	
	WebElement table = driver.findElement(By.xpath("//table/tbody"))
	
	List <WebElement> rowsTable = table.findElements(By.tagName("tr"))
	
	int rowsCount = rowsTable.size()
	
	for (int row = 0; row < rowsCount; row++) {
		WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') :'tr'+[row+1], ('elementTwo') : 'td'+[3], ('elementTag') : 'Div' , ('twoElementByText'): filterResult]), GlobalVariable.G_TIMEOUT)
		WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') :'tr'+[row+1], ('elementTwo') : 'td'+[14], ('elementTag') : 'Div' , ('twoElementByText'): 'Approve']), GlobalVariable.G_TIMEOUT)
	}
	
}


def pagination() {}
WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'fiky.anggra@usenobi.com', ('password') : 'q9alYSqJqoOAgOPRsuUgZQ=='],
	FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/NobiEarn/menu'), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/NobiEarn/menu'))

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a' , ('elementParameter') : 'href' , ('elementValue') : '/transaction/earn-v2']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a' , ('elementParameter') : 'href' , ('elementValue') : '/transaction/earn-v2']), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'b' , ('elementByText') : 'Transaction Processing Today']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'b' , ('elementByText') : 'Transaction Processing Today']), GlobalVariable.G_TIMEOUT)

WebUI.scrollToElement(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'b' , ('elementByText') : 'Transaction Processing Today']), GlobalVariable.G_TIMEOUT)

WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'Option', ('elementParameter') : 'value' , ('elementValue') : '10']),GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'Option', ('elementParameter') : 'value' , ('elementValue') : totalPagination]), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'Option', ('elementParameter') : 'value' , ('elementValue') : totalPagination]), GlobalVariable.G_TIMEOUT)

WebDriver driver =  DriverFactory.getWebDriver()

WebElement table = driver.findElement(By.xpath("//table/tbody"))

List <WebElement> rowsTable = table.findElements(By.tagName("tr"))

int rowsCount = rowsTable.size()

for (int row = 0; row < rowsCount; row++) {
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') : 'table', ('elementTwo') : 'tbody', ('elementTag') : 'tr'+[row+1] , ('twoElementByText') : '']), GlobalVariable.G_TIMEOUT)
}


