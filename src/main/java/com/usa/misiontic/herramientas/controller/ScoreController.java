package com.usa.misiontic.herramientas.controller;



import com.usa.misiontic.herramientas.entities.Score;
import com.usa.misiontic.herramientas.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Score")
@CrossOrigin(origins = "*")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/all")
    public List<Score> getAll() { return scoreService.getAll();}

    @GetMapping("/{id}")
    public Optional<Score> getScore(@PathVariable("id") int id){
        return scoreService.getScore(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Score save (@RequestBody Score a) {return scoreService.save(a);}

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Score update (@RequestBody Score a){return scoreService.update(a);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return scoreService.delete(id);
    }

}
