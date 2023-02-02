import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

expectedLayer1EN = 'This asset is built on the main blockchain architecture, also known as the "Implementation Layer." Layer 1 tokens process and finalize transactions on the same blockchain.'

expectedLayer1ID = 'Aset ini dibangun pada arsitektur blockchain yang dikenal sebagai "lapisan implementasi". Aset kategori layer 1 memproses segala jenis transaksi di jaringannya sendiri.'

WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'system@honestmining.com', ('password') : 'RigbBhfdqOBGNlJIWM1ClA=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('TRADE/Pages/coinCategoryPage/tradeMenu'), GlobalVariable.G_TIME_OUT)

WebUI.click(findTestObject('TRADE/Pages/coinCategoryPage/tradeMenu'))

WebUI.click(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/coinCategoryMenu'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Show']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Add New Category']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Name']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Description English']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Description Indonesia']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Top Assets']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'This asset is categorized as one of the top performers in the crypto market. It is ranked based on market cap and value traded all time.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Aset ini dikelompokkan sebagai aset dengan performa yang baik. Penilaian ini berdasarkan dari besarnya market cap dan jumlah yang dijual-belikan sepanjang waktu.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Add New Category']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Stablecoin']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'This asset is tied to another currency, commodity or other financial instruments.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'These assets have low volatility and act as an investment alternatives in crypto.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Aset ini terikat dengan referensi eksternal seperti mata uang, komoditas atau instrumen keuangan lain.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Aset dengan kategori ini memiliki fluktuasi yang rendah dan berfungsi sebagai investasi alternatif di kripto.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'NFT/Gaming']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'This asset is connected to NFT or gaming services using the play-to-earn concept.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Aset ini terhubung dengan layanan NFT atau gaming dan menggunakan konsep play-to-earn.']), 
    GlobalVariable.G_TIME_OUT)

Layer1EN = WebUI.getText(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/layer1En'))

Layer1ID = WebUI.getText(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/layer1Id'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Layer 1']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyEqual(expectedLayer1EN, Layer1EN)

WebUI.verifyEqual(expectedLayer1ID, Layer1ID)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'DeFi']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'This asset is used in DeFi apps run on blockchains with smart contracts.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'You can use assets in this category to trade, get loans, earn interest, and more between users without intermediaries or third parties on their DeFi apps.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Aset DeFi merupakan aset yang berjalan dalam blockchain aplikasi DeFi menggunakan smart contract.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Aset ini dapat digunakan untuk jual-beli, mengajukan pinjaman, menabung antar pengguna tanpa penyedia jasa layanan keuangan di aplikasinya masing-masing.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'CEX']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'This asset is traded in a Centralized Exchange (CEX), a crypto exchange operated by a company that owns it as a centralized entity.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'CEX facilitates trades between users by maintaining an order book, similar to a stock market.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Aset ini dimiliki dan dijual-belikan di Centralized Exchange (CEX), platform jual-beli kripto yang dikelola oleh sebuah organisasi secara terpusat.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'CEX memfasilitasi jual-beli antar pengguna menggunakan order book, mirip seperti pasar saham.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Layer 2']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'This asset is a blockchain or protocol built on another blockchain (Layer 1) to increase its transaction capacity.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/TRADE/Pages/coinCategoryPage/elementByText', [('element') : 'Aset ini adalah blockchain atau protokol yang dibangun di atas blockchain lain (Layer 1) untuk meningkatkan kapasitas transaksinya.']), 
    GlobalVariable.G_TIME_OUT)

WebUI.closeBrowser()

