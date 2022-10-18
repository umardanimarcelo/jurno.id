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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://jurno.id/')

WebUI.click(findTestObject('Object Repository/Stori/TC03_OpenArticelStori/Page_Jurno.id  Pelopor Media Web3/h4_Stori'))

WebUI.click(findTestObject('Object Repository/Stori/TC03_OpenArticelStori/Page_Jurno - Indeks/p_Pekerja Seluruh Dunia, Tutup Laptop, Ayo Nyantai'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Stori/TC03_OpenArticelStori/Page_Pekerja Seluruh Dunia, Tutup Laptop, A_2df456/div_Pekerja Seluruh Dunia,Tutup Laptop,Ayo Nyantai'))

WebUI.closeBrowser()

