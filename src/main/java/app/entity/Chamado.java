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
@Table(name = "\"CHAMADO\"" ,uniqueConstraints=@UniqueConstraint(name="UNQ_CHAMADO_0", columnNames={
    "numero_chamado" }))
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_chamado", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer numero_chamado;

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
    @JoinColumn(name="fk_historico", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Historico historico;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_prioridade", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Prioridade prioridade;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_status", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Status status;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_tipo", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Tipo tipo;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_abertura", nullable = true, unique = false, insertable=true, updatable=true)
        @CronappSecurity(delete = "None", put = "None")
        private java.util.Date data_abertura = Calendar.getInstance().getTime();

    /**
    * Construtor
    * @generated
    */
    public Chamado(){
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
    public Chamado setUser(User user){
        this.user = user;
        return this;
    }
    /**
    * Obtém prioridade
    * return prioridade
    * @generated
    */
    
    public Prioridade getPrioridade(){
        return this.prioridade;
    }

    /**
    * Define prioridade
    * @param prioridade prioridade
    * @generated
    */
    public Chamado setPrioridade(Prioridade prioridade){
        this.prioridade = prioridade;
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
    * Obtém tipo
    * return tipo
    * @generated
    */
    
    public Tipo getTipo(){
        return this.tipo;
    }

    /**
    * Define tipo
    * @param tipo tipo
    * @generated
    */
    public Chamado setTipo(Tipo tipo){
        this.tipo = tipo;
        return this;
    }
    /**
    * Obtém data_abertura
    * return data_abertura
    * @generated
    */
    @CronappSecurity(delete = "None", put = "None")
    public java.util.Date getData_abertura(){
        return this.data_abertura;
    }

    /**
    * Define data_abertura
    * @param data_abertura data_abertura
    * @generated
    */
    public Chamado setData_abertura(java.util.Date data_abertura){
        this.data_abertura = data_abertura;
        return this;
    }
    /**
    * Obtém numero_chamado
    * return numero_chamado
    * @generated
    */
    
    public java.lang.Integer getNumero_chamado(){
        return this.numero_chamado;
    }

    /**
    * Define numero_chamado
    * @param numero_chamado numero_chamado
    * @generated
    */
    public Chamado setNumero_chamado(java.lang.Integer numero_chamado){
        this.numero_chamado = numero_chamado;
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
        if (numero_chamado != null ? !numero_chamado.equals(object.numero_chamado) : object.numero_chamado != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((numero_chamado == null) ? 0 : numero_chamado.hashCode());
        return result;
    }

}