package com.birt.undark.services.impl;

import com.birt.undark.dto.PhoneDTO;
import com.birt.undark.dto.converters.PhoneDtoConverter;
import com.birt.undark.exceptions.PhoneByIdNotFoundException;
import com.birt.undark.jpa.models.Phone;
import com.birt.undark.jpa.repositories.PhoneRepository;
import com.birt.undark.services.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class PhoneServiceImpl implements PhoneService {

    private final PhoneRepository phoneRepository;

    @Override
    public Phone getPhone(long id) throws PhoneByIdNotFoundException {
        // UPD 07\01\22
        return getPhoneByIdFromPhoneRepository(id);
    }

    @Override
    public void deletePhone(long id) throws PhoneByIdNotFoundException {
        // UPD 07\01\22
        phoneRepository.delete(getPhoneByIdFromPhoneRepository(id));
    }

    @Override
    public void addPhone(PhoneDTO phoneDto) {
        Phone phone = PhoneDtoConverter.convert(phoneDto);
        phoneRepository.save(phone);
    }

    @Override
    public void updatePhone(PhoneDTO phoneDto) {
        Optional<Phone> phoneOptional = phoneRepository.findById(phoneDto.getId());
        if (phoneOptional.isPresent()) {
            Phone phone = phoneOptional.get();
            PhoneDtoConverter.convertForUpdate(phoneDto, phone);
            phoneRepository.save(phone);
        }
    }

    @Override
    public List<Phone> getAllPhones() {
        return phoneRepository.findAll();
    }

    // UPD 07\01\22
    private Phone getPhoneByIdFromPhoneRepository(long id) throws PhoneByIdNotFoundException {
        return phoneRepository.findById(id).orElseThrow(() -> new PhoneByIdNotFoundException(id));
    }
}