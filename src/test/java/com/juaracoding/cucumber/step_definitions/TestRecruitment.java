package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.RecruitmentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestRecruitment {
    WebDriver driver;
    private static ExtentTest extentTest;
    private RecruitmentPage recruitmentPage = new RecruitmentPage();

    public TestRecruitment() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test case one
    @When("User click menu recruitment")
    public void user_click_menu_recruitment() {
//		Hooks.delay(1);
        recruitmentPage.menuRecruitment();
        extentTest.log(LogStatus.PASS, "User click menu recruitment");
    }

    @Then("User on menu recruitment")
    public void user_on_menu_recruitment() {
        Assert.assertEquals(recruitmentPage.getTxtRecruitment(), "Recruitment");
        extentTest.log(LogStatus.PASS, "User on menu recruitment");
    }

    //Test case two


    @When("User select to search candidates by job title")
    public void user_select_to_search_candidates_by_job_title(){
        recruitmentPage.menuRecruitment();
        recruitmentPage.searchByJobTitle("IT Manager");
        extentTest.log(LogStatus.PASS, "User select IT Manager by Job Title");
    }

    @And("User click button search")
    public void user_click_button_search(){
        recruitmentPage.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "User click button search");
    }

    @Then("User showing candidates by job title selected")
    public void user_showing_candidates_by_job_titel_selected(){
        Assert.assertEquals(recruitmentPage.getTxtITManager(), "IT Manager");
        extentTest.log(LogStatus.PASS, "User showing candidates by job title selected");
    }


    @When("User click button add")
    public void user_click_button_add() {
        recruitmentPage.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "User click button add");
    }

    @And("User input fullname")
    public void user_enter_fullname() {
        recruitmentPage.fullname("Widya", "", "Fitri");
        extentTest.log(LogStatus.PASS, "User input fullname");
    }

    @And("User select vacancy")
    public void user_select_vacancy() {
        recruitmentPage.selectVacancy();
        extentTest.log(LogStatus.PASS, "User select vacancy");
    }

    @And("User input email")
    public void user_enter_email() {
        recruitmentPage.email("widyaaliin@email.com");
        extentTest.log(LogStatus.PASS, "User input email");
    }

    @And("User input contact number")
    public void user_enter_contact_number() {
        recruitmentPage.contactNumber("082167543122");
        extentTest.log(LogStatus.PASS, "User input contact number");
    }

    @And("User upload resume")
    public void user_upload_resume() {
        recruitmentPage.uploadResume("C:\\Mycoolfile\\Juara Coding\\java\\PostTest24\\Resume_Widya.txt");
        extentTest.log(LogStatus.PASS, "User upload resume");
    }

    @And("User input keywords")
    public void user_enter_keywords() {
        recruitmentPage.keywords("tes add candidate");
        extentTest.log(LogStatus.PASS, "User input keywords");
    }

    @And("User input date of application")
    public void user_enter_date_of_application() {
        recruitmentPage.dateOfApplication("");
        extentTest.log(LogStatus.PASS, "User input date of application");
    }

    @And("User input notes")
    public void user_enter_notes() {
        recruitmentPage.notes("tes add candidate");
        extentTest.log(LogStatus.PASS, "User input notes");
    }

    @And("User checklist consent to keep data")
    public void user_checklist_consent_to_keep_data() {
        recruitmentPage.checklistConsent();
        extentTest.log(LogStatus.PASS, "User checklist consent to keep data");
    }

    @And("User click button save")
    public void user_click_button_save() {
        recruitmentPage.clickBtnSave();
        extentTest.log(LogStatus.PASS, "User click button save");
    }

    @Then("User showing application stage data")
    public void user_showing_application_stage_data() {
        Assert.assertEquals(recruitmentPage.getTxtApplicationStage(), "Application Stage");
        extentTest.log(LogStatus.PASS, "User success showing application stage data");
    }

}
