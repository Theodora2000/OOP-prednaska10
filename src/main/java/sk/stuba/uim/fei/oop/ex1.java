package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex1 extends JFrame implements ActionListener {

    Panel button_panel;

    Button crosshair_c;
    Button wait_c;
    Button custom_c;
    Button text_c;
    Button hand_c;

    Cursor panel_cursor;
    Cursor frame_cursor;

    public ex1(){

        super("Cursor Frame");
        setLayout(new BorderLayout());
        setSize(700,400);

        button_panel = new Panel();

        crosshair_c = new Button("CROSSHAIR_CURSOR");
        wait_c = new Button("WAIT_CURSOR");
        custom_c = new Button("CUSTOM_CURSOR");
        text_c = new Button("TEXT_CURSOR");
        hand_c = new Button("HAND_CURSOR");

        crosshair_c.addActionListener(this);
        wait_c.addActionListener(this);
        custom_c.addActionListener(this);
        text_c.addActionListener(this);
        hand_c.addActionListener(this);

        button_panel.add(crosshair_c);
        button_panel.add(wait_c);
        button_panel.add(custom_c);
        button_panel.add(text_c);
        button_panel.add(hand_c);

        panel_cursor = new Cursor(Cursor.DEFAULT_CURSOR);
        frame_cursor = new Cursor(Cursor.DEFAULT_CURSOR);

        button_panel.setCursor(panel_cursor);
        this.setCursor(frame_cursor);
        add("North", button_panel);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == crosshair_c){
            frame_cursor = new Cursor(Cursor.CROSSHAIR_CURSOR);
            this.setCursor(frame_cursor);
        }
        if(e.getSource() == wait_c){
            frame_cursor = new Cursor(Cursor.WAIT_CURSOR);
            this.setCursor(frame_cursor);
        }
        if(e.getSource() == custom_c){
           // Point size = new Point(getToolkit().getBestCursorSize(30,30).width/2,getToolkit().getBestCursorSize(30,30).height/2);
            Point size = new Point(15,15);
            frame_cursor = getToolkit().createCustomCursor(getToolkit().getImage("mycursor.gif"), size, "My cursor");
        }
        if(e.getSource() == text_c){
            frame_cursor = new Cursor(Cursor.TEXT_CURSOR);
            this.setCursor(frame_cursor);
        }
        if(e.getSource() == hand_c){
            frame_cursor = new Cursor(Cursor.HAND_CURSOR);
            this.setCursor(frame_cursor);
        }
    }
}


