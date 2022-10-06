package com.revature.springbootdemo.aws;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Secret {
    private String username;
    private String password;
    private String engine;
    private String host;
    private int port;
    private String dbInstanceIdentifier;
}
