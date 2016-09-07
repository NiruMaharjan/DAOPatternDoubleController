/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.employeecontroller;

import com.leapfrog.department.employee.entity.Employee;
import com.leapfrog.employeedao.EmployeeDAO;
import com.leapfrog.mainmenu.MainMenu;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class EmployeeController {

    EmployeeDAO employeeDao;
    Scanner input;
    MainMenu mainMenu;

    public EmployeeController() {
    }

    public EmployeeController(EmployeeDAO employeeDao, Scanner input, MainMenu mainMenu) {
        this.employeeDao = employeeDao;
        this.input = input;
        this.mainMenu = mainMenu;
    }

    void employeeMenu() {
        System.out.println("1.Add Employee");
        System.out.println("2.List all Employees");
        System.out.println("3.Delete Employee");
        System.out.println("4.Search employee by id");
        System.out.println("5.Back");
        System.out.println("6.Exit");
        System.out.println("Enter your choice [1-6]");
    }

    void add() {
        while (true) {
            Employee emp = new Employee();
            System.out.println("Enter employee id");
            emp.setId(input.nextInt());
            System.out.println("Enter employee name");
            emp.setName(input.next());
            System.out.println("Enter employee address");
            emp.setAddres(input.next());
            System.out.println("Enter employee contact no");
            emp.setContact(input.next());
            System.out.println("Enter employee status");
            emp.setStatus(input.nextBoolean());
            employeeDao.insert(emp);
            System.out.println("Do you want to add more employees?[y/n]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    void show() {
        System.out.println("Listing all employees");
        for (Employee e : employeeDao.getAll()) {
            System.out.println(e.toString());

        }

    }

    void delete() {
        while (true) {
            System.out.println("Enter id to delete");
            int id = input.nextInt();
            employeeDao.delete(id);
            System.out.println("Do you want to delete more?[y/n]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    void searchById() {
        while (true) {
            System.out.println("Enter id to search");
            int id = input.nextInt();
            Employee employee = employeeDao.getById(id);
            if (employee != null) {
                System.out.println(employee.toString());
            }
            System.out.println("Do you want to search more [y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }

        }
    }

    void back() {
        mainMenu.mainMenu();
    }

    public void employeeProcess() {

        while (true) {
            employeeMenu();
            switch (input.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    searchById();
                    break;
                case 5:
                    back();
                    break;
                case 6:
                    System.exit(0);
                    break;

            }
        }
    }

}
