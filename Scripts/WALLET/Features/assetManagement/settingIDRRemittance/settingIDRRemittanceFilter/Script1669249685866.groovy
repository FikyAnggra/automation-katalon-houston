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

switch(searchBy) {
	
	case 'STATUS':
		baseSetUp()
		searchStatus()
		break
	
	case 'TYPE':
		baseSetUp()
		searchTypeorPG()
		break
		
	case 'PG':
		baseSetUp()
		searchTypeorPG()
		break
		
	case 'DATE':
		baseSetUp()
		searchDate()
		break
}

def baseSetUp() {
	WebUI.callTestCase(findTestCase('WALLET/Features/assetManagement/settingIDRRemittance/settingIDRRemittanceShowList'), [:], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):"Filter"]), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):"Filter"]), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):"Filter"]))
}

def searchStatus() {
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"form-check-label",('text'):search]), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"form-check-label",('text'):search]), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"form-check-label",('text'):search]))
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonText',[('element'):"Set"]), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonText',[('element'):"Set"]), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonText',[('element'):"Set"]))
	
	switch(search) {
		
		case 'Request':
		WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element') : result]), GlobalVariable.G_TIMEOUT)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element') : result]), GlobalVariable.G_TIMEOUT)
		
		WebUI.closeBrowser()
		
		break
		
		case 'Rejected':
		WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/assetManagement/elementTableWithText',[('index'):1,('text'):result]), GlobalVariable.G_TIMEOUT)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/assetManagement/elementTableWithText',[('index'):1,('text'):result]), GlobalVariable.G_TIMEOUT)
		
		WebUI.closeBrowser()
		
		break
		
		case 'Complete':
		WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/assetManagement/elementTableWithText',[('index'):1,('text'):result]), GlobalVariable.G_TIMEOUT)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/assetManagement/elementTableWithText',[('index'):1,('text'):result]), GlobalVariable.G_TIMEOUT)
		
		WebUI.closeBrowser()
		
		break
	}
}

def searchTypeorPG() {
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"form-check-label",('text'):search]), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"form-check-label",('text'):search]), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"form-check-label",('text'):search]))
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonText',[('element'):"Set"]), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonText',[('element'):"Set"]), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonText',[('element'):"Set"]))
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/assetManagement/elementTableWithText',[('index'):1,('text'):result]), GlobalVariable.G_TIMEOUT)
	
	WebUI.closeBrowser()
}

def searchDate() {
	String[] startDate = startDate.split("-")
	String[] endDate = endDate.split("-")
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):'Start Date']),GlobalVariable.G_TIMEOUT )
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):'Start Date']))
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/withdrawIDR/dateHeader',[('dateHeader'):'date-picker__year-header']))
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/withdrawIDR/datePicker', [('classDatePicker') : 'date-picker__year-button-wrapper', ('datePicker') : startDate[2]]), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/withdrawIDR/datePicker', [('classDatePicker') : 'date-picker__month-button-wrapper', ('datePicker') : startDate[1]]), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/withdrawIDR/datePicker', [('classDatePicker') : 'date-picker__row', ('datePicker') : startDate[0]]), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):'End Date']),GlobalVariable.G_TIMEOUT )
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):'End Date']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/withdrawIDR/dateHeader',[('dateHeader'):'date-picker__year-header']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/withdrawIDR/datePicker', [('classDatePicker') : 'date-picker__year-button-wrapper', ('datePicker') : endDate[2]]), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/withdrawIDR/datePicker', [('classDatePicker') : 'date-picker__month-button-wrapper', ('datePicker') : endDate[1]]), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/withdrawIDR/datePicker', [('classDatePicker') : 'date-picker__row', ('datePicker') : endDate[0]]), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):'End Date']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClass', [('elementClass') : 'btn tw-block tw-w-16 btn-primary btn-sm']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):result]), GlobalVariable.G_TIMEOUT)
		
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):result]), GlobalVariable.G_TIMEOUT)
}






