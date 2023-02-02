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

Test = 'Service \'Trade\''

Test1 = 'Service \'Buy\''

Test2 = 'Service \'Sell\''

Test3 = 'Service \'Watchlist\''

Test4 = 'Service \'Auto-Buy\''

Test5 = 'Service \'NFT Wallet\''

WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'afiz@usenobi.com', ('password') : 'RigbBhfdqOBGNlJIWM1ClA=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('TRADE/Pages/LoginPage/2FaSubmit'))

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('TRADE/Pages/ServiceMaintenance/serviceMaintenanceMenu'), GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/serviceMaintenanceMenu'))

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/serviceMaintenance'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Show']), GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/showDropDown'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : '5']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : '10']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : '15']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : '20']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : '50']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : '100']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Service']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Maintenance']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Status']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'History']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Edit']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Trade']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Buy']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Sell']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Watchlist']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Auto-Buy']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'NFT Wallet']), 
    GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/editBuy'))

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/checklistBuy'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Set Maintenance']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/setMaintenance'), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Confirm']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Cancel']), GlobalVariable.G_TIME_OUT)

WebUI.delay(10)

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/submit2FaBuyMaintenance'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'SUCCESS']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'You have successfully Set']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Maintenance Schedule for']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : Test1]), GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/editSell'))

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/checklistSell'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Set Maintenance']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/setMaintenance'), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Confirm']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Cancel']), GlobalVariable.G_TIME_OUT)

WebUI.delay(10)

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/submit2FaSellMaintenance'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'SUCCESS']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'You have successfully Set']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Maintenance Schedule for']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : Test2]), GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/editWatchlist'))

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/checklistWatchlist'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Set Maintenance']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/setMaintenance'), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Confirm']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Cancel']), GlobalVariable.G_TIME_OUT)

WebUI.delay(10)

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/submit2FaWatchlistMaintenance'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'SUCCESS']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'You have successfully Set']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Maintenance Schedule for']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : Test3]), GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('Object Repository/TRADE/Pages/ServiceMaintenance/editTrade'))

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/checklistTrade'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Set Maintenance']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/setMaintenance'), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Confirm']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Cancel']), GlobalVariable.G_TIME_OUT)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/TRADE/Pages/ServiceMaintenance/submit2FaTradeMaintenance'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'SUCCESS']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'You have successfully Set']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Maintenance Schedule for']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : Test]), GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/editAuto-Buy'))

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/checklistAuto-Buy'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Set Maintenance']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/setMaintenance'), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Confirm']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Cancel']), GlobalVariable.G_TIME_OUT)

WebUI.delay(10)

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/submit2FaAuto-BuyMaintenance'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'SUCCESS']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'You have successfully Set']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Maintenance Schedule for']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : Test4]), GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/editNFTWallet'))

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/checklistNFTWallet'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Set Maintenance']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/setMaintenance'), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Confirm']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Cancel']), GlobalVariable.G_TIME_OUT)

WebUI.delay(10)

WebUI.click(findTestObject('TRADE/Pages/ServiceMaintenance/submit2FaNFTWalletMaintenance'))

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'SUCCESS']), GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'You have successfully Set']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : 'Maintenance Schedule for']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('TRADE/Pages/ServiceMaintenance/elementByText', [('element') : Test5]), GlobalVariable.G_TIME_OUT)

WebUI.closeBrowser()

