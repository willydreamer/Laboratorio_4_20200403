package com.example.lab4.controllers;

import com.example.lab4.entity.Employee;
import com.example.lab4.repository.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/empleados")
public class EmployeeController {
    final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping(value = {"","lista"})
    public String listaEmpleados (Model model){
        model.addAttribute("listaa", employeeRepository.findAll());
        return "home/employee/listaEmpleados";
    };

    @PostMapping("/buscar")
    public String buscarTransportista(@RequestParam("searchField") String searchField,
                                      Model model) {
        List<Employee> listaTransportistas = employeeRepository.buscarEmployeePorNombreyApellido(searchField);
        model.addAttribute("listaa", listaTransportistas);
        return "home/employee/listaEmpleados";
    }

    @GetMapping("/editar")
    public String editarJuegos(@RequestParam("id") int id, Model model){
        Optional<Employee> optional =employeeRepository.findById(id);
        if(optional.isPresent()){
            Employee employee = optional.get();
            model.addAttribute("employee",employee);
            return "home/employee/editEmployee";
        }else{
            return "redirect:/empleados/lista";
        }
    };
}
