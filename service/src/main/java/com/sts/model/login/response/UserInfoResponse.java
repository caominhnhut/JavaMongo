package com.sts.model.login.response;

import lombok.*;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfoResponse {

    private String id;

    private String email;

    private List<String> roles;

}
