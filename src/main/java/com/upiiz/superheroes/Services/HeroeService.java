package com.upiiz.superheroes.Services;

import com.upiiz.superheroes.Entities.HeroeEntity;
import com.upiiz.superheroes.Repositories.HeroeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HeroeService {

    @Autowired
    private HeroeRepository heroeRepository;

    public List<HeroeEntity> getAllHeroes(){
        return heroeRepository.findAll();
    }

    public HeroeEntity getHeroeById(Long id){
        return heroeRepository.findById(id).orElse(null);
    }

    public HeroeEntity createHeroe(HeroeEntity heroe){
        return heroeRepository.save(heroe);
    }

    public HeroeEntity updateHeroe(HeroeEntity heroe){
        return heroeRepository.save(heroe);
    }

    public void deleteHeroe(Long id){
        heroeRepository.deleteById(id);
    }
}
