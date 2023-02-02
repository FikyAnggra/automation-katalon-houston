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
	case 'type':
		filterByType()
	break
	
	case 'date':
		filterByDate()
	break
	
}

def setupYieldTransactionDetail() {
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
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'span', ('elementParameter') : 'class', ('elementValue') : 'ri-arrow-right-s-line']), GlobalVariable.G_TIMEOUT)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'span', ('elementParameter') : 'class', ('elementValue') : 'ri-arrow-right-s-line']), FailureHandling.STOP_ON_FAILURE)
	
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'select', ('elementParameter') : 'class', ('elementValue') : 'form-control form-control-sm' , ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'select', ('elementParameter') : 'class', ('elementValue') : 'form-control form-control-sm' , ('elementIndex') : '1']), FailureHandling.CONTINUE_ON_FAILURE)
	
	//Filter Coin List
	//dispyaled coin list
	WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : '1']), GlobalVariable.G_TIMEOUT)
	
	//choose coin
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'option', ('elementByText') : 'BNB']),FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'option', ('elementByText') : 'BNB']), GlobalVariable.G_TIMEOUT)
	
	//click button
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'Go']), GlobalVariable.G_TIMEOUT)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'Go']),FailureHandling.STOP_ON_FAILURE)
	
	WebUI.scrollToPosition(50, 10)
	
	//validasi table Placements
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : 'div', ('elementTag') : 'strong', ('twoElementByText') : 'DeFi Placements']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Channel', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Fund', ('elementIndex') : '2']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Current Cycle Yield', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Prev. Cycle Yield', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Running Reward', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Available Reward', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Accrued Reward', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Sizing', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Details', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	
	WebUI.scrollToPosition(50, 250)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : 'div', ('elementTag') : 'strong', ('twoElementByText') : 'CeFi Placements']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Channel', ('elementIndex') : '2']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Fund', ('elementIndex') : '3']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Current Cycle Yield', ('elementIndex') : '2']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Prev. Cycle Yield', ('elementIndex') : '2']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Running Reward', ('elementIndex') : '2']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Available Reward', ('elementIndex') : '2']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Accrued Reward', ('elementIndex') : '2']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Sizing', ('elementIndex') : '2']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Details', ('elementIndex') : '2']), GlobalVariable.G_TIMEOUT)
	
	WebUI.scrollToPosition(50, 500)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : 'div', ('elementTag') : 'strong', ('twoElementByText') : 'Staking Placements']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Channel', ('elementIndex') : '3']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Fund', ('elementIndex') : '4']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Current Cycle Yield', ('elementIndex') : '3']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Prev. Cycle Yield', ('elementIndex') : '3']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Running Reward', ('elementIndex') : '3']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Available Reward', ('elementIndex') : '3']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Accrued Reward', ('elementIndex') : '3']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Sizing', ('elementIndex') : '3']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'tw-w-full tw-flex tw-items-center', ('elementByText') : 'Details', ('elementIndex') : '3']), GlobalVariable.G_TIMEOUT)
	
			
	if(WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'button', ('elementParameter') :'class' ,('elementValue') : 'btn tw-relative btn-secondary btn-sm tw-p-0 tw-m-0 tw-rounded-full tw-inline-flex tw-items-center tw-justify-center tw-w-7 tw-h-7 tw-text-base']), GlobalVariable.G_TIMEOUT)) {
		WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : "button", ('elementParameter') :'class' ,('elementValue') : 'btn tw-relative btn-secondary btn-sm tw-p-0 tw-m-0 tw-rounded-full tw-inline-flex tw-items-center tw-justify-center tw-w-7 tw-h-7 tw-text-base']))
	}
	else {
		WebUI.scrollToPosition(50, 0)
	}
	
				
	//WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'button', ('elementParameter') :'class' ,('elementValue') : 'btn tw-relative btn-secondary btn-sm tw-p-0 tw-m-0 tw-rounded-full tw-inline-flex tw-items-center tw-justify-center tw-w-7 tw-h-7 tw-text-base']), GlobalVariable.G_TIMEOUT)
	//WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : "button", ('elementParameter') :'class' ,('elementValue') : 'btn tw-relative btn-secondary btn-sm tw-p-0 tw-m-0 tw-rounded-full tw-inline-flex tw-items-center tw-justify-center tw-w-7 tw-h-7 tw-text-base']))
	
	
	//Redirect to Detail Yield Management
	WebUI.scrollToPosition(50, 0)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'Flexible']), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTextIndex', [('elementTag') : 'div', ('elementByText') : 'Details', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : 'div', ('elementTag') : 'div', ('twoElementByText') : 'Fund Amount']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTextIndex', [('elementTag') : 'div', ('elementByText') : 'Fund (%)', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTextIndex', [('elementTag') : 'div', ('elementByText') : 'Current Cycle Yield', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTextIndex', [('elementTag') : 'div', ('elementByText') : 'Prev. Cycle Yield', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTextIndex', [('elementTag') : 'div', ('elementByText') : 'Running Reward', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTextIndex', [('elementTag') : 'div', ('elementByText') : 'Available Reward', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTextIndex', [('elementTag') : 'div', ('elementByText') : 'Accrued Reward', ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : 'div', ('elementTag') : 'div', ('twoElementByText') : 'Reward Time']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : 'div', ('elementTag') : 'div', ('twoElementByText') : 'Today Yield']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : 'div', ('elementTag') : 'div', ('twoElementByText') : 'Exit Period']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : 'div', ('elementTag') : 'div', ('twoElementByText') : 'Min. Join']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : 'div', ('elementTag') : 'div', ('twoElementByText') : 'Threshold']), GlobalVariable.G_TIMEOUT)
	
	WebUI.scrollToPosition(50, 450)
	
	//verify in Fund Allocation
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/oneElementByText', [('elementOne') : 'div', ('elementTag') : 'div', ('twoElementByText') : 'Fund Alocation']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'div', ('elementParameter') : 'class', ('elementValue') : 'tw-w-full' , ('elementIndex') : '1']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'div', ('elementParameter') : 'class', ('elementValue') : 'tw-w-full' , ('elementIndex') : '2']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'div', ('elementParameter') : 'class', ('elementValue') : 'tw-w-full' , ('elementIndex') : '3']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'div', ('elementParameter') : 'class', ('elementValue') : 'tw-w-full' , ('elementIndex') : '4']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'div', ('elementParameter') : 'class', ('elementValue') : 'tw-w-full' , ('elementIndex') : '5']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'div', ('elementParameter') : 'class', ('elementValue') : 'tw-w-full' , ('elementIndex') : '6']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'div', ('elementParameter') : 'class', ('elementValue') : 'tw-w-full' , ('elementIndex') : '7']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'div', ('elementParameter') : 'class', ('elementValue') : 'tw-w-full' , ('elementIndex') : '8']), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'div', ('elementParameter') : 'class', ('elementValue') : 'tw-w-full' , ('elementIndex') : '9']), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'span', ('elementParameter') : 'class', ('elementValue') : 'ri-arrow-right-s-line']), GlobalVariable.G_TIMEOUT)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'span', ('elementParameter') : 'class', ('elementValue') : 'ri-arrow-right-s-line']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.scrollToPosition(50, 0)
	
}

def filterByType() {
	setupYieldTransactionDetail()
	
	//click type
	WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : filterChoose]), GlobalVariable.G_TIMEOUT)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : filterChoose]), GlobalVariable.G_TIMEOUT)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : filterChoose]), FailureHandling.CONTINUE_ON_FAILURE)
	
	//click go
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'Go']), 0, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'Go']), FailureHandling.CONTINUE_ON_FAILURE)
	
	//Verify Type 
	if (testCase.equals('Success Filter By Type')) {
	WebDriver driver =  DriverFactory.getWebDriver()
	
	WebElement table = driver.findElement(By.xpath("//table/tbody"))
	
	List <WebElement> rowsTable = table.findElements(By.tagName("tr"))
	
	int rowsCount = rowsTable.size()
	
		for (int row = 0; row < rowsCount; row++) {
		WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') :'tr'+[row+1], ('elementTwo') : 'td'+[3], ('elementTag') : '*' , ('twoElementByText'): filterResult]), GlobalVariable.G_TIMEOUT)
		}
	}
	else {
		WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/uniqueElementWithoutIndex', [('elementTag') : 'tr',('elementParameter') : 'data-v-482601ac', ('elementByText') : filterResult]), 0, FailureHandling.STOP_ON_FAILURE)
		}
}

def filterByDate() {
	String[] startDate = startDate.split('-')
	
	String[] endDate = endDate.split('-')
	
	setupYieldTransactionDetail()
	
	//click date
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input', ('elementParameter') : 'placeholder', ('elementValue') : 'Select Date']), 0, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input', ('elementParameter') : 'placeholder', ('elementValue') : 'Select Date']), FailureHandling.CONTINUE_ON_FAILURE)
	
	//WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'button', ('elementParameter') : 'fdprocessedid', ('elementValue') : 'swopda']), 0, FailureHandling.STOP_ON_FAILURE)
	//WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'button', ('elementParameter') : 'fdprocessedid', ('elementValue') : 'swopda']), FailureHandling.CONTINUE_ON_FAILURE)
	
	
	//click date-year start
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'button', ('elementParameter') : 'class', ('elementValue') : 'date-picker__year-header' , ('elementIndex') : '1']), 0, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'button', ('elementParameter') : 'class', ('elementValue') : 'date-picker__year-header' , ('elementIndex') : '1']), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'date-picker__year-button-wrapper', ('elementByText') : startDate[2], ('elementIndex') : '1']), 0, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'date-picker__year-button-wrapper', ('elementByText') : startDate[2], ('elementIndex') : '1']), FailureHandling.CONTINUE_ON_FAILURE)
	
	//click date-month start
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'date-picker__month-button-wrapper', ('elementByText') : startDate[1], ('elementIndex') : '1']), 0, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'date-picker__month-button-wrapper', ('elementByText') : startDate[1], ('elementIndex') : '1']), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'date-picker__row', ('elementByText') : startDate[0], ('elementIndex') : '1']), 0, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'date-picker__row', ('elementByText') : startDate[0], ('elementIndex') : '1']), FailureHandling.CONTINUE_ON_FAILURE)
	
	//click date-year end
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'button', ('elementParameter') : 'class', ('elementValue') : 'date-picker__year-header' , ('elementIndex') : '2']), 0, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'button', ('elementParameter') : 'class', ('elementValue') : 'date-picker__year-header' , ('elementIndex') : '2']), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'date-picker__year-button-wrapper', ('elementByText') : endDate[2], ('elementIndex') : '2']), 0, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'date-picker__year-button-wrapper', ('elementByText') : endDate[2], ('elementIndex') : '2']), FailureHandling.CONTINUE_ON_FAILURE)
	
	//click date-month end
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'date-picker__month-button-wrapper', ('elementByText') : endDate[1], ('elementIndex') : '2']), 0, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'date-picker__month-button-wrapper', ('elementByText') : endDate[1], ('elementIndex') : '2']), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'date-picker__row', ('elementByText') : endDate[0], ('elementIndex') : '3']), 0, FailureHandling.STOP_ON_FAILURE)
	WebUI.doubleClick(findTestObject('PROEARN/Pages/General/elementTagByTextWithIndex', [('elementTag') : 'div', ('elementParameter') :'class' ,('elementValue') : 'date-picker__row', ('elementByText') : endDate[0], ('elementIndex') : '3']), FailureHandling.CONTINUE_ON_FAILURE)
	
	//click go
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'Go']), 0, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : 'Go']), FailureHandling.CONTINUE_ON_FAILURE)
	
	if (testCase.equals('Success Filter By Date')) {
		WebDriver driver =  DriverFactory.getWebDriver()
		
		WebElement table = driver.findElement(By.xpath("//table/tbody"))
		
		List <WebElement> rowsTable = table.findElements(By.tagName("tr"))
		
		int rowsCount = rowsTable.size()
		
		for (int row = 0; row < rowsCount; row++) {
			WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') :'tr'+[row+1], ('elementTwo') : 'td'+[2] , ('elementTag') : 'div' , ('twoElementByText'): filterResult]), GlobalVariable.G_TIMEOUT)
		}
		
	} else {
		WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/uniqueElementWithoutIndex', [('elementTag') : 'tr',('elementParameter') : 'data-v-482601ac', ('elementByText') : filterResult]), GlobalVariable.G_TIMEOUT)
		
		WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/uniqueElementWithoutIndex', [('elementTag') : 'tr',('elementParameter') : 'data-v-482601ac', ('elementByText') : filterResult]), GlobalVariable.G_TIMEOUT)
	}
	
	
	//click reset
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : filterChoose]), 0, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : filterChoose]), FailureHandling.CONTINUE_ON_FAILURE)
	
	
}
