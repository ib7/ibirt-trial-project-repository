package com.birt.undark.jpa.repositories;

import com.birt.undark.jpa.models.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// UPD 08\01\22
@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, Long> {
}