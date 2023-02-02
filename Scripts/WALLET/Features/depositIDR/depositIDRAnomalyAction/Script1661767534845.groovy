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

//package for webdriver selenium
import org.openqa.selenium.WebDriver
import java.time.Duration
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

switch(testCase) {
	case 'RejectTransaction':
		baseSetUp()
		processingTransaction()
		clickTableRow()
		rejectTransaction()
		WebUI.closeBrowser()
		break
		
	case 'SettleTransaction':
		baseSetUp()
		notSettledTransaction()
		clickTableRow()
		settleTransaction()
		WebUI.closeBrowser()
		break
	
	case 'ApproveTransaction':
		baseSetUp()
		processingTransaction()
		clickTableRow()
		approveTransaction()
		WebUI.closeBrowser()
		break
}

def baseSetUp() {
	WebUI.callTestCase(findTestCase('WALLET/Features/depositIDR/depositIDRShowList'), [:], FailureHandling.STOP_ON_FAILURE)
}

def processingTransaction() {
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDropDown',[('element'):'suspicious']))
}

def notSettledTransaction() {
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDropDown',[('element'):'pending']))
}

def clickTableRow() {
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass',[('element'):'ri-arrow-right-s-line']), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass',[('element'):'ri-arrow-right-s-line']))
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementTrByIndex',[('index'):1]), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementTrByIndex',[('index'):1]), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementTableByColumn',[('row') :1 , ('column') : 10]), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementTableByColumn',[('row') :1 , ('column') : 10]))
}

def approveTransaction() {
	//absolute xpath web element
	AbsoluteXpath absoluteXpath = new AbsoluteXpath()
	//set web driver using selenium
	WebDriver driver =  DriverFactory.getWebDriver() 
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Approve']),GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Approve']),GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Approve']))
	
	WebElement element = (new WebDriverWait(driver, 5))
		.until(ExpectedConditions.elementToBeClickable(By.xpath(absoluteXpath.getButtonYesModal())));
	element.click()
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):"Deposit succesfully processed to user wallet"]),GlobalVariable.G_TIMEOUT)
}

def settleTransaction() {
	//absolute xpath web element
	AbsoluteXpath absoluteXpath = new AbsoluteXpath()
	//set web driver using selenium
	WebDriver driver =  DriverFactory.getWebDriver()
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Settle']),GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Settle']),GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Settle']))
	
	WebElement btnYesModalSettle = (new WebDriverWait(driver,GlobalVariable.G_SHORTTIMEOUT))
	.until(ExpectedConditions.elementToBeClickable(By.xpath(absoluteXpath.getButtonYesModalSettle())));
	btnYesModalSettle.click()
}

def rejectTransaction() {
	//absolute xpath web element
	AbsoluteXpath absoluteXpath = new AbsoluteXpath()
	//set web driver using selenium
	WebDriver driver =  DriverFactory.getWebDriver()
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Reject']),GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Reject']),GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Reject']))
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementDivByClass',[('element'):'ql-editor ql-blank']),GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementDivByClass',[('element'):'ql-editor ql-blank']),GlobalVariable.G_TIMEOUT)
	
	WebUI.setText(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementDivByClass',[('element'):'ql-editor ql-blank']), "QA")
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonFooter',[('element'):'Reject']),GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonFooter',[('element'):'Reject']))
	
	WebElement btnRejectModal = (new WebDriverWait(driver,GlobalVariable.G_SHORTTIMEOUT))
	.until(ExpectedConditions.elementToBeClickable(By.xpath(absoluteXpath.getButtonYesRejectModal())));
	btnRejectModal.click()
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):"Deposit has been updated"]),GlobalVariable.G_TIMEOUT)
}