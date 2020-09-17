package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela HISTORICO
* @generated
*/
@Entity
@Table(name = "\"HISTORICO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Historico")
public class Historico implements Serializable {

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
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data;

    /**
    * @generated
    */
    @Column(name = "alterComentario", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String alterComentario;

    /**
    * @generated
    */
    @Column(name = "alterStatus", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String alterStatus;

    /**
    * Construtor
    * @generated
    */
    public Historico(){
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
    public Historico setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém data
    * return data
    * @generated
    */
    
    public java.util.Date getData(){
        return this.data;
    }

    /**
    * Define data
    * @param data data
    * @generated
    */
    public Historico setData(java.util.Date data){
        this.data = data;
        return this;
    }
    /**
    * Obtém alterComentario
    * return alterComentario
    * @generated
    */
    
    public java.lang.String getAlterComentario(){
        return this.alterComentario;
    }

    /**
    * Define alterComentario
    * @param alterComentario alterComentario
    * @generated
    */
    public Historico setAlterComentario(java.lang.String alterComentario){
        this.alterComentario = alterComentario;
        return this;
    }
    /**
    * Obtém alterStatus
    * return alterStatus
    * @generated
    */
    
    public java.lang.String getAlterStatus(){
        return this.alterStatus;
    }

    /**
    * Define alterStatus
    * @param alterStatus alterStatus
    * @generated
    */
    public Historico setAlterStatus(java.lang.String alterStatus){
        this.alterStatus = alterStatus;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Historico object = (Historico)obj;
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