package com.birt.undark.controllers;

import com.birt.undark.dto.AccessoryDTO;
import com.birt.undark.exceptions.AccessoryByIdNotFoundException;
import com.birt.undark.jpa.models.Accessory;
import com.birt.undark.services.AccessoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


// UPD 08\01\22
@RequestMapping(value = "accessory")
@RequiredArgsConstructor
@RestController
public class AccessoryController {

    private final AccessoryService accessoryService;

    @GetMapping("/{id}")
    public Accessory getAccessory(@PathVariable Long id) throws AccessoryByIdNotFoundException {
        return accessoryService.getAccessory(id);
    }

    @PostMapping
    public void addAccessory(@RequestBody AccessoryDTO accessoryDto) {
        accessoryService.addAccessory(accessoryDto);
    }

    @PatchMapping
    public void updateAccessory(@RequestBody AccessoryDTO accessoryDto) {
        accessoryService.updateAccessory(accessoryDto);
    }

    @DeleteMapping("/{id}")
    public void deleteAccessory(@PathVariable Long id) throws AccessoryByIdNotFoundException {
        accessoryService.deleteAccessory(id);
    }

    @GetMapping("/all")
    public List<Accessory> getAllAccessories() {
        return accessoryService.getAllAccessories();
    }
}
