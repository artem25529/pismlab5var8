package com.es.service;

import javax.ejb.Stateless;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Stateless
public class CardValidatorBean implements CardValidator {
    @Override
    public boolean validate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
        LocalDate date = LocalDate.from(formatter.parse(dateStr));

        return date.isAfter(LocalDate.now());
    }
}
