package com.example.project3.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project3.models.Empleado;
import com.example.project3.services.EmpleadoService;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    // Obtener todos los empleados
    @GetMapping
    public List<Empleado> obtenerEmpleados() {
        return empleadoService.obtenerTodos();
    }

    // Obtener empleado por ID
    @GetMapping("/{id}")
    public ResponseEntity<Empleado> obtenerEmpleadoPorId(@PathVariable Long id) {
        return empleadoService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Crear un nuevo empleado
    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.crearEmpleado(empleado);
    }

    // Actualizar un empleado existente
    @PutMapping("/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado detallesEmpleado) {
        return empleadoService.obtenerPorId(id)
                .map(empleado -> {
                    empleado.setNombre(detallesEmpleado.getNombre());
                    empleado.setEmail(detallesEmpleado.getEmail());
                    empleado.setPuesto(detallesEmpleado.getPuesto());
                    empleado.setSalario(detallesEmpleado.getSalario());
                    empleado.setFechaContratacion(detallesEmpleado.getFechaContratacion());
                    return ResponseEntity.ok(empleadoService.actualizarEmpleado(empleado));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Eliminar un empleado
@DeleteMapping("/{id}")
public ResponseEntity<Void> eliminarEmpleado(@PathVariable Long id) {
    Optional<Empleado> empleado = empleadoService.obtenerPorId(id);
    
    if (empleado.isPresent()) {
        empleadoService.eliminarEmpleado(id);
        return ResponseEntity.ok().build();  // Devuelve 200 No Content si se elimina correctamente
    } else {
        return ResponseEntity.notFound().build();  // Devuelve 404 si no encuentra el empleado
    }
}
}
