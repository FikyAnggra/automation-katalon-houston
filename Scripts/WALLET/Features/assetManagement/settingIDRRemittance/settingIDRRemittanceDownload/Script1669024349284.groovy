import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.regex.Pattern
import java.util.stream.Collectors

File downloadPathFile = new File(RunConfiguration.getProjectDir()+ '/' +'DownloadFiles/')
if (!downloadPathFile.exists()) {
	downloadPathFile.mkdir();
}

WebUI.callTestCase(findTestCase('WALLET/Features/assetManagement/settingIDRRemittance/settingIDRRemittanceShowList'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass',[('element'):'ri-download-line']), GlobalVariable.G_TIMEOUT)

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass',[('element'):'ri-download-line']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementBySpanClass',[('element'):'ri-download-line']))

WebUI.verifyElementPresent(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDivText',[('element'):'CSV']), GlobalVariable.G_TIMEOUT)

WebUI.click(findTestObject('Object Repository/WALLET/Pages/walletTransaction/dynamicTransactionXPath/elementByDivText',[('element'):'CSV']))

// Delay needed to make sure file is downloaded to the folder.
WebUI.delay(5)

mydate = new Date()
formattedDate = mydate.format('yyyyMMdd')
dateHour = mydate.format('HHmm')

Path userHome = Paths.get(RunConfiguration.getProjectDir())
Path downloadsFolder = userHome.resolve('DataDownload')
assert Files.exists(downloadsFolder)

println("user home: "+userHome)
println("download folder: "+downloadsFolder)

Pattern pattern = Pattern.compile(".*asset_remittance_request_" + formattedDate + dateHour + ".*")

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

WebUI.closeBrowser()
