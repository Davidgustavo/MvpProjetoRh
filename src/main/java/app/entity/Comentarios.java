package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela COMENTARIOS
* @generated
*/
@Entity
@Table(name = "\"COMENTARIOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Comentarios")
public class Comentarios implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "comentario", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String comentario;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_chamado", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Chamado chamado;

    /**
    * Construtor
    * @generated
    */
    public Comentarios(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Comentarios setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém comentario
    * return comentario
    * @generated
    */
    
    public java.lang.String getComentario(){
        return this.comentario;
    }

    /**
    * Define comentario
    * @param comentario comentario
    * @generated
    */
    public Comentarios setComentario(java.lang.String comentario){
        this.comentario = comentario;
        return this;
    }
    /**
    * Obtém chamado
    * return chamado
    * @generated
    */
    
    public Chamado getChamado(){
        return this.chamado;
    }

    /**
    * Define chamado
    * @param chamado chamado
    * @generated
    */
    public Comentarios setChamado(Chamado chamado){
        this.chamado = chamado;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Comentarios object = (Comentarios)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}