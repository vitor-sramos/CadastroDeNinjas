package com.vitor.dev.CadastroDeNinjas.Missoes.Model;

import com.vitor.dev.CadastroDeNinjas.Ninja.Model.Ninja;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Missoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missao")
    private List<Ninja> ninjas;
}
