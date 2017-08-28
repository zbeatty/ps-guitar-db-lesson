package com.guitar.db.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guitar.db.model.Manufacturer;

@Repository
public interface ManufacturerJpaRepository extends JpaRepository<Manufacturer, Long> {

    List<Manufacturer> findByFoundedDateBefore(Date date);

    List<Manufacturer> findByActiveIsTrue();

    List<Manufacturer> findByActiveIsFalse();

    List<Manufacturer> getAllThatSellAcoustics(String name);

}
