package br.com.camel.orquestrador.domain.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contrato {

    private Long id;
    private String name;
    private String status;
}
