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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.regex.Pattern
import java.util.stream.Collectors

File downloadPathFile = new File(RunConfiguration.getProjectDir()+ '/' +'DownloadFiles/')
if (!downloadPathFile.exists()) {
	downloadPathFile.mkdir();
}

Mobile.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'sepriana@usenobi.com', ('password') : 'p4y+y39Ir5M5s9+buYNYVA=='], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/finance/reporting']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/finance/reporting']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/finance/reporting']), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') : 'ul', ('elementTwo') : 'li', ('elementTag') : '*', ('twoElementByText') : 'NOBI Earn']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') : 'ul', ('elementTwo') : 'li', ('elementTag') : '*', ('twoElementByText') : 'NOBI Earn']), FailureHandling.STOP_ON_FAILURE)
			
WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'button', ('elementByText') : 'Earn 2.0 Reporting']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'button', ('elementByText') : 'Earn 2.0 Reporting']), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'a', ('elementByText') : 'Collection Reporting']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'a', ('elementByText') : 'Collection Reporting']), FailureHandling.STOP_ON_FAILURE)
	

//how to Download
//CSV current page

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'span', ('elementByText') : 'Download']), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagWithIndex', [('elementTag') : 'div', ('elementParameter') : 'class', ('elementValue') : 'dropdown-item tw-cursor-pointer tw-text-xs', ('elementIndex'):'2']), FailureHandling.STOP_ON_FAILURE)



