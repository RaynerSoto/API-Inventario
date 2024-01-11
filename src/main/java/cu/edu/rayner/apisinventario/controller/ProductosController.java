package cu.edu.rayner.apisinventario.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import cu.edu.rayner.apisinventario.dto.EquipamientoDto;
import cu.edu.rayner.apisinventario.dto.SeccionesDto;
import cu.edu.rayner.apisinventario.service.EquipamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductosController {


    @RestController
    @RequestMapping("/api/v1/productos/equipamientos")
    public class EquipamientoController{
        @Autowired
        private EquipamientoService equipamientoService;
        @PostMapping("/")
        private ResponseEntity<?> insertar_equipamiento(@RequestBody EquipamientoDto equipamientoDto){
            try {
                equipamientoService.insertar_equipamiento(equipamientoDto);
                return ResponseEntity.ok("Equipamiento insertado");
            }catch (Exception e){
                return ResponseEntity.badRequest().body(e.getMessage());
            }
        }

        @PutMapping("/")
        private ResponseEntity<?> modificar_equipamiento(@RequestBody EquipamientoDto equipamientoDto){
            try {
                equipamientoService.modificar_equipamiento(equipamientoDto);
                return ResponseEntity.ok("Equipamiento modficicado");
            }catch (Exception e){
                return ResponseEntity.badRequest().body(e.getMessage());
            }
        }

        @DeleteMapping("/")
        private ResponseEntity<?> eliminar_equipamiento(@PathVariable Long equipamientoDto){
            try {
                equipamientoService.eliminar_equipamiento(equipamientoDto);
                return ResponseEntity.ok("Equipamiento eliminado");
            }catch (Exception e){
                return ResponseEntity.badRequest().body(e.getMessage());
            }
        }

        @GetMapping("/")
        private ResponseEntity<?> listado_productos_equipamientos(){
            try {
                return ResponseEntity.ok(equipamientoService.listado_equipamientos());
            }catch (Exception e){
                return ResponseEntity.badRequest().body(e.getMessage());
            }
        }
    }

}
