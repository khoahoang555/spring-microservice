package com.java.ecommerce.sharedlibrary.utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringUtils {

    private StringUtils() {}

    public static String concatStrings(String ...parameters) {
        return Arrays.stream(parameters).collect(Collectors.joining("/"));
    }
}
