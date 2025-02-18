package com.sesi.projeto.dto;

import java.time.Instant;

public record UsuarioDto(String nome, String email, String telefone, String senha, String roles) {

}