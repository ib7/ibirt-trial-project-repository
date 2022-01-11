package com.birt.undark.services;

import com.birt.undark.dto.AccessoryDTO;
import com.birt.undark.exceptions.AccessoryByIdNotFoundException;
import com.birt.undark.jpa.models.Accessory;
import java.util.List;

// UPD 08\01\22
public interface AccessoryService {
    Accessory getAccessory(long id) throws AccessoryByIdNotFoundException;

    void deleteAccessory(long id) throws AccessoryByIdNotFoundException;

    void addAccessory(AccessoryDTO accessory);

    void updateAccessory(AccessoryDTO accessory);

    List<Accessory> getAllAccessories();

}
