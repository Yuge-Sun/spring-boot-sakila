package com.Sakila.Sakila;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SakilaApplication.class)

public class CucumberContextConfig {
}