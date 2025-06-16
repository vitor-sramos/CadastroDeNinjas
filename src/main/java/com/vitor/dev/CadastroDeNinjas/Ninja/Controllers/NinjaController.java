package com.vitor.dev.CadastroDeNinjas.Ninja.Controllers;

import com.vitor.dev.CadastroDeNinjas.Ninja.Model.Ninja;
import com.vitor.dev.CadastroDeNinjas.Ninja.Services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping
    public List<Ninja>  listaNinjas() {
        return ninjaService.listaNinjas();
    }

    @PostMapping
    public Ninja criaNinja(@RequestBody Ninja ninja) {
        return ninjaService.criaNinja(ninja);
    }
}
