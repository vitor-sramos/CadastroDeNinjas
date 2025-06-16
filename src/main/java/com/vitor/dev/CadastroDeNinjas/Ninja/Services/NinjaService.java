package com.vitor.dev.CadastroDeNinjas.Ninja.Services;

import com.vitor.dev.CadastroDeNinjas.Ninja.Model.Ninja;
import com.vitor.dev.CadastroDeNinjas.Ninja.Repositories.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    //LISTAR
    public List<Ninja> listaNinjas() {return ninjaRepository.findAll();}
    //CRIAR
    public Ninja criaNinja(Ninja ninja) {return ninjaRepository.save(ninja);}
    //DELETAR
    public void deletarNinja(Long id) {ninjaRepository.deleteById(id);}
}
