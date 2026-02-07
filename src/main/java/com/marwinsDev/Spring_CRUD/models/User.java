package com.marwinsDev.Spring_CRUD.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "usuarios")

public class User {
    @Id
    private long id;
    private String name;
    private String email;
}