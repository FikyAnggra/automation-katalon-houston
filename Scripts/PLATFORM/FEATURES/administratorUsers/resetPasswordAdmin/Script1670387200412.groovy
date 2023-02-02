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

WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/administratorUsers/administratorSearch'), [('testCase') : 'fifi@nobi.com', ('searchData') : 'fifi@nobi.com'], null)

WebUI.verifyElementPresent(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementBySpanClass', [('element') : 'ri-arrow-right-s-line']), 
    GlobalVariable.G_SHORTTIMEOUT)

WebUI.click(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementBySpanClass', [('element') : 'ri-arrow-right-s-line']))
WebUI.verifyElementPresent(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'Reset password']),
	GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'Reset password']))


WebUI.verifyElementPresent(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByClass', [('elementClass') : 'tw-px-8']),
	GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByClass', [('elementClass') : 'tw-px-8']))

WebUI.verifyElementPresent(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'SUCCESS']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'Password is successfully reset!']), GlobalVariable.G_TIMEOUT)
