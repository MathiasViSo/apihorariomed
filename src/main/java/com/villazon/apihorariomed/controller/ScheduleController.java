package com.villazon.apihorariomed.controller;

import com.villazon.apihorariomed.model.Schedule;
import com.villazon.apihorariomed.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedules")
@CrossOrigin(origins = "*")
public class ScheduleController {

    private final ScheduleService service;

    public ScheduleController(ScheduleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Schedule> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Schedule obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Schedule crear(@RequestBody Schedule schedule) {
        return service.guardar(schedule);
    }

    @PutMapping("/{id}")
    public Schedule actualizar(@PathVariable Integer id,
                               @RequestBody Schedule schedule) {
        return service.actualizar(id, schedule);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
