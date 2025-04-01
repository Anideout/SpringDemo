package duoc.database.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import duoc.database.api.model.Vehiculo;
import duoc.database.api.repository.VehiculoRepository;

@RestController
@RequestMapping("/Vehiculo")
public class VehiculoController {

    //inyeccion de dependencias
    @Autowired
    private VehiculoRepository vehiculoRepository;

    @GetMapping
    public List<Vehiculo> obtenerVehiculos() {
    // SELECT * FROM VEHICULO;

    return vehiculoRepository.findAll();
    }

    
}
