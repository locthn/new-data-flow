import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://genk.vn/ExternalAgencies/Dashboard/LateExitMutamers"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/ExternalAgencies/Dashboard/LateExitMutamers')

"Step 2: Click on button ' \u0627\u0644\u062a\u0635\u0641\u064a\u0629'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_ExternalAgencies_Dashboard_LateExitMutamers/button'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ExternalAgencies/Dashboard/LateExitMutamers?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ExternalAgencies_Dashboard_LateExitMutamers/button'))

"Step 3: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Verify Late Exit Mutamers from Dashboard of External Agencies_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
