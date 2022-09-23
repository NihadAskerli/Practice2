/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import java.util.Scanner;
import service.inter.menu.MenuLoginServiceInter;

/**
 *
 * @author ASUS
 */
public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void processLogic() {
       Scanner sc =new Scanner(System.in);
        System.out.println("username");
        String username=sc.nextLine();
        Scanner sc2=new Scanner(System.in);
        System.out.println("pasword");
        String pasword=sc2.nextLine();
        if(!(username.equals("niko")&&pasword.equals("niko123"))){
        throw new IllegalArgumentException("eror parol and user");
        }
         Config.setLoggedin(true);
    }
    
}
