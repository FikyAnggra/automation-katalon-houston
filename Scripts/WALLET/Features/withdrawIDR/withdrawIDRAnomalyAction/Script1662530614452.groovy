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
	case 'ApproveTransaction':
		baseSetUp()
		requestTransaction()
		clickTableRow()
		approvedTransaction()
		WebUI.closeBrowser()
		break
	
	case 'RejectTransaction':
		baseSetUp()
		requestTransaction()
		clickTableRow()
		rejectedTransaction()
		WebUI.closeBrowser()
		break
}

def baseSetUp() {
	WebUI.callTestCase(findTestCase('WALLET/Features/withdrawIDR/withdrawIDRShowList'), [:], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Filter']), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Filter']), FailureHandling.STOP_ON_FAILURE)
}

def setFilter() {
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonText',[('element') : "Set"]), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonText',[('element') : "Set"]))
}

def requestTransaction() {
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDivLabel',[('element'):'Request']), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDivLabel',[('element'):'Request']), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDivLabel',[('element'):'Request']))
	
	setFilter()
}

def clickTableRow() {
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/withdrawIDR/elementTableByColumnStatus',[('row'):1,('column'):8,('class'):'ri-arrow-right-s-line']), GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/withdrawIDR/elementTableByColumnStatus',[('row'):1,('column'):8,('class'):'ri-arrow-right-s-line']), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/withdrawIDR/elementTableByColumnStatus',[('row'):1,('column'):8,('class'):'ri-arrow-right-s-line']))
}

def approvedTransaction() {
	//absolute xpath web element
	AbsoluteXpath absoluteXpath = new AbsoluteXpath()
	//set web driver using selenium
	WebDriver driver =  DriverFactory.getWebDriver()
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Approve']),GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Approve']),GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Approve']))
	
	WebElement element = (new WebDriverWait(driver, 5))
	.until(ExpectedConditions.elementToBeClickable(By.xpath(absoluteXpath.getButtonYesApprove())));
element.click()
	
WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):"Approved and processing withdrawal"]),GlobalVariable.G_TIMEOUT)
}

def rejectedTransaction() {
	//absolute xpath web element
	AbsoluteXpath absoluteXpath = new AbsoluteXpath()
	//set web driver using selenium
	WebDriver driver =  DriverFactory.getWebDriver()
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/withdrawIDR/elementBySpecificButton',[('class1'):'tw-w-18',('class2'):'tw-relative tw-block',('text'):'Reject']), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/withdrawIDR/elementBySpecificButton',[('class1'):'tw-w-18',('class2'):'tw-relative tw-block',('text'):'Reject']))
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassIndex',[('elementClass'):'ql-editor ql-blank',('index'):2]),GlobalVariable.G_TIMEOUT)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassIndex',[('elementClass'):'ql-editor ql-blank',('index'):2]),GlobalVariable.G_TIMEOUT)
	
	WebUI.setText(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassIndex',[('elementClass'):'ql-editor ql-blank',('index'):2]),"QA")
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonFooter',[('element'):'Reject']),GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonFooter',[('element'):'Reject']))
	
	WebElement btnReject = (new WebDriverWait(driver,GlobalVariable.G_SHORTTIMEOUT))
	.until(ExpectedConditions.elementToBeClickable(By.xpath(absoluteXpath.getButtonYesReject())));
	btnReject.click()
}









