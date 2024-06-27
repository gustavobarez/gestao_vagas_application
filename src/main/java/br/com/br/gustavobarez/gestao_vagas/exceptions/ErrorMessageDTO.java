package br.com.br.gustavobarez.gestao_vagas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // criar getter e setter
@AllArgsConstructor
public class ErrorMessageDTO {

    private String message;
    private String field;
    
}
