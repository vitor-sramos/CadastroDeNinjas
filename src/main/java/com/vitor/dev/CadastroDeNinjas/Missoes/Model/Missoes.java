package com.vitor.dev.CadastroDeNinjas.Missoes.Model;

import com.vitor.dev.CadastroDeNinjas.Ninja.Model.Ninja;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class Missoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missao")
    private List<Ninja> ninjas;
}
