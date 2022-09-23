/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.inter.menu.MenuAddStudentServiceInter;

/**
 *
 * @author ASUS
 */
public class MenuAddStudentService implements MenuAddStudentServiceInter {

    @Override
    public void processLogic() {
  Scanner sc=new Scanner(System.in);
        System.out.println("Sutdent name");
        String studentname=sc.nextLine();
        Scanner sc2=new Scanner(System.in);
        System.out.println("Student surname");
        String studentsurname=sc2.nextLine();
        Student s=new Student();
        s.setName(studentname);
        s.setSurname(studentsurname);
        Config.instance().appendStudent(s);
        System.out.println("student added");

    }
    
}
