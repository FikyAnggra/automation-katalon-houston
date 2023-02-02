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

WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'system@honestmining.com', ('password') : 'RigbBhfdqOBGNlJIWM1ClA=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('TRADE/Pages/TradingPage/nobiTradeMenu'))

WebUI.click(findTestObject('TRADE/Pages/TradingPage/buyMenu'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/TradingPage/divByText', [('element') : 'Show']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/TradingPage/divByText', [('element') : 'Filter']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/TradingPage/divByText', [('element') : 'Date']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/TradingPage/divByText', [('element') : 'Ref ID']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/TradingPage/divByText', [('element') : 'User ID']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/TradingPage/divByText', [('element') : 'Buy Amount']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/TradingPage/divByText', [('element') : 'Crypto Amount']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/TradingPage/divByText', [('element') : 'Unfilled']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/TradingPage/divByText', [('element') : 'Gross Amount']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/TradingPage/divByText', [('element') : 'PPN']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/TradingPage/divByText', [('element') : 'PPH 22']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/TradingPage/divByText', [('element') : 'Fee NOBI']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/TradingPage/divByText', [('element') : 'Cost Indodax']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/TradingPage/divByText', [('element') : 'Details']), GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('TRADE/Pages/TradingPage/refID'))

WebUI.setText(findTestObject('TRADE/Pages/TradingPage/refID'), '7154X1667920924285X919X5')

WebUI.click(findTestObject('TRADE/Pages/TradingPage/search'))

WebUI.delay(5)

WebUI.closeBrowser()

