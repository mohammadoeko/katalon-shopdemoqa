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

WebUI.click(findTestObject('Shop Demo QA/Page_pink drop shoulder oversized t shirt  _e751c6/i_Checkout_icon_bag_alt'))

WebUI.click(findTestObject('Object Repository/Shop Demo QA/Page_Cart  ToolsQA Demo Site/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Shop Demo QA/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'), 
    'mohammad')

WebUI.setText(findTestObject('Object Repository/Shop Demo QA/Page_Checkout  ToolsQA Demo Site/input__billing_last_name'), 
    'eko')

WebUI.setText(findTestObject('Object Repository/Shop Demo QA/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_company'), 
    '-')

WebUI.selectOptionByValue(findTestObject('Shop Demo QA/Page_Checkout  ToolsQA Demo Site/span_Indonesia'), 'ID', false)

WebUI.setText(findTestObject('Object Repository/Shop Demo QA/Page_Checkout  ToolsQA Demo Site/input__billing_address_1'), 
    'Banyuwangi kota')

WebUI.setText(findTestObject('Object Repository/Shop Demo QA/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_address_2'), 
    '-')

WebUI.setText(findTestObject('Object Repository/Shop Demo QA/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 'Banyuwangi')

WebUI.selectOptionByValue(findTestObject('Object Repository/Shop Demo QA/Page_Checkout  ToolsQA Demo Site/span_Jawa Timur'), 
    'JI', false)

WebUI.setText(findTestObject('Object Repository/Shop Demo QA/Page_Checkout  ToolsQA Demo Site/input__billing_postcode'), 
    '89950')

WebUI.setText(findTestObject('Object Repository/Shop Demo QA/Page_Checkout  ToolsQA Demo Site/input__billing_phone'), '09990094')

WebUI.setText(findTestObject('Object Repository/Shop Demo QA/Page_Checkout  ToolsQA Demo Site/textarea_(optional)_order_comments'), 
    '-')

WebUI.click(findTestObject('Object Repository/Shop Demo QA/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/Shop Demo QA/Page_Checkout  ToolsQA Demo Site/button_Place order'))

txtConfOrder = WebUI.getText(findTestObject('Object Repository/Shop Demo QA/Page_Checkout  ToolsQA Demo Site/p_Thank you. Your order has been received'))

WebUI.verifyElementText(findTestObject('Shop Demo QA/Page_Checkout  ToolsQA Demo Site/p_Thank you. Your order has been received'), 
    'Thank you. Your order has been received.')

