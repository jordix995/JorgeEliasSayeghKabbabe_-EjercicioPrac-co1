/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico01.demo.Service;

import ejerciciopractico01.demo.Domain.Estudiantes;
import java.util.List;

/**
 *
 * @author Jordi
 */
public interface EstudiantesService {
    public List<Estudiantes> getEstudiantes(boolean activos);
    // Se obtiene un Estudiantes, a partir del id de un categoria
    public Estudiantes getEstudiantes(Estudiantes estudiantes);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Estudiantes estudiantes);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Estudiantes estudiantes);
}
