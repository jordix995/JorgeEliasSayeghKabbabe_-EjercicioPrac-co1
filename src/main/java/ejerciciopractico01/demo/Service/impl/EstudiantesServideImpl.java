/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico01.demo.Service.impl;

/**
 *
 * @author jordi
 */
import ejerciciopractico01.demo.Domain.Estudiantes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ejerciciopractico01.demo.DAO.EstudiantesDao;
import ejerciciopractico01.demo.Service.EstudiantesService;

@Service
public class EstudiantesServideImpl implements EstudiantesService {

     @Autowired
    private EstudiantesDao estudiantesDao;

    @Override
    @Transactional(readOnly = true)
    public List<Estudiantes> getEstudiantes(boolean activos) {
        var lista = estudiantesDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Estudiantes getEstudiantes(Estudiantes Estudiantes) {
        return estudiantesDao.findById(Estudiantes.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Estudiantes categoria) {
        estudiantesDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Estudiantes categoria) {
        estudiantesDao.delete(categoria);
    }
    
}
