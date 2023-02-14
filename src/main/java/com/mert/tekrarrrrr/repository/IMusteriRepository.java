package com.mert.tekrarrrrr.repository;

import com.mert.tekrarrrrr.repository.entity.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMusteriRepository extends JpaRepository<Musteri,Long> {
}
