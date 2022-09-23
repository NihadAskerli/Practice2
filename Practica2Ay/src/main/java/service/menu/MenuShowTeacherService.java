/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import service.inter.menu.MenuAddTeacherServiceInter;

/**
 *
 * @author ASUS
 */
public class MenuShowTeacherService implements MenuAddTeacherServiceInter{

    @Override
    public void processLogic() {
       Teacher[] allteacher=Config.instance().getTeachers();
   for(int i=0;i<allteacher.length;i++){
       System.out.println(allteacher[i]);
   }
    }
    
}
