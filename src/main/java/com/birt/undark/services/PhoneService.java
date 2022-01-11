package com.birt.undark.services;

import com.birt.undark.dto.PhoneDTO;
import com.birt.undark.exceptions.PhoneByIdNotFoundException;
import com.birt.undark.jpa.models.Phone;
import java.util.List;


public interface PhoneService {
    Phone getPhone(long id) throws PhoneByIdNotFoundException;

    void deletePhone(long id) throws PhoneByIdNotFoundException;

    void addPhone(PhoneDTO phone);

    void updatePhone(PhoneDTO phone);

    List<Phone> getAllPhones();
}
