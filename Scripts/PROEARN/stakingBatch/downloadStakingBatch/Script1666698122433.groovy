import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.regex.Pattern
import java.util.stream.Collectors

import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable


File downloadPathFile = new File(RunConfiguration.getProjectDir()+ '/' + 'DownloadFiles/')
if (!downloadPathFile.exists() ) {
	downloadPathFile.mkdir()
}

WebUI.callTestCase(findTestCase('PLATFORM/FEATURES/loginHoustonPositive'), [('email') : 'fiky.anggra@usenobi.com', ('password') : 'q9alYSqJqoOAgOPRsuUgZQ=='],FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/finance/reporting']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/finance/reporting']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : 'a', ('elementParameter') : 'href', ('elementValue') : '/finance/reporting']), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') : 'ul', ('elementTwo') : 'li', ('elementTag') : '*' ,('twoElementByText') : 'NOBI Earn']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/twoElementByText', [('elementOne') : 'ul', ('elementTwo') : 'li', ('elementTag') : '*' ,('twoElementByText') : 'NOBI Earn']), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'button', ('elementByText') : 'Earn 2.0 Reporting']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'button', ('elementByText') : 'Earn 2.0 Reporting']), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'a', ('elementByText') : 'Staking Batch']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'a', ('elementByText') : 'Staking Batch']), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : '*', ('elementParameter') : 'class' , ('elementValue'): 'ri-download-line']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByParameter', [('elementTag') : '*', ('elementParameter') : 'class' , ('elementValue'): 'ri-download-line']), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PROEARN/Pages/General/elementTagByText', [('elementTag') : 'Div', ('elementByText') : 'CSV']))


myDate = new Date()
formattedDate = myDate.format('yyyyMMdd')
dateHour = myDate.format('HHmm')

println(formattedDate)
println(dateHour)

Path userHome = Paths.get(RunConfiguration.getProjectDir())
Path downloadsFolder = userHome.resolve('DataDownload')
assert Files.exists(downloadsFolder)

println(userHome)
println(downloadsFolder)

Pattern pattern = Pattern.compile(".*batch_report_earn_staking_" + formattedDate + dateHour + '.*')

List<Path> files = Files.list(downloadsFolder)
	.filter({ p -> Files.isRegularFile(p) })
	.filter({ p -> pattern.matcher(p.getFileName().toString()).matches() })
	.collect(Collectors.toList())
	
if (files.size() > 0) {
	files.each { file ->
		println file.toString()
	}
} else {
	KeywordUtil.markFailedAndStop("found no file that match regex ${pattern}")
}







