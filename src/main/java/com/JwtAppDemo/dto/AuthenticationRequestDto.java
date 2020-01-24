package com.JwtAppDemo.dto;

import lombok.Data;

/**
 * DTO class for authentication (login) request.
 *
 * @author Serhii Diukarev
 * @version 1.0
 */

@Data
public class AuthenticationRequestDto {
    private String username;
    private String password;
}