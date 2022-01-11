package com.birt.undark.exceptions;

public class PhoneByIdNotFoundException extends Exception {

    public PhoneByIdNotFoundException(Long id) {
        super(String.format("Can not find phone by id: %d", id));
    }
}
