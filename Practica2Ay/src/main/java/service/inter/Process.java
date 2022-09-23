/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.inter;

/**
 *
 * @author ASUS
 */
public interface Process {

    public abstract void processLogic();

    public default void process() {
        processLogic();

    }
}
