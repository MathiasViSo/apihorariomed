package com.villazon.apihorariomed.service;

import com.villazon.apihorariomed.model.Schedule;

import java.util.List;

public interface ScheduleService {

    List<Schedule> listar();

    Schedule guardar(Schedule schedule);

    Schedule buscarPorId(Integer id);

    Schedule actualizar(Integer id, Schedule schedule);

    void eliminar(Integer id);
}
