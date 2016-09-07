/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.department.dao;

import com.leapfrog.department.entity.Department;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface DepartmentDAO {
    boolean insert(Department d);
    List<Department> getAll();
    boolean delete(int d);
    Department getById(int id);
   
}
