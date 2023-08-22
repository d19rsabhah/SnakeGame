/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snakegame;

import javax.swing.*;

/**
 *
 * @author rishav
 */
public class SnakeGame extends JFrame {

    SnakeGame() {
        // setLocation(100, 100);
        super("Snake Game");
        add(new Board());
        pack();

        setLocationRelativeTo(null);
        setResizable(false);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        new SnakeGame().setVisible(true);

    }

}
