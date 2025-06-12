package com.vitor.dev.CadastroDeNinjas.Ninja.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_ninja")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // vai gerer id com números seuquênciais.
    private Long id;
    private String nome;
    private String email;
    private int idade;
}
