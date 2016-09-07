/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.employeedaoimpl;

import com.leapfrog.department.employee.entity.Employee;
import com.leapfrog.employeedao.EmployeeDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    List<Employee> empList = new ArrayList<>();

    @Override
    public boolean insert(Employee e) {
        return empList.add(e);
    }

    @Override
    public List<Employee> getAll() {
        return empList;
    }

    @Override
    public boolean delete(int id) {
        for (Employee e : empList) {
            if (e.getId() == id) {
               return empList.remove(e);
            }
        }
        return false;
    }

    @Override
    public Employee getById(int id) {
        for (Employee e : empList) {
            if (e.getId() == id) {
                return e;
            }

        }

        return null;
    }

}
