package com.villazon.apihorariomed.service;


import com.villazon.apihorariomed.model.Schedule;
import com.villazon.apihorariomed.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository repository;

    public ScheduleServiceImpl(ScheduleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Schedule> listar() {
        return repository.findAll();
    }

    @Override
    public Schedule guardar(Schedule schedule) {
        return repository.save(schedule);
    }

    @Override
    public Schedule buscarPorId(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Registro no encontrado con ID: " + id));
    }

    @Override
    public Schedule actualizar(Integer id, Schedule schedule) {

        Schedule existente = buscarPorId(id);

        existente.setNombre(schedule.getNombre());
        existente.setDosis(schedule.getDosis());
        existente.setHora(schedule.getHora());
        existente.setFrecuencia(schedule.getFrecuencia());
        existente.setNotas(schedule.getNotas());
        existente.setActivo(schedule.getActivo());

        return repository.save(existente);
    }

    @Override
    public void eliminar(Integer id) {
        Schedule existente = buscarPorId(id);
        repository.delete(existente);
    }
}
