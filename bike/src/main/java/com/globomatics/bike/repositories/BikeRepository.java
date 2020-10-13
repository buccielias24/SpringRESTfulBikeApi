/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globomatics.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.globomatics.bike.models.Bike;

/**
 *
 * @author elias
 */
public interface BikeRepository extends JpaRepository<Bike, Long> {
    
}
