/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.departmentcontroller;

import com.leapfrog.department.dao.DepartmentDAO;
import com.leapfrog.department.entity.Department;
import com.leapfrog.main.Program;
import com.leapfrog.mainmenu.MainMenu;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class DepartmentController {

    DepartmentDAO departmentdao;
    Scanner input;
    MainMenu mainmenu;

    public DepartmentController(DepartmentDAO departmentdao, Scanner input, MainMenu mainmenu) {
        this.departmentdao = departmentdao;
        this.input = input;
        this.mainmenu = mainmenu;
    }

    void Departmentmenu() {
        System.out.println("1.Add Department");
        System.out.println("2.show all");
        System.out.println("3.search by id");
        System.out.println("4.deleted department");
        System.out.println("5.Back");
        System.out.println("6.exit");
        System.out.println("Enter your choice[1-5]");
    }

    void add() {
        while (true) {
            Department d = new Department();
            System.out.println("Enter department id");
            d.setId(input.nextInt());
            System.out.println("Enter department name");
            d.setName(input.next());
            System.out.println("Enter department address");
            d.setAddress(input.next());
            System.out.println("Enter department contact");
            d.setContact(input.next());
            System.out.println("Enter department email");
            d.setEmail(input.next());
            System.out.println("Enter department status");
            d.setStatus(input.nextBoolean());
            departmentdao.insert(d);
            System.out.println("Do you want to add more?[y/n]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    void showall() {

        System.out.println("show all");
        for (Department d : departmentdao.getAll()) {
            System.out.println(d.toString());

        }

    }

    void search() {
        while (true) {
            System.out.println("Enter id to search");
            int id = input.nextInt();
            Department dept = departmentdao.getById(id);
            if (dept != null) {
                System.out.println(dept.toString());
            }

            System.out.println("Do you want to search more [y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    void delete() {
        while (true) {
            System.out.println("Enter department id to delete");
            int id = input.nextInt();
            departmentdao.delete(id);
            System.out.println("Do you want to delete more?[y/n]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }

        }
    }

    void back() {

        mainmenu.mainMenu();

    }

    public void departmentProcess() {
        while (true) {
            Departmentmenu();
            switch (input.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    showall();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    delete();
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
