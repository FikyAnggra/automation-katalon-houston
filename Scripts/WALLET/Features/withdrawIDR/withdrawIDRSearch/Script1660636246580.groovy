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
		WebUI.closeBrowser()
		break
	case 'NEGATIVE':
		failedSearchBy()
		WebUI.closeBrowser()
		break
}

def setUpWdIDR() {
	WebUI.callTestCase(findTestCase('WALLET/Features/withdrawIDR/withdrawIDRShowList'), [:], FailureHandling.STOP_ON_FAILURE)
}

def successSearchBy() {
	
	setUpWdIDR()
	
	WebUI.setText(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder', [('element') : search]), searchBy)

	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass', [('element') : 'ri-search-line']),GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass', [('element') : 'ri-search-line']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.delay(5)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementDivByTitle',[('element') : resultSearch]), GlobalVariable.G_TIMEOUT)

	WebUI.closeBrowser()
}

def failedSearchBy() {
	
	setUpWdIDR()
	
	WebUI.setText(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder', [('element') : search]), searchBy)

	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass', [('element') : 'ri-search-line']),GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass', [('element') : 'ri-search-line']), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic', [('element') : resultSearch]), GlobalVariable.G_TIMEOUT)

	WebUI.closeBrowser()
}