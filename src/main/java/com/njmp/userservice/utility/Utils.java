package com.njmp.userservice.utility;

import com.auth0.jwt.algorithms.Algorithm;

import java.nio.charset.StandardCharsets;

public class Utils {

    public static Algorithm getJWTAlgorithm() {
        Algorithm algorithm = Algorithm.HMAC256("secret".getBytes(StandardCharsets.UTF_8));
        return algorithm;
    }
}
