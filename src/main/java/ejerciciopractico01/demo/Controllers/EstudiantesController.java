/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico01.demo.Controllers;

/**
 *
 * @author Jordi
 */
import ejerciciopractico01.demo.Domain.Estudiantes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ejerciciopractico01.demo.Service.EstudiantesService;
@Controller
@Slf4j
@RequestMapping("/estudiantes")
public class EstudiantesController {

    @Autowired
    private EstudiantesService EstudiantesService;
    @GetMapping("/listado")
    public String inicio(Model model) {
        var estudiantes = EstudiantesService.getEstudiantes(false);
        model.addAttribute("estudiantes", estudiantes);
        model.addAttribute("totalestudiantes", estudiantes.size());
        return "/estudiantes/listado";
        }
    @GetMapping("/nuevo")
    public String EstudiantesNuevo(Estudiantes estudiantes) {
        return "/estudiantes/modifica";
    }

}