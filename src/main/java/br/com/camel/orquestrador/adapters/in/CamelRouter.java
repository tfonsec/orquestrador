package br.com.camel.orquestrador.adapters.in;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class CamelRouter extends RouteBuilder {

    @Override
    public void configure() {


        rest("/api")
                .get("/contrato")
                .produces("text/plain")
                .to("direct:processaContrato");

        from("direct:processaContrato")
                .routeId("rotaGetContrato")
                .setBody(simple("Requisição efetuada com sucesso"));
    }
}
