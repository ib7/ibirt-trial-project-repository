package com.birt.undark.services.impl;

import com.birt.undark.dto.AccessoryDTO;
import com.birt.undark.dto.converters.AccessoryDtoConverter;
import com.birt.undark.exceptions.AccessoryByIdNotFoundException;
import com.birt.undark.jpa.models.Accessory;
import com.birt.undark.jpa.repositories.AccessoryRepository;
import com.birt.undark.services.AccessoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

// UPD 08\01\22
@RequiredArgsConstructor
@Service
public class AccessoryServiceImpl implements AccessoryService {

    private final AccessoryRepository accessoryRepository;

    @Override
    public Accessory getAccessory(long id) throws AccessoryByIdNotFoundException {

        return getAccessoryByIdFromAccessoryRepository(id);
    }

    @Override
    public void deleteAccessory(long id) throws AccessoryByIdNotFoundException {

        accessoryRepository.delete(getAccessoryByIdFromAccessoryRepository(id));
    }

    @Override
    public void addAccessory(AccessoryDTO accessoryDto) {
        Accessory accessory = AccessoryDtoConverter.convert(accessoryDto);
        accessoryRepository.save(accessory);
    }

    @Override
    public void updateAccessory(AccessoryDTO accessoryDto) {
        Optional<Accessory> accessoryOptional = accessoryRepository.findById(accessoryDto.getId());
        if (accessoryOptional.isPresent()) {
            Accessory accessory = accessoryOptional.get();
            AccessoryDtoConverter.convertForUpdate(accessoryDto, accessory);
            accessoryRepository.save(accessory);
        }
    }

    @Override
    public List<Accessory> getAllAccessories() {
        return accessoryRepository.findAll();
    }


    private Accessory getAccessoryByIdFromAccessoryRepository(long id) throws AccessoryByIdNotFoundException {
        return accessoryRepository.findById(id).orElseThrow(() -> new AccessoryByIdNotFoundException(id));
    }
}