import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://genk.vn/"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

"Step 2: Click on link 'Samsung ra m\u1eaft Galaxy S24 Ultra b\u1ea3n \u0111\u1eb7c bi\u1ec7t: H\u1ed9p ph\u1ee5 ki\u1ec7n c\u1ef1c ch\u1ea5t, gi\u1edbi h\u1ea1n 2.000 chi\u1ebfc' -> Navigate to page '*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_samsung_ra_m_t_galaxy_s24_ultra_b_n_c'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_samsung_ra_m_t_galaxy_s24_ultra_b_n_c'))

"Step 3: Click on link 'So s\xe1nh Galaxy Z Fold 6 v\xe0 Galaxy Z Fold 5: Thi\u1ebft k\u1ebf thay \u0111\u1ed5i ra sao?'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_so_s_nh_galaxy_z_fold_6_v_galaxy_z_fold'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_so_s_nh_galaxy_z_fold_6_v_galaxy_z_fold'))

"Step 4: Click on link 'B\u1ecb YouTuber MKBHD ch\xea bai l\xe0 "chi\u1ebfc xe t\u1ec7 nh\u1ea5t t\u1eebng \u0111\xe1nh gi\xe1", c\u1ed5 phi\u1ebfu m\u1ed9t h\xe3ng xe \u0111i\u1ec7n bay h\u01a1i 50%'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_b_youtuber_mkbhd_ch_bai_l_chi_c_xe_t'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_b_youtuber_mkbhd_ch_bai_l_chi_c_xe_t'))

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Comparison of Samsung Galaxy Models on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
