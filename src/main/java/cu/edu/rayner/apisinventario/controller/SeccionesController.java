package cu.edu.rayner.apisinventario.controller;

import cu.edu.rayner.apisinventario.dto.SeccionesDto;
import cu.edu.rayner.apisinventario.service.SeccionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/secciones")
public class SeccionesController {
    @Autowired
    private SeccionesService seccionesService;

    @PostMapping("/")
    private ResponseEntity<?> insertar_secciones(@RequestBody SeccionesDto seccionesDto){
        try {
            seccionesDto.setIdentificador(UUID.randomUUID());
            seccionesService.insertar_seccion(seccionesDto);
            return ResponseEntity.ok("Secciòn insertada");
        }catch (Exception e){
            if (e.getMessage().trim().equalsIgnoreCase("El identificador ya se ha insertado") == true)
                return insertar_secciones(seccionesDto);
            else
                return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/")
    private ResponseEntity<?> modificar_secciones(@RequestBody SeccionesDto seccionesDto){
        try {
            seccionesService.modificar_seccion(seccionesDto);
            return ResponseEntity.ok("Secciòn modificada");
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/")
    private ResponseEntity<?> eliminar_secciones(@RequestBody SeccionesDto seccionesDto){
        try {
            seccionesService.eliminar_seccion(seccionesDto);
            return ResponseEntity.ok("Secciòn eliminada");
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/")
    private ResponseEntity<?> listado_secciones(){
        try {
            return ResponseEntity.ok(seccionesService.listado_secciones());
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
