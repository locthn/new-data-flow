import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://genk.vn/"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

"Step 2: Click on link 'G\u1ea7n 3 th\u1eadp k\u1ef7 l\xe0m vi\u1ec7c t\u1ea1i Microsoft, c\u1ef1u gi\xe1m \u0111\u1ed1c gi\u1ea3i th\xedch l\xfd t\u1ea1i sao Windows 11 l\u1ea1i ng\u1eebng h\u1ed7 tr\u1ee3 Android' -> Navigate to page '*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_g_n_3_th_p_k_l_m_vi_c_t_i_microsoft_c'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_g_n_3_th_p_k_l_m_vi_c_t_i_microsoft_c'))

"Step 3: Click on link 'TH\u1ee6 THU\u1eacT' -> Navigate to page 'thu-thuat.chn'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_th_thu_t'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_th_thu_t'))

"Step 4: Click on link 'Th\u1ee7 thu\u1eadt ti\u1ebft ki\u1ec7m dung l\u01b0\u1ee3ng cho ng\u01b0\u1eddi d\xf9ng iPhone th\u01b0\u1eddng xuy\xean quay video' -> Navigate to page '*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_thu_thuat_chn/hyperlink_th_thu_t_ti_t_ki_m_dung_l_ng_cho_ng_i'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thu-thuat.chn?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thu_thuat_chn/hyperlink_th_thu_t_ti_t_ki_m_dung_l_ng_cho_ng_i'))

"Step 5: Click on link 'Ra m\u1eaft MacBook Air 2024 v\u1edbi chip M3, Apple cho th\u1ea5y \u0111ang "t\u1ea5t tay" v\u1edbi cu\u1ed9c ch\u01a1i AI nh\u01b0 th\u1ebf n\xe0o'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_ra_m_t_macbook_air_2024_v_i_chip_m3_app'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_ra_m_t_macbook_air_2024_v_i_chip_m3_app'))

"Step 6: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_object'))

"Step 7: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/div_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_object_1'))

"Step 8: Click on link"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_object'))

"Step 9: Click on link 'GIA D\u1ee4NG' -> Navigate to page 'gia-dung.chn'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_gia_d_ng'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_gia_d_ng'))

"Step 10: Click on link 'btnSearch' -> Navigate to page 'tim-kiem.chn'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_gia_dung_chn/hyperlink_btnsearch'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gia-dung.chn?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gia_dung_chn/hyperlink_btnsearch'))

"Step 11: Click on link 'Startup Vi\u1ec7t Coin98 s\xe1p nh\u1eadp studio chuy\xean v\u1ec1 game Yunero, h\u01b0\u1edbng t\u1edbi \u0111\u1ea9y m\u1ea1nh web3 v\xe0 GameFi' -> Navigate to page '*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tim_kiem_chn/hyperlink_startup_vi_t_coin98_s_p_nh_p_studio_chuy'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tim-kiem.chn?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_tim_kiem_chn/hyperlink_startup_vi_t_coin98_s_p_nh_p_studio_chuy'))

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Navigation and Access to Gia Dung Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
