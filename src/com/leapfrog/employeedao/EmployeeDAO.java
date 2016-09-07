/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.employeedao;

import com.leapfrog.department.employee.entity.Employee;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface EmployeeDAO {
    
 boolean insert(Employee e);
 List<Employee> getAll();
  boolean delete(int id);
  Employee getById(int id);
    
}
