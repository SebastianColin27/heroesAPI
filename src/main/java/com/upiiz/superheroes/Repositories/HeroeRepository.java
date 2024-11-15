package com.upiiz.superheroes.Repositories;

import com.upiiz.superheroes.Entities.HeroeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroeRepository extends JpaRepository<HeroeEntity, Long> {
}
