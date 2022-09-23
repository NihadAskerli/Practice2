/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import bean.Config;
import service.menu.MenuLoginService;
import service.menu.MenuRegisterService;
import service.menu.MenuAddStudentService;
import service.menu.MenuAddTeacherService;
import service.menu.MenuShowStudentService;
import service.menu.MenuShowTeacherService;
import service.inter.Process;

/**
 *
 * @author ASUS
 */
 public enum Menu {

    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add teacher", new MenuAddTeacherService()),
    ADD_STUDNET(4, "Add student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5, "Show all teacher", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6, "Show all student", new MenuShowStudentService()),
    UNKNOWN;
    private String label;
    private Process service;
    private int number;

    Menu() {

    }

    Menu(int number, String label, Process service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number+"."+label;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                if(menus[i]==LOGIN ||menus[i]==REGISTER){
                    if(!Config.isLoggedin()){
                System.out.println(menus[i]);
            }
                }else if(Config.isLoggedin()){
                System.out.println(menus[i]);
            }
        }
    }
}
 }