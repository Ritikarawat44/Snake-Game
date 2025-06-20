/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snake;

/**
 *
 * @author ritik
 */
import javax.swing.*;
public class Snake extends JFrame {
       Snake(){
           super("Snake Game");// it also help to make a  visible a namein frame
           add( new Board());
           pack();// for reloading page to see changes 
           
           setLocationRelativeTo(null);//for open in center
           setResizable(false);
           
       }
    public static void main(String[] args) {
         new Snake().setVisible(true); 
    }

   
    
}
