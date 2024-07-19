package com.nttdata.glue;
import com.nttdata.steps.ApiStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
public class ApiStepDef {

    @Steps
    ApiStep api;

    @Dado("la url {string} del servicio")
    public void la_url_del_servicio(String url) {
        api.RegistrarURL(url);
    }
    @Cuando("hago la consulta de los articulos")
    public void hago_la_consulta_de_los_articulos() {
        api.EjecucionApi();

    }
    @Entonces("imprimo los articulos")
    public void imprimo_los_articulos() {
        api.ImprimirArticulos();
    }
}
