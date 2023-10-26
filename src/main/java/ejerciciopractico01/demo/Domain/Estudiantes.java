/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico01.demo.Domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Jordi
 */
@Data
@Entity
@Table(name = "estudiantes")
public class Estudiantes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String nombre;
    private Long identificacion;
    private String nivel_cursando;
    private int edad;
    private float altura;
    private float peso;
    private String genero;

    public Estudiantes(Long id, String nombre, Long identificacion, String nivel_cursando, int edad, float altura, float peso, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.nivel_cursando = nivel_cursando;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
    }

}