package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainFrame extends JFrame{

    JPanel mainPanel;

public MainFrame(){
    setComponent();
    setMainPanel();
    setMainFrame();
    
}

private void setComponent(){

}

private void setMainPanel(){
    this.mainPanel = new JPanel(); 
    this.mainPanel.setLayout(new BorderLayout());
}

private void setMainFrame(){
    this.setLayout(new FlowLayout());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400,300);
    this.setVisible(true);
}
}