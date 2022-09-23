/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import java.util.Scanner;
import service.inter.menu.MenuAddTeacherServiceInter;

/**
 *
 * @author ASUS
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter {

    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teacher name");
        String teachername = sc.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Teacher surname");
        String teachersurname = sc2.nextLine();
        Teacher t = new Teacher();
        t.setName(teachername);
        t.setSurname(teachersurname);
        Config.instance().appendTeacher(t);
        System.out.println("teacher added");
        
    }

}
