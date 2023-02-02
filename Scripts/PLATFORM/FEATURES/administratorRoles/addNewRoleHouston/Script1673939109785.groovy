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

WebUI.comment('Test Scenario :: ' + testCase)

WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/administratorUsers/administratorUsersShowList'), [:])

WebUI.verifyElementPresent(findTestObject('Object Repository/PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'Roles']), 
    GlobalVariable.G_SHORTTIMEOUT)

WebUI.click(findTestObject('Object Repository/PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'Roles']))

WebUI.verifyElementPresent(findTestObject('Object Repository/PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'Role Name']), 
    GlobalVariable.G_SHORTTIMEOUT)

//page add role
WebUI.verifyElementPresent(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByClass', [('elementClass') : 'btn tw-relative btn-primary btn-sm']), 
    GlobalVariable.G_SHORTTIMEOUT)

WebUI.click(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByClass', [('elementClass') : 'btn tw-relative btn-primary btn-sm']))

WebUI.verifyElementPresent(findTestObject('PLATFORM/Pages/LoginPage/elementByPlaceholder', [('element') : 'Role name']), 
    GlobalVariable.G_SHORTTIMEOUT)

WebUI.setText(findTestObject('PLATFORM/Pages/LoginPage/elementByPlaceholder', [('element') : 'Role name']), roleName)

//click permission
WebUI.verifyElementPresent(findTestObject('PLATFORM/Pages/AdministratorRolePage/checkboxAdministrator'), GlobalVariable.G_SHORTTIMEOUT)

WebUI.click(findTestObject('PLATFORM/Pages/AdministratorRolePage/checkboxAdministrator'))

WebUI.scrollToElement(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'Submit']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : 'Submit']))

WebUI.verifyElementPresent(findTestObject('PLATFORM/Pages/AdministratorUserPage/elementByText', [('element') : alertMessage]), 
    GlobalVariable.G_TIMEOUT)

