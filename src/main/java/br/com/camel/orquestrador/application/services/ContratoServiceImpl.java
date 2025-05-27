package br.com.camel.orquestrador.application.services;

import br.com.camel.orquestrador.application.ports.in.ContratoServicePort;
import br.com.camel.orquestrador.domain.models.Contrato;
import org.springframework.stereotype.Service;

@Service
public class ContratoServiceImpl implements ContratoServicePort {

    @Override
    public Contrato getContrato() {
        return Contrato.builder().id(1L).name("Thiago").status("Ativo").build();
    }
}
