package com.upiiz.superheroes.Controllers;

import com.upiiz.superheroes.Entities.HeroeEntity;
import com.upiiz.superheroes.Services.HeroeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/heroes")
public class HeroeController {
    @Autowired
    private HeroeService heroeService;

    @GetMapping
    public ResponseEntity<List<HeroeEntity>> getHeroes(){
        return ResponseEntity.ok(heroeService.getAllHeroes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HeroeEntity> getHeroeById(@PathVariable Long id){
        return ResponseEntity.ok(heroeService.getHeroeById(id));
    }

    @PostMapping
    public ResponseEntity<HeroeEntity> createHeroe(@RequestBody HeroeEntity heroe){
        return ResponseEntity.ok(heroeService.createHeroe(heroe));
    }

    @PutMapping("/{id}")
    public ResponseEntity<HeroeEntity> updateHeroe(@PathVariable Long id, @RequestBody HeroeEntity heroe ){
        heroe.setId(id);
        return ResponseEntity.ok(heroeService.updateHeroe(heroe));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HeroeEntity> deleteHeroe(@PathVariable Long id){
        heroeService.deleteHeroe(id);
        return ResponseEntity.noContent().build();
    }
}
