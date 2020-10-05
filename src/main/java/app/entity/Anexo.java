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
* Classe que representa a tabela ANEXO
* @generated
*/
@Entity
@Table(name = "\"ANEXO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Anexo")
public class Anexo implements Serializable {

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
    @Column(name = "arquivo", nullable = true, unique = false, insertable=true, updatable=true)
    @CronapiCloud(type = "dropbox", value="ZbDnzp_wSzAAAAAAAAAAAWNkDXobOdOXEwZNk8KOs8IKZf19Boecz2aGa6cOoVa3", id="", secret="")
        
        private java.lang.String arquivo;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_chamado", nullable = true, referencedColumnName = "numero_chamado", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Chamado chamado;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private User user;

    /**
    * Construtor
    * @generated
    */
    public Anexo(){
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
    public Anexo setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém arquivo
    * return arquivo
    * @generated
    */
    
    public java.lang.String getArquivo(){
        return this.arquivo;
    }

    /**
    * Define arquivo
    * @param arquivo arquivo
    * @generated
    */
    public Anexo setArquivo(java.lang.String arquivo){
        this.arquivo = arquivo;
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
    public Anexo setChamado(Chamado chamado){
        this.chamado = chamado;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    
    public User getUser(){
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Anexo setUser(User user){
        this.user = user;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Anexo object = (Anexo)obj;
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