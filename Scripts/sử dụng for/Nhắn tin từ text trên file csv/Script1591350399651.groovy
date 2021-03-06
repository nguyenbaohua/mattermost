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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8065/')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5'), 'testuser')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.sendKeys(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), Keys.chord(Keys.ENTER))

for (def i = 1; i <= 5; i++) {
    WebUI.setText(findTestObject('Object Repository/Page_Town Square - team1 Mattermost/textarea_Write to Town Square_post_textbox'), 
        findTestData('Message').getValue('Message', i))

    WebUI.sendKeys(findTestObject(null), 'Keys.chord(Keys.ENTER)')
}

