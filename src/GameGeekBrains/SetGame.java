package GameGeekBrains;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.SliderUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetGame extends JFrame {
    //рфзмеры окна
    private static final int widhtWindow = 60;
    private static final int heightWindow = 200;
    //место положение окна(координаты)
    private static final int minSizePole = 3;
    private static final int maxSizePole = 10;
    private static final int minSizeToWin = 3;
    private static final String FieldSizePrefix = "Field size is";
    private static final String WinLenghtPrefix = "Win size is";
    private GameWindow gameWindow;
    private JRadioButton humVSai;
    private JRadioButton humVShum;
    private JSlider slideWinlen;
    private JSlider slideFieldSize;
    //конструктор окна
    SetGame(GameWindow gameWindow){
        setSize(widhtWindow,heightWindow);
        this.gameWindow = gameWindow;
        Rectangle gameWindowBounds = gameWindow.getBounds();
        int posX = (int)gameWindowBounds.getCenterX() - heightWindow/2;
        int posY = (int)gameWindowBounds.getCenterY() - widhtWindow/2;
        setLocation(posX,posY);
        setResizable(false);
        setTitle("Creat new game");
        setLayout(new GridLayout(10,1));// создаем 10 строк и один столбец
        addGameModeConrtol();// вызываем метод создания кнопок
        addFieldControls();
        JButton goGame = new JButton("Star the game");//кнопка запуска игры
        goGame.addActionListener(new ActionListener() { //отправляет в метод который собирает все параметры
            @Override
            public void actionPerformed(ActionEvent e) {
                collectAllParametrs();

            }
        });
        add(goGame);
    }
    private void addGameModeConrtol(){ //создаем кнопки типа (.)
        add(new JLabel("Choose game mode:"));
        humVSai = new JRadioButton("Humah VS AI");
        humVShum = new JRadioButton("Human VS Human");
        ButtonGroup gameMode = new ButtonGroup();//создаем групп чтобы вибиралась только одна из кнопок ()(.)
        gameMode.add(humVSai);
        gameMode.add(humVShum);
        add(humVSai);//добавляем кнопки
        add(humVShum);
    }
    private void addFieldControls(){//делаем слайдеры
        JLabel lbFildLenghtPole = new JLabel(FieldSizePrefix + minSizePole);
        JLabel lbFieltoWinSize = new JLabel(WinLenghtPrefix + minSizeToWin);
        slideFieldSize = new JSlider(minSizePole, maxSizePole,minSizePole);//устанавливает размеры поля, но не больше выигрошной длинны
        slideWinlen = new JSlider(minSizeToWin,minSizePole, minSizePole);//устанавливает значение для победы но не больше поля

        slideFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = slideFieldSize.getValue();
                lbFildLenghtPole.setText(FieldSizePrefix + currentValue);
                slideWinlen.setMaximum(currentValue);

            }
        });
        slideWinlen.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lbFieltoWinSize.setText(WinLenghtPrefix + slideWinlen.getValue());//берет значение победы со слайдера

            }
        });

        add(new JLabel("Choose size pole"));
        add(lbFildLenghtPole);
        add(slideFieldSize);
        add(new JLabel("Choose size ti win"));
        add(lbFieltoWinSize);
        add(slideWinlen);
    }
    private void collectAllParametrs(){
        int gameMode;
        if (humVSai.isSelected()){
            gameMode = Map.modeHVA;
        }else if(humVShum.isSelected()){
            gameMode = Map.modeHVH;
        }else {
            throw new RuntimeException("Unexpected game mode!");
        }
        int fieldSize = slideFieldSize.getValue();
        int winLen = slideWinlen.getValue();
        gameWindow.acceptSettings(gameMode, fieldSize, fieldSize, winLen);// Вызывает метод чтобы запустить игру


        setVisible(false);
    }
}
