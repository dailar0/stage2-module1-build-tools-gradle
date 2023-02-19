package com.epam.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.epam.utils.StringUtils.isPositiveNumber;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String arg : args) {
            if (!isPositiveNumber(arg))
                return false;
        }
        return true;
    }
}