package GameGeekBrains;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.*;

public class GameWindow extends JFrame {   //JFrame всякие оконные штуки
    private static final int win_widht = 400; //ширина окна
    private static final int win_height = 400; //высота окна
    private static final int win_X = 400; // координаты местоположения окна по оси х
    private static final int win_y = 150; // координаты местоположения по оси у
    private Map map;
    GameWindow(){ //коструктор окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //при нажатии на крестик закрывает программу и другие магичиские константы
        setSize(win_widht, win_height); //размер окна
        setLocation(win_X, win_y); //setLocationRelativeTo(null); местоположения окна относительно раб.стола
        setTitle("TicTacToe"); //Заголовок
        //setResizable(false); //Запрещает или разрешает изменение размеров окна
        JButton butStart = new JButton("Start"); // создали кнопку
        //button.setPreferredSize(new Dimension(0,100));//размеры кнопки
       // add(button, BorderLayout.NORTH); //add() добавили кнопку, BorderLayout координаты размещения
        JButton butStop = new JButton("Stop");
        JPanel panelButton = new JPanel();// создаем новую панель
        panelButton.setLayout(new GridLayout(1,2));// добавляем в панель лайаут(Gridlayout добавляет строки и столбцы)
        panelButton.add(butStart);
        panelButton.add(butStop);
        map = new Map();// создали мап
        SetGame setting = new SetGame(this);
        butStart.addActionListener(new ActionListener() { // определяет действие кнопки
            @Override
            public void actionPerformed(ActionEvent e) {
                setting.setVisible(true);
            }
        });
        butStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); //выходит из программы
            }
        });
        add(panelButton, BorderLayout.NORTH);
        add(map); //добавили мап
        setVisible(true);  //видемость окна
    }


    public void acceptSettings(int gameMode, int fieldSizeX, int fieldSizeY, int winLen) {
        map.startNewGame(gameMode, fieldSizeX, fieldSizeY, winLen);
    }
}
