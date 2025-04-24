/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part_2;

/**
 *Student name: Onkemetse Mangwegape
 * Student number: ST10471814
 */
public class Part_2 {

    public static void main(String[] args) {
         Registration registration = new Registration();
        Login login = new Login(registration);
       login.setVisible(true);
        
    }
}
