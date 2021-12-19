package com.rinkoai.ss.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SsUser implements Serializable {
    private static final long serialVersionUID = -8493217891425016779L;

    private Long id;

    private Long userId;

    private String name;

    private String password;

    private String email;

    private String phone;

    private String avatar;

    private String nickName;
}
