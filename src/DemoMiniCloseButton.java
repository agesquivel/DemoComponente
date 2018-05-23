import javax.swing.*;
import java.awt.*;

public class DemoMiniCloseButton extends JFrame {

    public DemoMiniCloseButton() {
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MiniCloseButton boton =  new MiniCloseButton();
        Container pnlPrincipal = this.getContentPane();
        pnlPrincipal.add(boton, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public static void main(String[] args){
        DemoMiniCloseButton Ventana = new DemoMiniCloseButton();

    }
}

