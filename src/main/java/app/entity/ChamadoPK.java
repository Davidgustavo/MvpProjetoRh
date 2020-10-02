package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class ChamadoPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
   * @generated
   */
  private java.lang.Integer numero_chamado;

  /**
   * Construtor
   * @generated
   */
  public ChamadoPK(){
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
  public ChamadoPK setId(java.lang.String id){
    this.id = id;
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
  public ChamadoPK setNumero_chamado(java.lang.Integer numero_chamado){
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
ChamadoPK object = (ChamadoPK)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    if (numero_chamado != null ? !numero_chamado.equals(object.numero_chamado) : object.numero_chamado != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    result = 31 * result + ((numero_chamado == null) ? 0 : numero_chamado.hashCode());
    return result;
  }

}
