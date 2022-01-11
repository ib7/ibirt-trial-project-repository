package com.birt.undark.jpa.repositories;

import com.birt.undark.jpa.models.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}