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

WebUI.callTestCase(findTestCase('WALLET/Features/liquidityManagement/assets/assetsAdvancedConsolidatedShowList'), [:], FailureHandling.STOP_ON_FAILURE)

switch(filterby) {
	case 'WALLET':
		filterbyWallet()
		break
	
	case 'DATE':
		filterbyDate()
		break
}

def filterbyWallet() {
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClass',[('elementClass'):"c-multi-select c-multi-select-multiple c-multi-select-selection-tags"]), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClass',[('elementClass'):"c-multi-select c-multi-select-multiple c-multi-select-selection-tags"]), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClass',[('elementClass'):"c-multi-select c-multi-select-multiple c-multi-select-selection-tags"]))
	
	for(int i = 0; i<=2 ; i++) {
		WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassIndex',[('elementClass'):"c-multi-select-option c-multi-selected",('index'):1]))
	}
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassIndex',[('elementClass'):"c-multi-select-option",('index'):selectwalletclass]),GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassIndex',[('elementClass'):"c-multi-select-option",('index'):selectwalletclass]),GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassIndex',[('elementClass'):"c-multi-select-option",('index'):selectwalletclass]))
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"tw-w-20 tw-text-center",('text'):"Go >"]), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"tw-w-20 tw-text-center",('text'):"Go >"]))
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"tw-font-bold",('text'):selectwallettext]), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"tw-font-bold",('text'):selectwallettext]), GlobalVariable.G_TIMEOUT)
}

def filterbyDate() {
	
	String[] startDate = startdate.split("-")
	String[] endDate = enddate.split("-")
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):'Start']),GlobalVariable.G_TIMEOUT )
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):'Start']))
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/liquidityManagement/pickerHeader',[('elementClass'):"date-picker__year-header",('index'):1]))
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonText',[('element'):startDate[2]]))
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/liquidityManagement/pickerHeader',[('elementClass'):"date-picker__month-header",('index'):1]))
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonText',[('element'):startDate[1]]))
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/liquidityManagement/datePicker',[('class'):"date-picker__cell date-picker__day date-picker__day--current",('text'):startDate[0],('index'):1]))
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):'End']),GlobalVariable.G_TIMEOUT )
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):'End']))
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/liquidityManagement/pickerHeader',[('elementClass'):"date-picker__year-header",('index'):2]))
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/liquidityManagement/datePicker',[('class'):"date-picker__year-button",('text'):endDate[2],('index'):2]))
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/liquidityManagement/pickerHeader',[('elementClass'):"date-picker__month-header",('index'):2]))
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/liquidityManagement/datePicker',[('class'):"date-picker__month-button",('text'):endDate[1],('index'):2]))
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/liquidityManagement/datePicker',[('class'):"date-picker__cell date-picker__day date-picker__day--current",('text'):endDate[0],('index'):2]))
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"tw-w-20 tw-text-center",('text'):"Go >"]), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"tw-w-20 tw-text-center",('text'):"Go >"]))
}











