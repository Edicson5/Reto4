package com.usa.misiontic.herramientas.controller;


import com.usa.misiontic.herramientas.entities.Admin;
import com.usa.misiontic.herramientas.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Admin")
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/all")
    public List<Admin> getAll() { return adminService.getAll();}

    @GetMapping("/{id}")
    public Optional<Admin> getAdmin(@PathVariable("id") int id){
        return adminService.getAdmin(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Admin save (@RequestBody Admin a) {return adminService.save(a);}

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Admin update (@RequestBody Admin a){return adminService.update(a);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return adminService.delete(id);
    }

}
