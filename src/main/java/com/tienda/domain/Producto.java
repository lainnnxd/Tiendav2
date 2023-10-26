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
@Table(name = "Producto")
public class Producto implements Serializable { // serializacion funciona para almacenar ciertos datos en la memoria virtual

    private static final long serialVersionUID = 1L; //SIRVE PARA PODER HACER EL CICLO DE SUMATORIA DE ID CATEGORIA

    @Id //tabla producto tiene una llave o identificador que va a ser el Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // los valores generados que tipo de estrategia utilizan, IDENTITY = sea igual en la BD y en la clase
    @Column(name = "id_producto") //decir cual es el nombre de la columna en la base de datos

    private long idProducto;
    private String descripcion;
    private boolean activo;
    private String rutaImagen;
   

    public Producto() {

    }

    public Producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
   
    
   
   
}
