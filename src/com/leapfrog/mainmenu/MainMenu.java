/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mainmenu;

import com.leapfrog.departmentcontroller.DepartmentController;
import com.leapfrog.departmentdaoimpl.DepartmentDAOImpl;
import com.leapfrog.employeecontroller.EmployeeController;
import com.leapfrog.employeedaoimpl.EmployeeDAOImpl;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MainMenu {

    public void mainMenu() {
        System.out.println("1.Department");
        System.out.println("2.Employee");
        System.out.println("3.exit");
        System.out.println("4.Enter your choice[1-3]");
        DepartmentController dc = new DepartmentController(new DepartmentDAOImpl(), new Scanner(System.in), new MainMenu());
        EmployeeController ec=new EmployeeController(new EmployeeDAOImpl(),new Scanner(System.in),new MainMenu());
        Scanner input = new Scanner(System.in);

        while (true) {

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    dc.departmentProcess();
                    break;
                case 2:
                    ec.employeeProcess();
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }
    }
}
