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

WebUI.callTestCase(findTestCase('WALLET/Features/PGSettings/PGService/PGServiceShowList'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass',[('element'):"ri-add-line"]), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass',[('element'):"ri-add-line"]), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass',[('element'):"ri-add-line"]))

WebUI.scrollToElement(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):"Input PG Name"]), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):"Input PG Name"]), GlobalVariable.G_TIMEOUT)

WebUI.setText(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):"Input PG Name"]), pg_name)

WebUI.scrollToElement(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):"Input Disbursement Cost"]), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):"Input Disbursement Cost"]), GlobalVariable.G_TIMEOUT)

WebUI.setText(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):"Input Disbursement Cost"]), dis_cost)

WebUI.scrollToElement(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):"Input Threshold"]), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):"Input Threshold"]), GlobalVariable.G_TIMEOUT)

WebUI.setText(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):"Input Threshold"]), threshold)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementOptionByValueIndex',[('elementOptionByValue'):"inactive",('index'):2]))

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass',[('element'):"ri-check-line"]), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass',[('element'):"ri-check-line"]))

WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextIndex',[('element'):pg_name,('index'):2]), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextIndex',[('element'):pg_name,('index'):2]), GlobalVariable.G_TIMEOUT)

WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextIndex',[('element'):"create",('index'):1]), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextIndex',[('element'):"create",('index'):1]), GlobalVariable.G_TIMEOUT)


