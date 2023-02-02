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

WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'fiky.anggra@usenobi.com', ('password') : 'q9alYSqJqoOAgOPRsuUgZQ=='],FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/finance/reporting']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/finance/reporting']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/finance/reporting']), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') : 'ul', ('elementTwo') : 'li', ('elementTag') : '*' ,('twoElementByText') : 'NOBI Earn']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') : 'ul', ('elementTwo') : 'li', ('elementTag') : '*' ,('twoElementByText') : 'NOBI Earn']), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'button', ('elementByText') : 'Earn 2.0 Reporting']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'button', ('elementByText') : 'Earn 2.0 Reporting']), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'a', ('elementByText') : 'Staking Batch']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'a', ('elementByText') : 'Staking Batch']), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'Div', ('elementByText') : 'Batch']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'Div', ('elementByText') : 'Name']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'Div', ('elementByText') : 'Exit Fee']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'Div', ('elementByText') : 'Join Fee']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'Div', ('elementByText') : 'Performance Fee']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'Div', ('elementByText') : 'Bonus']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'Div', ('elementByText') : 'Revenue']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'Div', ('elementByText') : 'Ticker']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'Div', ('elementByText') : 'Start Collecting']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'Div', ('elementByText') : 'End Collecting']), GlobalVariable.G_TIMEOUT)
