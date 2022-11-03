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

WebUI.callTestCase(findTestCase('Shop Demoqa/LoginShopDemo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Shop Demo QA/Page_My Account  ToolsQA Demo Site/a_Search'))

WebUI.setText(findTestObject('Object Repository/Shop Demo QA/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    'dress')

WebUI.sendKeys(findTestObject('Object Repository/Shop Demo QA/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Shop Demo QA/Page_Search Results for dress  ToolsQA Demo Site/a_black satin one shoulder cut out midi dress'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Shop Demo QA/Page_black satin one shoulder cut out midi _f65846/select_Choose an optionBlack'), 
    'black', false)

WebUI.selectOptionByValue(findTestObject('Shop Demo QA/Page_black satin one shoulder cut out midi _f65846/select_Choose an optionLargeMediumSmall'), 
    'large', false)

WebUI.click(findTestObject('Object Repository/Shop Demo QA/Page_black satin one shoulder cut out midi _f65846/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Shop Demo QA/Page_black satin one shoulder cut out midi _f65846/a_Search'))

WebUI.setText(findTestObject('Object Repository/Shop Demo QA/Page_black satin one shoulder cut out midi _f65846/input_Type and Press Enter to Search_s'), 
    't shirt')

WebUI.sendKeys(findTestObject('Object Repository/Shop Demo QA/Page_black satin one shoulder cut out midi _f65846/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Shop Demo QA/Page_Search Results for t shirt  ToolsQA Demo Site/a_pink drop shoulder oversized t shirt'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Shop Demo QA/Page_pink drop shoulder oversized t shirt  _e751c6/select_Choose an optionPink'), 
    'pink', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Shop Demo QA/Page_pink drop shoulder oversized t shirt  _e751c6/select_Choose an option363738'), 
    '37', false)

WebUI.click(findTestObject('Object Repository/Shop Demo QA/Page_pink drop shoulder oversized t shirt  _e751c6/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Shop Demo QA/Page_pink drop shoulder oversized t shirt  _e751c6/i_Checkout_icon_bag_alt'))

txtDress = WebUI.getText(findTestObject('Shop Demo QA/Page_Cart  ToolsQA Demo Site/a_black satin one shoulder cut out midi dre_8b4fb8'))

txtTShirt = WebUI.getText(findTestObject('Shop Demo QA/Page_Cart  ToolsQA Demo Site/a_pink drop shiulder oversized t shirt'))

WebUI.verifyElementText(findTestObject('Shop Demo QA/Page_Cart  ToolsQA Demo Site/a_black satin one shoulder cut out midi dre_8b4fb8'), 
    'BLACK SATIN ONE SHOULDER CUT OUT MIDI DRESS - BLACK')

WebUI.verifyElementText(findTestObject('Shop Demo QA/Page_Cart  ToolsQA Demo Site/a_pink drop shiulder oversized t shirt'), 
    'PINK DROP SHOULDER OVERSIZED T SHIRT - PINK')

