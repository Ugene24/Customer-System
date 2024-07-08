/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

public class tables {
    public static void main(String[] args) {
        try {
            String userTable = "CREATE TABLE user ("
                             + "id INT AUTO_INCREMENT PRIMARY KEY, "
                             + "name VARCHAR(200), "
                             + "email VARCHAR(200) UNIQUE, "
                             + "password VARCHAR(200), "
                             + "mobilenumber VARCHAR(10), "
                             + "productbought VARCHAR(200), "
                             + "amount VARCHAR(200), "
                             + "status VARCHAR(20))";
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
