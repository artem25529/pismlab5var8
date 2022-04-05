package com.es.service;

import javax.ejb.Local;

@Local
public interface CardValidator {
    boolean validate(String date);
}
