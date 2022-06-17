package io.estudo.daniel.bookstore.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table( name = "livro" )
public class Livro {

    @EqualsAndHashCode.Include
    private Integer id;

    private String titulo;

    private String nomeAutor;

    private String texto;

    private Categoria categoria;
}
