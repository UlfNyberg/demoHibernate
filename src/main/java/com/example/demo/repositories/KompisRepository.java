package com.example.demo.repositories;

import com.example.demo.models.Kompis;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-15
 * Time: 10:37
 * Project: demo
 * Copyright: MIT
 */
public interface KompisRepository extends CrudRepository <Kompis, Long> {

    List<Kompis> findByName (String name);
    List<Kompis> findByEmail (String email);
    List<Kompis> findByPhoneNumber (String phoneNumber);
    List<Kompis> findByNameAndPhoneNumber (String name, String phoneNumber);

}
