package com.birt.undark.exceptions;

// UPD 08\01\22
public class AccessoryByIdNotFoundException extends Exception {

    public AccessoryByIdNotFoundException(Long id) {
        super(String.format("Can not find accessory by id: %d", id));
    }
}
