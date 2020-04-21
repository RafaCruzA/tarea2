package com.uca.capas.tarea2.controller;
import java.time.LocalDate;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
	
	@RequestMapping("/estudiante")
	public @ResponseBody String estudiante() {
		String nombre = "Rafael Enrique ";
		String apellido = "Cruz Aparicio ";
		String carnet = "00004315 ";
		String carrera = "Ingeniería Informática ";
		String anio = "4° año";
		
		return "Estudiante - Nombres: " + nombre + "| Apellidos: " + apellido + "| Carnet: " + carnet + "| Carrera: " + carrera + "| Año cursado: " + anio;
	}
	
	
	@RequestMapping("/dia")
	public @ResponseBody String dia(HttpServletRequest request){
		Integer dia = Integer.parseInt(request.getParameter("dia"));
		Integer mes = Integer.parseInt(request.getParameter("mes"));
		Integer anio = Integer.parseInt(request.getParameter("anio"));
		
		LocalDate fecha = LocalDate.of(anio, mes, dia);
		
		String diaSemana;
		
		switch(fecha.getDayOfWeek()){
		case MONDAY: diaSemana = "Lunes";
		break;
		case TUESDAY: diaSemana = "Martes";
		break;
		case WEDNESDAY: diaSemana= "Miercoles";
		break;
		case THURSDAY: diaSemana = "Jueves";
		break;
		case FRIDAY: diaSemana = "Viernes";
		break;
		case SATURDAY: diaSemana = "Sabado";
		break;
		case SUNDAY: diaSemana = "Domingo";
		break;
		default: diaSemana = "Ningun dia seleccionado";
		break;
		}
		
		return diaSemana;
	}
			
}
