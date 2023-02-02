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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'luthfiani@usenobi.com', ('password') : 's9XPkkDKqpu/XIOTnYME3A=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Test Scenario :: ' + testCase)

WebUI.verifyElementPresent(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'Administrator']), 
    GlobalVariable.G_SHORTTIMEOUT)

WebUI.click(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'Administrator']))

WebUI.verifyElementPresent(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'Add User']), 
    GlobalVariable.G_SHORTTIMEOUT)

WebUI.click(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'Add User']))

WebUI.verifyElementPresent(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementFormByPlaceholder', [('elementFormByPlaceholder') : 'Email']), 
    GlobalVariable.G_SHORTTIMEOUT)

WebUI.setText(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementFormByPlaceholder', [('elementFormByPlaceholder') : 'Email']), 
    email)

WebUI.verifyElementPresent(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementFormByPlaceholder', [('elementFormByPlaceholder') : 'Name']), 
    GlobalVariable.G_SHORTTIMEOUT)

WebUI.setText(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementFormByPlaceholder', [('elementFormByPlaceholder') : 'Name']), 
    name)

WebUI.click(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementFormByDropdown', [('element') : '6']))

WebUI.click(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'Submit']))

if (testType == 'POSITIVE') {
    WebUI.waitForElementPresent(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'Confirmation']), 
        GlobalVariable.G_TIMEOUT)

    WebUI.click(findTestObject('PLATFORM/Pages/AdministratorUserPage/yesButton'))

    //Untuk verify pop up
    WebUI.waitForElementPresent(findTestObject('Object Repository/PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : alertMessage]), 
        GlobalVariable.G_TIMEOUT)
} else {
    WebUI.waitForElementPresent(findTestObject('Object Repository/PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : alertMessage]), 
        GlobalVariable.G_TIMEOUT)

    WebUI.verifyElementPresent(findTestObject('Object Repository/PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : alertMessage]), 
        GlobalVariable.G_TIMEOUT)
}

