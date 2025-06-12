package com.vitor.dev.CadastroDeNinjas.Missoes.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_missoes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Missoes {

    private Long id;
    private String nome;
    private String dificuldade;
}
