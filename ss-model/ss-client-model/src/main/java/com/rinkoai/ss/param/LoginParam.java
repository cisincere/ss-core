package com.rinkoai.ss.param;

import lombok.Data;

import java.io.Serializable;

@Data
public class LoginParam implements Serializable {

    private static final long serialVersionUID = -8785575122813181445L;

    private String name;

    private String password;
}
