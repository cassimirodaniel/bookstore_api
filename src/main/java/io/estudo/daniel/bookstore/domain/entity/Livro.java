package io.estudo.daniel.bookstore.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table( name = "livro" )
public class Livro implements Serializable {

    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_livro")
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "nome_autor")
    private String nomeAutor;

    @Column(name = "texto")
    private String texto;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
