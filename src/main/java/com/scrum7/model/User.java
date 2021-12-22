package com.scrum7.model;

/**
 *
 * @author Jeison Hernandez
 */

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    /**
     *
     * Datos para la creacion de la tabla User
     */
    @Id
    private Integer id;
    private String identification;
    private String name;
    private String address;
    private String cellPhone;
    private String email;
    private String password;
    private String zone;
    private String type;





}
