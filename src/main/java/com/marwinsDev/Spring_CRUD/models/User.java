package com.marwinsDev.Spring_CRUD.models;

// Modelo de usuário para o MongoDB
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

// Especifica o nome da coleção no MongoDB
@Table(name = "users")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// Classe de modelo de usuário
public class User {
    @Id // Anotação para indicar que este campo é o ID do documento
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automática do ID
    private Long id;
    private String name;
    private Integer age;

    @Column(nullable = false, unique = true)
    private String email;
    private String password;
}