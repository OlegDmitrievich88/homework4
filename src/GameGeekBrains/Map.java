package GameGeekBrains;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    public static final int modeHVH = 0;
    public static final int modeHVA = 1;

   public Map(){ //конструктор карты
       // startNewGame();
        setBackground(Color.green);


    }
    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength){

    }
    @Override
    public void paintComponent(Graphics graphics){
        graphics.setColor(Color.red);
        graphics.drawLine(4,3,7,8);
    }


}
