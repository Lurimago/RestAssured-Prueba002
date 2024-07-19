package com.nttdata.steps;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiStep {
    String URL;
    Response response;


    public void RegistrarURL(String url) {
        URL = url;
    }

    public void EjecucionApi() {

        response =
                given()
                        .contentType("application/json")
                        .log()
                        .all()
                        .get(URL+"/posts")

        ;
    }

    public void ImprimirArticulos() {
        System.out.println(response.asString());
    }
}
