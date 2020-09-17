package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
    import cronapi.CronapiCloud;


/**
* Classe que representa a tabela CHAMADO
* @generated
*/
@Entity
@Table(name = "\"CHAMADO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Chamado")
public class Chamado implements Serializable {

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
    @Column(name = "assunto", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String assunto;

    /**
    * @generated
    */
    @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricao;

    /**
    * @generated
    */
    @Column(name = "anexo", nullable = true, unique = false, insertable=true, updatable=true)
    @CronapiCloud(type = "dropbox", value="sl.Ahv23ZNZ2d2MbHFO4xYJe7fM8X07PwnVbUCxarZcctx1jxyQBzdjJF-YsiXiexxnSqNifEAje5gA859NOXtojdzTm_FDyWn8HDUh4wvbdt011bjML1Vp20_ch9RYrUzmAtdKfho", id="", secret="")
        
        private java.lang.String anexo;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_class1", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Categoria class1;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_historico", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Historico historico;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_status", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Status status;

    /**
    * @generated
    */
    @Column(name = "comentarios", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String comentarios;

    /**
    * Construtor
    * @generated
    */
    public Chamado(){
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
    public Chamado setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém assunto
    * return assunto
    * @generated
    */
    
    public java.lang.String getAssunto(){
        return this.assunto;
    }

    /**
    * Define assunto
    * @param assunto assunto
    * @generated
    */
    public Chamado setAssunto(java.lang.String assunto){
        this.assunto = assunto;
        return this;
    }
    /**
    * Obtém descricao
    * return descricao
    * @generated
    */
    
    public java.lang.String getDescricao(){
        return this.descricao;
    }

    /**
    * Define descricao
    * @param descricao descricao
    * @generated
    */
    public Chamado setDescricao(java.lang.String descricao){
        this.descricao = descricao;
        return this;
    }
    /**
    * Obtém anexo
    * return anexo
    * @generated
    */
    
    public java.lang.String getAnexo(){
        return this.anexo;
    }

    /**
    * Define anexo
    * @param anexo anexo
    * @generated
    */
    public Chamado setAnexo(java.lang.String anexo){
        this.anexo = anexo;
        return this;
    }
    /**
    * Obtém class1
    * return class1
    * @generated
    */
    
    public Categoria getClass1(){
        return this.class1;
    }

    /**
    * Define class1
    * @param class1 class1
    * @generated
    */
    public Chamado setClass1(Categoria class1){
        this.class1 = class1;
        return this;
    }
    /**
    * Obtém historico
    * return historico
    * @generated
    */
    
    public Historico getHistorico(){
        return this.historico;
    }

    /**
    * Define historico
    * @param historico historico
    * @generated
    */
    public Chamado setHistorico(Historico historico){
        this.historico = historico;
        return this;
    }
    /**
    * Obtém status
    * return status
    * @generated
    */
    
    public Status getStatus(){
        return this.status;
    }

    /**
    * Define status
    * @param status status
    * @generated
    */
    public Chamado setStatus(Status status){
        this.status = status;
        return this;
    }
    /**
    * Obtém comentarios
    * return comentarios
    * @generated
    */
    
    public java.lang.String getComentarios(){
        return this.comentarios;
    }

    /**
    * Define comentarios
    * @param comentarios comentarios
    * @generated
    */
    public Chamado setComentarios(java.lang.String comentarios){
        this.comentarios = comentarios;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Chamado object = (Chamado)obj;
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