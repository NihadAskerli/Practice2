/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MenuUtil {

    public static void showMenu() {
        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose menu");
        int selectedMenuNumber=sc.nextInt();
    Menu selectedMenu=Menu.find(selectedMenuNumber);
    selectedMenu.process();
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }
}
