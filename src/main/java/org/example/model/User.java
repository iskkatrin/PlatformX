package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Класс User представляет пользователя в системе.
 * Содержит информацию о пользователе, такую как имя, email, возраст и дата регистрации.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
    private int age;
    private Date registrationDate;
}