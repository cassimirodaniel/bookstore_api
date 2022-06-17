package io.estudo.daniel.bookstore.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table( name = "categoria" )
public class Categoria {

    @EqualsAndHashCode.Include
    private Integer id;

    private String nome;

    private String descricao;

    private List<Livro> livros;
}
