package com.pmira.formacion.steps;

import com.pmira.formacion.pageobjects.ConvertionsPage;

public class ConvertionsSteps {
    ConvertionsPage convertionsPage;


    public void OpenPage() {
        convertionsPage.open();
    }

    public void FillOutFieldsLenght(String values) {
        convertionsPage.FillOutFieldsLenght(values);
    }

    public void verifyResult(String values) {
        convertionsPage.verifyResult(values);
    }

    public void FillOutFieldsSpeed(String values)  {
        convertionsPage.FillOutFieldsSpeed(values);
    }
}
