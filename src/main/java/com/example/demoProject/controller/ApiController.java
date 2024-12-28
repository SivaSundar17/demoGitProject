package com.example.demoProject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoProject.model.Employee;

@RestController
@RequestMapping("/bfhl")
public class ApiController {

	List<Employee> empList = new ArrayList<Employee>();
	
    @GetMapping("/{index}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int index, @RequestBody Employee emp) {

    	empList.add(emp);
        return ResponseEntity.ok(empList.get(index));
    }
    
    @GetMapping()
    public ResponseEntity<List<Employee>> getEmployees() {

        return ResponseEntity.ok(empList);
    }
    
    

    @PostMapping
    public ResponseEntity<Employee> saveEmp(@RequestBody Employee emp) {
    	empList.add(emp);
        return ResponseEntity.ok(emp);
    }
    
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deleteEmp(@PathVariable int id){
//    	return ResponseEntity.ok("Deleted emp");
//    }

    
}
