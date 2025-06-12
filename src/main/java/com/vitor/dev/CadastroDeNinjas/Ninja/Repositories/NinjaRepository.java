package com.vitor.dev.CadastroDeNinjas.Ninja.Repositories;

import com.vitor.dev.CadastroDeNinjas.Ninja.Model.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
