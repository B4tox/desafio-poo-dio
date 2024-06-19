package br.com.dio.desafio.dominio;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Matricula {

    private Long idMatricula;
    private LocalDate dataMatricula;
    private Cliente cliente;
    private List<Curso> curso;
}
