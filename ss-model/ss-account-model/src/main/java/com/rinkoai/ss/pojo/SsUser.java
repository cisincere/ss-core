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
    private Long id;
    private Long userId;
    private String username;
    private String nickName;
}
