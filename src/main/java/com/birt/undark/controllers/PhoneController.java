package com.birt.undark.controllers;

import com.birt.undark.dto.PhoneDTO;
import com.birt.undark.exceptions.PhoneByIdNotFoundException;
import com.birt.undark.jpa.models.Phone;
import com.birt.undark.services.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RequestMapping(value = "phone")
@RequiredArgsConstructor
@RestController
public class PhoneController {

    private final PhoneService phoneService;

    @GetMapping("/{id}")
    public Phone getPhone(@PathVariable Long id) throws PhoneByIdNotFoundException {
        return phoneService.getPhone(id);
    }

    @PostMapping
    public void addPhone(@RequestBody PhoneDTO phoneDto) {
        phoneService.addPhone(phoneDto);
    }

    @PatchMapping
    public void updatePhone(@RequestBody PhoneDTO phoneDto) {
        phoneService.updatePhone(phoneDto);
    }

    @DeleteMapping("/{id}")
    public void deletePhone(@PathVariable Long id) throws PhoneByIdNotFoundException{
        phoneService.deletePhone(id);
    }
    @GetMapping("/all")
    public List<Phone> getAllPhones(){
        return phoneService.getAllPhones();
    }
}
