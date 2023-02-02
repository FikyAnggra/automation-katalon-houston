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

switch(testCase) {
	case 'FilterStatus':
		baseSetUp()
		searchStatus()
		WebUI.closeBrowser()
		break
		
	case 'FilterPaymentType':
		baseSetUp()
		searchPaymentType()
		WebUI.closeBrowser()
}
	


def baseSetUp() {
	WebUI.callTestCase(findTestCase('WALLET/Features/depositIDR/depositIDRShowList'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDropDown',[('element'):search]))
}
	
def searchStatus() {
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass',[('element'):'ri-arrow-right-s-line']), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass',[('element'):'ri-arrow-right-s-line']))
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/depositIDR/elementByTableStatus',[('row'):1 , ('column'):9 , ('text'):Result]), GlobalVariable.G_TIMEOUT)
	
	WebUI.closeBrowser()
}

def searchPaymentType() {
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDropDown',[('element'):searchPaymentMethod]))
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass',[('element'):'ri-arrow-right-s-line']), GlobalVariable.G_TIMEOUT)
	
	WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass',[('element'):'ri-arrow-right-s-line']))
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/depositIDR/elementByTablePaymentMethod',[('row'):1 , ('column'):5 , ('text'):Result]), GlobalVariable.G_TIMEOUT)
	
	WebUI.closeBrowser()
}


