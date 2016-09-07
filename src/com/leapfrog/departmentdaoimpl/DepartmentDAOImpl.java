/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.departmentdaoimpl;

import com.leapfrog.department.dao.DepartmentDAO;
import com.leapfrog.department.entity.Department;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class DepartmentDAOImpl implements DepartmentDAO{
    List<Department> departmentList=new ArrayList<Department>();
    @Override
    public boolean insert(Department d) {
        return departmentList.add(d);
        
    }

    @Override
    public List<Department> getAll() {
       return departmentList;
    }

    @Override
    public boolean delete(int id) {
        for(Department d:departmentList){
            if(d.getId()==id){
               return departmentList.remove(d);
            }
        }
        return false;
    }

    @Override
    public Department getById(int id) {
        
        for(Department d:departmentList){
            if(d.getId()==id){
                return  d;
            }
        }
        return null;
    }
    


   
 
    
}
