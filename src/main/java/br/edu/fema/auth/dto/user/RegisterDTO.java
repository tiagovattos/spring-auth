package br.edu.fema.auth.dto.user;

public record RegisterDTO(String username, String password, String email, String role) {
}
