package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name="Categoria")
public class Categoria implements Serializable { // serializacion funciona para almacenar ciertos datos en la memoria virtual
    
   private static final long serialVersionUID = 1L; //SIRVE PARA PODER HACER EL CICLO DE SUMATORIA DE ID CATEGORIA
   
   @Id //tabla categoria tiene una llave o identificador que va a ser el Id
   @GeneratedValue(strategy= GenerationType.IDENTITY) // los valores generados que tipo de estrategia utilizan, IDENTITY = sea igual en la BD y en la clase
   @Column(name="id_categoria") //decir cual es el nombre de la columna en la base de datos
    
   private long idCategoria;
   private String descripcion;
   private boolean activo;
   private String rutaImagen;

    public Categoria() {
        
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
   
    
   
   
}
