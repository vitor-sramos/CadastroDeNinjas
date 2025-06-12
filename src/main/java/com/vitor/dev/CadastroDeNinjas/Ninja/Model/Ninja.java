package com.vitor.dev.CadastroDeNinjas.Ninja.Model;

import com.vitor.dev.CadastroDeNinjas.Missoes.Model.Missoes;
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

    // @ManyToOne um ninja tem uma única missão.
    @ManyToOne
    @JoinColumn(name = "id_missao") // Chave estranjeira
    private Missoes missao;
}
