package com.juaracoding.cucumber.utils;

public enum TestScenarios {


    T1("User invalid login"),
    T2("User valid login"),
    T3("Search candidates by job title"),
    T4("Add candidates");
    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
