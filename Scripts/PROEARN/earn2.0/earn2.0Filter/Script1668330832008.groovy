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

println("fiky")

switch (filterBy) {
    case 'TICKER':
        filterByTicker()

        break
    case 'TYPE':
        filterByType()

        break
    case 'DATE':
        filterByDate()

        break
}



def setupEarnPage() {
    WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'fiky.anggra@usenobi.com', ('password') : 'q9alYSqJqoOAgOPRsuUgZQ=='], FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/NobiEarn/menu'), GlobalVariable.G_TIMEOUT)

	WebUI.click(findTestObject('PROEARN/Pages/NobiEarn/menu'))

    WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a' , ('elementParameter') : 'href' , ('elementValue') : '/transaction/earn-v2']), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a' , ('elementParameter') : 'href' , ('elementValue') : '/transaction/earn-v2']), FailureHandling.STOP_ON_FAILURE)
	
    WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'b' , ('elementByText') : 'Transaction Processing Today']), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'b' , ('elementByText') : 'Transaction Processing Today']), GlobalVariable.G_TIMEOUT)

	WebUI.scrollToElement(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'b' , ('elementByText') : 'Transaction Processing Today']), GlobalVariable.G_TIMEOUT)
	
    WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div' , ('elementByText') : 'Filter']), FailureHandling.STOP_ON_FAILURE)
	
}

def filterByTicker() {
    setupEarnPage()
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') :'Option', ('elementByText') : filterChoose]), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'button' , ('elementByText') : 'Set']), FailureHandling.STOP_ON_FAILURE)

	WebDriver driver =  DriverFactory.getWebDriver()
	
	WebElement table = driver.findElement(By.xpath("//table/tbody"))
	
	List <WebElement> rowsTable = table.findElements(By.tagName("tr"))
	
	int rowsCount = rowsTable.size()
	
	for (int row = 0; row < rowsCount; row++) {
		WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') :'tr'+[row+1], ('elementTwo') : 'td'+[5], ('elementTag') : '*' , ('twoElementByText'): filterResult]), GlobalVariable.G_TIMEOUT)
	}
}

def filterByType() {
    setupEarnPage()

	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'label' , ('elementByText') : filterChoose]), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'button' , ('elementByText') : 'Set']), FailureHandling.STOP_ON_FAILURE)
	
	WebDriver driver =  DriverFactory.getWebDriver()
	
	WebElement table = driver.findElement(By.xpath("//table/tbody"))
	
	List <WebElement> rowsTable = table.findElements(By.tagName("tr"))
	
	int rowsCount = rowsTable.size()
	
	for (int row = 0; row < rowsCount; row++) {
		WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') :'tr'+[row+1], ('elementTwo') : 'td'+[4], ('elementTag') : '*' , ('twoElementByText'): filterResult]), GlobalVariable.G_TIMEOUT)
	}
}

def filterByDate() {
    String[] startDate = startDate.split('-')

    String[] endDate = endDate.split('-')

    setupEarnPage()

    WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input', ('elementParameter') : 'placeholder' , ('elementValue'): 'Start Date']), GlobalVariable.G_TIMEOUT)

    WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input', ('elementParameter') : 'placeholder' , ('elementValue'): 'Start Date']), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/twoElementTagByParameter', [('elementTagOne') :'div', ('elementParameterOne') :'class' , ('elementValueOne') : 'tw-min-w-min dropdown-menu show', ('elementTagTwo') : '*' , ('elementParameterTwo') :'class' , ('elementValueTwo'): 'date-picker__year-header']), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/twoElementTagByParameterAndText', [('elementTagOne') :'*', ('elementParameterOne') :'class' , ('elementValueOne') : 'tw-min-w-min dropdown-menu show', ('elementTagTwo') : '*' , ('elementParameterTwo') :'class' , ('elementValueTwo'): 'date-picker__year-button-wrapper', ('elementTagText') : 'Button', ('elementByText') : startDate[2]]), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/twoElementTagByParameterAndText', [('elementTagOne') :'*', ('elementParameterOne') :'class' , ('elementValueOne') : 'tw-min-w-min dropdown-menu show', ('elementTagTwo') : '*' , ('elementParameterTwo') :'class' , ('elementValueTwo'): 'date-picker__month-button-wrapper', ('elementTagText') : 'Button', ('elementByText') : startDate[1]]), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/twoElementTagByParameterAndText', [('elementTagOne') :'*', ('elementParameterOne') :'class' , ('elementValueOne') : 'tw-min-w-min dropdown-menu show', ('elementTagTwo') : '*' , ('elementParameterTwo') :'class' , ('elementValueTwo'): 'date-picker__row', ('elementTagText') : '*', ('elementByText') : startDate[0]]), FailureHandling.STOP_ON_FAILURE)
	
    WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input', ('elementParameter') : 'placeholder' , ('elementValue'): 'End Date']), GlobalVariable.G_TIMEOUT)
	
    WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input', ('elementParameter') : 'placeholder' , ('elementValue'): 'End Date']), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/twoElementTagByParameter', [('elementTagOne') :'div', ('elementParameterOne') :'class' , ('elementValueOne') : 'tw-min-w-min dropdown-menu show', ('elementTagTwo') : '*' , ('elementParameterTwo') :'class' , ('elementValueTwo'): 'date-picker__year-header']), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/twoElementTagByParameterAndText', [('elementTagOne') :'*', ('elementParameterOne') :'class' , ('elementValueOne') : 'tw-min-w-min dropdown-menu show', ('elementTagTwo') : '*' , ('elementParameterTwo') :'class' , ('elementValueTwo'): 'date-picker__year-button-wrapper', ('elementTagText') : 'Button', ('elementByText') : endDate[2]]), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/twoElementTagByParameterAndText', [('elementTagOne') :'*', ('elementParameterOne') :'class' , ('elementValueOne') : 'tw-min-w-min dropdown-menu show', ('elementTagTwo') : '*' , ('elementParameterTwo') :'class' , ('elementValueTwo'): 'date-picker__month-button-wrapper', ('elementTagText') : 'Button', ('elementByText') : endDate[1]]), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/twoElementTagByParameterAndText', [('elementTagOne') :'*', ('elementParameterOne') :'class' , ('elementValueOne') : 'tw-min-w-min dropdown-menu show', ('elementTagTwo') : '*' , ('elementParameterTwo') :'class' , ('elementValueTwo'): 'date-picker__row', ('elementTagText') : '*', ('elementByText') : endDate[0]]), FailureHandling.STOP_ON_FAILURE)
	
    WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input', ('elementParameter') : 'placeholder' , ('elementValue'): 'End Date']), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'button' , ('elementByText') : 'Set']), FailureHandling.STOP_ON_FAILURE)
	
    if (testCase.equals('Success Filter By Date')) {
		WebDriver driver =  DriverFactory.getWebDriver()
		
		WebElement table = driver.findElement(By.xpath("//table/tbody"))
		
		List <WebElement> rowsTable = table.findElements(By.tagName("tr"))
		
		int rowsCount = rowsTable.size()
		
		for (int row = 0; row < rowsCount; row++) {
			WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') :'tr'+[row+1], ('elementTwo') : 'td'+[3] , ('elementTag') : 'div' , ('twoElementByText'): filterResult]), GlobalVariable.G_TIMEOUT)
		}
		
    } else {
		WebUI.waitForElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'td', ('elementByText'): filterResult]), GlobalVariable.G_TIMEOUT)
		
		WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'td', ('elementByText'): filterResult]), GlobalVariable.G_TIMEOUT)
    }
}

