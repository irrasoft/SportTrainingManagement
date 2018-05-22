package com.irrasoft.stm.cucumber.stepdefs;

import com.irrasoft.stm.SportTrainingManagementApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SportTrainingManagementApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
