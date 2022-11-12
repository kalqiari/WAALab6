package edu.miu.lab6.entity.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class RefreshTokenRequest {
    @NotBlank
    private String refreshToken;
}
