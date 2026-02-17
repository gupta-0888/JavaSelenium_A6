package org.testPackage;

import org.generic.BaseTest;
import org.repository.BasePage;
import org.repository.RecruitmentPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.generic.MyListener.class)
public class TC_004_Recruitment_Test extends BaseTest{
	
	@Test
	public void runRecruitment() {
		BasePage basePage = new BasePage(driver);
		basePage.getRecruitmentLink().click();
		RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
		recruitmentPage.searchCandidate();
		
	}

}
