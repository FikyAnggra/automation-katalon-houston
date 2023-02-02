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

import groovy.inspect.swingui.BytecodeCollector
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement as Keys

import org.openqa.selenium.By as By

import org.openqa.selenium.WebDriver as WebDriver

import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import java.util.List

WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'meilinda@nobi.com', ('password') : 'Fd+8YDMFm21VMHNw4z/kpw=='],
	FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByAHref',[('element') : "/finance/setting"]),GlobalVariable.G_TIMEOUT)

WebUI.scrollToElement(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByAHref',[('element') : "/finance/setting"]),GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByAHref',[('element') : "/finance/setting"]))

WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"nav-link tw-cursor-pointer text-primary",('text'):"Alert"]),GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"nav-link tw-cursor-pointer text-primary",('text'):"Alert"]),GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'):"nav-link tw-cursor-pointer text-primary",('text'):"Alert"]))

WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementDivByClass',[('element'):"tw-px-2 tw-py-1 tw-rounded tw-text-xs mr-2 tw-bg-secondary tw-cursor-pointer"]),GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementDivByClass',[('element'):"tw-px-2 tw-py-1 tw-rounded tw-text-xs mr-2 tw-bg-secondary tw-cursor-pointer"]),GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementDivByClass',[('element'):"tw-px-2 tw-py-1 tw-rounded tw-text-xs mr-2 tw-bg-secondary tw-cursor-pointer"]))

WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDivText',[('element'):"Filter"]), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDivText',[('element'):"Filter"]), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDivText',[('element'):"Filter"]))

WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByCheckBoxValue',[('element'):value]),GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByCheckBoxValue',[('element'):value]),GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByCheckBoxValue',[('element'):value]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonText',[('element'):"Set"]))

WebDriver driver =  DriverFactory.getWebDriver()

WebElement table = driver.findElement(By.xpath("//table/tbody"))

List <WebElement> rowsTable = table.findElements(By.tagName("tr"))

int rowsCount = rowsTable.size()

for (int row = 0; row < rowsCount; row++) {
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByClassText',[('class'): classdiv ,('text'):text]), GlobalVariable.G_TIMEOUT)
}
WebUI.closeBrowser()
