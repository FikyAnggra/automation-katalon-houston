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

WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClassIndex',[('element'):"ri-pencil-line",('index'):1]), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClassIndex',[('element'):"ri-pencil-line",('index'):1]), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClassIndex',[('element'):"ri-pencil-line",('index'):1]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementOptionByValue',[('elementOptionByValue'):"on"]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementOptionByValue',[('elementOptionByValue'):filterChoose]))

String[] startDate = dateBegin.split("-")
String[] endDate = dateEnd.split("-")

//startdate

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):"From"]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/liquidityManagement/pickerHeader',[('elementClass'):"date-picker__year-header",('index'):1]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonTextIndex',[('element'):startDate[2],('index'):2]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/liquidityManagement/pickerHeader',[('elementClass'):"date-picker__month-header",('index'):1]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonText',[('element'):startDate[1]]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/liquidityManagement/datePicker',[('class'):"date-picker__cell date-picker__day date-picker__day--current",('text'):startDate[0],('index'):1]))

//end date

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementOptionByValue',[('elementOptionByValue'):filterChoose]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):"To"]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/liquidityManagement/pickerHeader',[('elementClass'):"date-picker__year-header",('index'):2]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonTextIndex',[('element'):endDate[2],('index'):4]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/liquidityManagement/pickerHeader',[('elementClass'):"date-picker__month-header",('index'):2]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByButtonTextIndex',[('element'):endDate[1],('index'):2]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/liquidityManagement/datePicker',[('class'):"date-picker__cell date-picker__day date-picker__day--current",('text'):endDate[0],('index'):2]))

//add reason

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementOptionByValue',[('elementOptionByValue'):filterChoose]))

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):"Write your reason"]))

WebUI.setText(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByPlaceholder',[('element'):"Write your reason"]), "QA")

//submit schedule

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDivText',[('element'):"Submit"]), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDivText',[('element'):"Submit"]))

//confirm

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDivText',[('element'):"Confirm"]), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDivText',[('element'):"Confirm"]))

//verify toast
WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByTextBasic',[('element'):"SUCCESS"]), GlobalVariable.G_TIMEOUT)
