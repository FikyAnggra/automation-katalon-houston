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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.util.Date;


switch (filterBy) {
	case 'oneCoin':
		filterByOneCoin()

		break
	case 'moreThanOneCoin':
		filterByMoreThanOneCoin()

		break
	case 'periodThisCycle':
		filterPeriodCycle()
		
		break
	case 'periodToday':
		filterPeriodToday()
		
		break
	case 'periodCustom':
		filterPeriodCustom()
		
		break

}

def setupEarnReportingPage(){
	Mobile.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'sepriana@usenobi.com', ('password') : 'p4y+y39Ir5M5s9+buYNYVA=='],FailureHandling.STOP_ON_FAILURE)
	
	WebUI.scrollToElement(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/finance/reporting']), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/finance/reporting']), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/finance/reporting']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') : 'ul', ('elementTwo') : 'li', ('elementTag') : '*', ('twoElementByText') : 'NOBI Earn']), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') : 'ul', ('elementTwo') : 'li', ('elementTag') : '*', ('twoElementByText') : 'NOBI Earn']), FailureHandling.STOP_ON_FAILURE)
				
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'button', ('elementByText') : 'Earn 2.0 Reporting']), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'button', ('elementByText') : 'Earn 2.0 Reporting']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'a', ('elementByText') : 'Earn 2.0 Reporting']), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'a', ('elementByText') : 'Earn 2.0 Reporting']), FailureHandling.STOP_ON_FAILURE)
				
}


def filterByOneCoin(){
	setupEarnReportingPage()
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input', ('elementParameter') : 'placeholder', ('elementValue') : 'Select...']), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input', ('elementParameter') : 'placeholder', ('elementValue') : 'Select...']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : filterChoose]), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : filterChoose]), FailureHandling.STOP_ON_FAILURE)
		
	//btn GO
	WebUI.scrollToPosition(50, 60)
	WebUI.click(findTestObject('PROEARN/Pages/General/twoElementTagByParameter', [('elementTagOne') :'button', ('elementParameterOne') :'class' , ('elementValueOne') : 'btn tw-relative btn-info btn-sm btn-block', ('elementTagTwo') : 'div' , ('elementParameterTwo') :'class' , ('elementValueTwo'): 'tw-flex tw-items-center']), FailureHandling.STOP_ON_FAILURE)

	//Verify Coin filtered
	WebDriver driver = DriverFactory.getWebDriver()
	
	WebElement table = driver.findElement(By.xpath("//table/tbody"))
	
	List <WebElement> rowsTable = table.findElements(By.tagName("tr"))
		
	int rowsCount = rowsTable.size()
	
	for (int row=0; row < rowsCount; row++) {
		WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') :'tr'+[row+1], ('elementTwo') : 'td'+[5], ('elementTag') : '*' , ('twoElementByText'): filterResult]), 0, FailureHandling.STOP_ON_FAILURE)
	}
}


def filterByMoreThanOneCoin() {
	setupEarnReportingPage()
	
	String[] moreThanOneCoin = filterChoose.split('-')
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input', ('elementParameter') : 'placeholder' , ('elementValue') : 'Select...']), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input', ('elementParameter') : 'placeholder', ('elementValue') : 'Select...']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI .verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : moreThanOneCoin[0]]),GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : moreThanOneCoin[0]]), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : moreThanOneCoin[1]]), GlobalVariable.G_TIMEOUT)
		
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText') : moreThanOneCoin[1]]), FailureHandling.STOP_ON_FAILURE)
	
	//btn GO
	WebUI.scrollToPosition(50, 60)
	WebUI.click(findTestObject('PROEARN/Pages/General/twoElementTagByParameter', [('elementTagOne') :'button', ('elementParameterOne') :'class' , ('elementValueOne') : 'btn tw-relative btn-info btn-sm btn-block', ('elementTagTwo') : 'div' , ('elementParameterTwo') :'class' , ('elementValueTwo'): 'tw-flex tw-items-center']), FailureHandling.STOP_ON_FAILURE)

	//Verify Coin filtered
	WebDriver driver = DriverFactory.getWebDriver()
	
	WebElement table = driver.findElement(By.xpath("//table/tbody"))
	
	List <WebElement> rowsTable = table.findElements(By.tagName("tr"))
		
	int rowsCount = rowsTable.size()
	
	for (int row=0; row < rowsCount; row++) {
		WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') :'tr'+[row+1], ('elementTwo') : 'td'+[5], ('elementTag') : '*' , ('twoElementByText'): filterResult]), 0, FailureHandling.STOP_ON_FAILURE)
	}
}

def filterPeriodCycle() {
	//filterPeriodCycle
	setupEarnReportingPage()
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : 'cycle']), GlobalVariable.G_TIMEOUT)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : filterChoose]), FailureHandling.STOP_ON_FAILURE)
	
}


def filterPeriodToday() {
	//filterPeriodToday
	setupEarnReportingPage()
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : 'cycle']), GlobalVariable.G_TIMEOUT)
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : filterChoose]), FailureHandling.STOP_ON_FAILURE)
	
	//Verify This Cycle Period Filtered
		myDate = new Date()
		dateToday = myDate.format('yyyy-MM-dd')
		dateHour = myDate.format('HH:mm')
		println(dateToday)
		if(dateHour >= '20:30' && dateHour <= '23:59') {    //jika ini False, maka jalanin yg else, ubah ke 14.30 jika dijalankan sebelum jam 14.00 
			WebDriver driver = DriverFactory.getWebDriver()
			
			WebElement table = driver.findElement(By.xpath("//table/tbody"))
			
			List <WebElement> rowsTable = table.findElements(By.tagName("tr"))
				
			int rowsCount = rowsTable.size()
			
			for (int row=0; row < rowsCount; row++) {   
				WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') :'tr'+[row+1], ('elementTwo') : 'td'+[2], ('elementTag') : '*' , ('twoElementByText'): dateToday]), 0, FailureHandling.STOP_ON_FAILURE)
			}
		}
		else {
			WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText'): "No data"]), 0, FailureHandling.STOP_ON_FAILURE)
		}
}





def filterPeriodCustom() {
	String[] startDate = startDate.split('-')
	
	String[] endDate = endDate.split('-')
	
	setupEarnReportingPage()
	
	//filterPeriodCustom 
	WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : 'cycle']), GlobalVariable.G_TIMEOUT)

	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : 'cycle']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'option', ('elementParameter') : 'value', ('elementValue') : filterChoose]), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input', ('elementParameter') : 'placeholder', ('elementValue') : 'Start']), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/date-days',[('elementValue'):'datetime-picker-inline',('elementParameter'):'@class="date-picker__year-header"' ,('elementIndex'):'1']), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/date',[('elementValue'):'date-picker__years', ('datePicker'): startDate[2] ,('elementIndex'):'1']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/date',[('elementValue'):'date-picker__months',('datePicker'):startDate[1] ,('elementIndex'):'1']), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/date',[('elementValue'):'date-picker__days',('datePicker'):startDate[0] ,('elementIndex'):'1']), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'input', ('elementParameter') : 'placeholder', ('elementValue') : 'End']), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/date-days',[('elementValue'):'datetime-picker-inline',('elementParameter'):'@class="date-picker__year-header"' ,('elementIndex'):'2']), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/date',[('elementValue'):'date-picker__years',('datePicker'): endDate[2] ,('elementIndex'):'2']), FailureHandling.STOP_ON_FAILURE)

	WebUI.scrollToPosition(50, 60)

	WebUI.click(findTestObject('PROEARN/Pages/General/date',[('elementValue'):'date-picker__months',('datePicker'): endDate[1] ,('elementIndex'):'2']), FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('PROEARN/Pages/General/date',[('elementValue'):'date-picker__days',('datePicker'): endDate[0] ,('elementIndex'):'3']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('PROEARN/Pages/General/twoElementTagByParameter', [('elementTagOne') :'button', ('elementParameterOne') :'class' , ('elementValueOne') : 'btn tw-relative btn-info btn-sm btn-block', ('elementTagTwo') : 'div' , ('elementParameterTwo') :'class' , ('elementValueTwo'): 'tw-flex tw-items-center']), FailureHandling.STOP_ON_FAILURE)

	
	 //Verify This Cycle Period Filtered
    if (testCase.equals('Success Filter By Date')) {
		WebDriver driver =  DriverFactory.getWebDriver()
		
		WebElement table = driver.findElement(By.xpath("//table/tbody"))
		
		List <WebElement> rowsTable = table.findElements(By.tagName("tr"))
		
		int rowsCount = rowsTable.size()
		
		for (int row = 0; row < rowsCount; row++) {
			WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') :'tr'+[row+1], ('elementTwo') : 'td'+[2] , ('elementTag') : '*' , ('twoElementByText'): filterResult]), GlobalVariable.G_TIMEOUT)
		}
		
    } else {
		WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'div', ('elementByText'): filterResult]), 0, FailureHandling.STOP_ON_FAILURE)
    }	 
	
}



