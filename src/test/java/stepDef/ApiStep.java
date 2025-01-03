package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiPage;

public class ApiStep {
    ApiPage apiPage;
    public ApiStep() {
        apiPage = new ApiPage();
    }

    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
        apiPage.prepareUrlFor(url);
    }

    @And("hit api for get list users")
    public void hitApiForGetListUsers() {
        apiPage.hitApiForGetListUsers();
    }

    @Then("Validation status code is equal {int}")
    public void validationStatusCodeIsEqual(int status_code) {
        apiPage.validationStatusCodeIsEqual();
    }

    @Then("Validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        apiPage.validationResponseBodyGetListUsers();
    }

    @Then("Validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        apiPage.validationResponseJsonWithJSONSchema();
    }
}
