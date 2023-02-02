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

//absolute xpath web element
AbsoluteXpath absoluteXpath = new AbsoluteXpath()

WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [:], FailureHandling.STOP_ON_FAILURE)

//set web driver using selenium
WebDriver driver =  DriverFactory.getWebDriver()

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/depositIDR/transactionIDRDropDown'), 15)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/depositIDR/transactionIDRDropDown'))

//Delay is given to give a delay time for Katalon to execute the next step
WebUI.delay(5)

WebElement pageWithdrawIDR = (new WebDriverWait(driver, 5))
.until(ExpectedConditions.elementToBeClickable(By.xpath(absoluteXpath.getPageWithdrawIDR())));
pageWithdrawIDR.click()

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDropDown',[('element'):'5']), 15)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDropDown',[('element'):'5']))

WebUI.scrollToElement(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'Showing']), 15)

String temp = driver.findElement(By.xpath(absoluteXpath.getTotalTransactionData())).getText();

String actual = WebUI.getText(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):'368']))

WebUI.comment("Test :: "+temp)

//to verify the equality between amount of object shown in web and amount in code
WebUI.verifyEqual(actual, temp)

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextExtended',[('element'): 'Showing', ('element1'):'5']),15)










