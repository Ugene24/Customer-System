/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

    import Model.User;

    public class Userdao {
        public static void save(User user){
        String query = "insert into user(name,email,password,mobilenumber,productbought,amount,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getPassword()+"','"+user.getMobilenumber()+"','"+user.getSecurityquestion()+"','"+user.getAnswer()+"','false')";
        DbOperations.setDataOrDelete( query, "Registered Sucessfully, wait a bit");

        }
        
    }
