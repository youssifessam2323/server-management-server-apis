package io.joework.servermanagementserverapis.utils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IpValidator implements ConstraintValidator<IP,String> {
    private static final String ipRegex = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return  value.matches(ipRegex);
    }

}
