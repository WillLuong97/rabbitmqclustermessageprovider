package com.producers.rabbitproducerclient;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String username;
    private String userEmail;
    private String userPassword;
}
