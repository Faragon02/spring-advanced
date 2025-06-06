package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    //lv1 -3 코드 개선 퀴즈 - Validation

    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[\\d])[A-Za-z\\d]{8,}$",
            message = "새 비밀번호는 8자 이상이어야 하고, 숫자와 대문자를 포함해야 합니다." )
    @NotBlank
    private String oldPassword;

    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[\\d])[A-Za-z\\d]{8,}$",
            message = "새 비밀번호는 8자 이상이어야 하고, 숫자와 대문자를 포함해야 합니다." )
    @NotBlank
    private String newPassword;
}
