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

WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'afiz@usenobi.com', ('password') : 'RigbBhfdqOBGNlJIWM1ClA=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('TRADE/Pages/LoginPage/2FaSubmit'))

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('TRADE/Pages/CoinPairManagementPage/settingsTradeMenu'), GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('TRADE/Pages/CoinPairManagementPage/settingsTradeMenu'))

WebUI.click(findTestObject('TRADE/Pages/CoinPairManagementPage/coinPairManagement'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Show']), 
    GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('TRADE/Pages/CoinPairManagementPage/showDropDown'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : '5']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : '10']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : '15']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : '20']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : '50']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : '100']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Add More']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Coin']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Ticker']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Maintenance']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Status Listing']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Detail']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Edit']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Avalanche']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'AVAX']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'BNB']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Bitcoin']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'BTC']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Cardano']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'ADA']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'DAI']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Dash']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'DASH']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Ethereum']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'ETH']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Firo']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'XZC']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Honest']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'HNST']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'IDK']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'IDK']),
	GlobalVariable.G_TIME_OUT)

WebUI.scrollToElement(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Next']),
	GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/next'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Polkadot']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'DOT']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Polygon']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'MATIC']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Solana']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'SOL']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Tether']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'USDT']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'USD Coin']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'USDC']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Uniswap']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'UNI']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Vexanium']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'VEX']),
	GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('TRADE/Pages/CoinPairManagementPage/prev'))

WebUI.click(findTestObject('TRADE/Pages/CoinPairManagementPage/ethDetails'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Coin']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Ticker']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Category']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Short Coin Description English']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Full Coin Description English']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Short Coin Description Indonesia']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Full Coin Description Indonesia']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Min. Amount (Buy/Sell)']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Min. Amount (Buffering Flow)']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Default Watchlist']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'User Level']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Status Listing']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Auto-Buy Time (24h)']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Maintenance']), 
    GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('TRADE/Pages/CoinPairManagementPage/backFromDetail'))

WebUI.click(findTestObject('TRADE/Pages/CoinPairManagementPage/editButtonListCoin'))

WebUI.click(findTestObject('TRADE/Pages/CoinPairManagementPage/statusListing'))

WebUI.click(findTestObject('TRADE/Pages/CoinPairManagementPage/checklistButtonStatusListing'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Set Status Listing']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Confirm']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Cancel']),
	GlobalVariable.G_TIME_OUT)

WebUI.delay(10)

WebUI.click(findTestObject('TRADE/Pages/CoinPairManagementPage/submit2FaStatusListing'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'SUCCESS']),
	GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/CoinPairManagementPage/elementByText', [('element') : 'Coin pair updated successfully!']),
	GlobalVariable.G_TIME_OUT)

WebUI.closeBrowser()

