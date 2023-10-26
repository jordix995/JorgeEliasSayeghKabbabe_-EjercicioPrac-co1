/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico01.demo.DAO;

import ejerciciopractico01.demo.Domain.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jordi
 */
public interface EstudiantesDao extends JpaRepository <Estudiantes,Long>{
    
}