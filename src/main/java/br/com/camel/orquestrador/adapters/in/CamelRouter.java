package br.com.camel.orquestrador.adapters.in;

import br.com.camel.orquestrador.application.ports.in.ContratoServicePort;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRouter extends RouteBuilder {


    private final ContratoServicePort contratoServicePort;

    public CamelRouter(ContratoServicePort contratoServicePort) {
        this.contratoServicePort = contratoServicePort;
    }

    @Override
    public void configure() {


        rest("/api")
                .get("/contrato")
                .produces("application/json")
                .to("direct:processaContrato");

        from("direct:processaContrato")
                .routeId("rotaGetContrato")
                .setBody(exchange -> contratoServicePort.getContrato());
    }
}
