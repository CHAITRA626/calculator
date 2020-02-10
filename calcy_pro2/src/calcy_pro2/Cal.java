package calcy_pro2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class Cal {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextArea textarea = new JTextArea(2,10);

JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
JButton button5 = new JButton();
JButton button6 = new JButton();
JButton button7 = new JButton();
JButton button8 = new JButton();
JButton button9 = new JButton();
JButton button0 = new JButton();

JButton buttonadd = new JButton();
JButton buttonsub = new JButton();
JButton buttonmul = new JButton();
JButton buttondiv = new JButton();
JButton buttonclear = new JButton();
JButton buttondot = new JButton();
JButton buttonequal = new JButton();

double num1,num2,res;
int add=0,mul=0,div=0,sub=0;

public Cal() implements ActionListener {
frame.setSize(340,450);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.setTitle("Tech Talk Tricks");

//frame.setResizable(false);
frame.add(panel);
panel.setBackground(Color.LIGHT_GRAY);
Border border = BorderFactory.createLineBorder(Color.RED,4);

panel.add(textarea);

textarea.setBackground(Color.BLACK);
Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
textarea.setBorder(tborder);
Font font = new Font("arial",Font.BOLD,33);
textarea.setFont(font);
textarea.setForeground(Color.WHITE);

textarea.setPreferredSize(new Dimension(2,10));
textarea.setLineWrap(true);

button1.setPreferredSize(new Dimension(100,40));
button1.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\button1.png"));

button2.setPreferredSize(new Dimension(100,40));
button2.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\button2.png"));

button3.setPreferredSize(new Dimension(100,40));
button3.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\button3.png"));

button4.setPreferredSize(new Dimension(100,40));
button4.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\button4.png"));

button5.setPreferredSize(new Dimension(100,40));
button5.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\button5.png"));

button6.setPreferredSize(new Dimension(100,40));
button6.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\button6.png"));

button7.setPreferredSize(new Dimension(100,40));
button7.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\button7.png"));

button8.setPreferredSize(new Dimension(100,40));
button8.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\button8.png"));

button9.setPreferredSize(new Dimension(100,40));
button9.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\button9.png"));

button0.setPreferredSize(new Dimension(100,40));
button0.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\button0.png"));

buttondot.setPreferredSize(new Dimension(100,40));
buttondot.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\buttondot.png"));

buttonmul.setPreferredSize(new Dimension(100,40));
buttonmul.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\buttonmul.png"));

buttondiv.setPreferredSize(new Dimension(100,40));
buttondiv.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\buttondiv.png"));

buttonsub.setPreferredSize(new Dimension(100,40));
buttonsub.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\buttonsub.png"));

buttonadd.setPreferredSize(new Dimension(100,40));
buttonadd.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\buttonadd.png"));

buttonequal.setPreferredSize(new Dimension(100,40));
buttonequal.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\buttonequal.png"));

buttonclear.setPreferredSize(new Dimension(100,40));
buttonclear.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Number Icon\\buttonclear.png"));

panel.add(button1);
panel.add(button2);
panel.add(button3);
panel.add(button4);
panel.add(button5);
panel.add(button6);
panel.add(button7);
panel.add(button8);
panel.add(button9);
panel.add(button0);
panel.add(buttondot);
panel.add(buttonmul);
panel.add(buttondiv);
panel.add(buttonadd);
panel.add(buttonsub);
panel.add(buttonequal);
panel.add(buttonclear);

button1.addActionListener((ActionListener) this);
button2.addActionListener((ActionListener) this);
button3.addActionListener((ActionListener) this);
button4.addActionListener((ActionListener) this);
button5.addActionListener((ActionListener) this);
button6.addActionListener((ActionListener) this);
button7.addActionListener((ActionListener) this);
button8.addActionListener((ActionListener) this);
button9.addActionListener((ActionListener) this);
button0.addActionListener((ActionListener) this);
buttondot.addActionListener((ActionListener) this);
buttonmul.addActionListener((ActionListener) this);
buttondiv.addActionListener((ActionListener) this);
buttonadd.addActionListener((ActionListener) this);
buttonsub.addActionListener((ActionListener) this);
buttonequal.addActionListener((ActionListener) this);
buttonclear.addActionListener((ActionListener) this);





}

public void actionPerformed(ActionEvent e){
Object source = new e.getSource();
if(source==buttonclear){
num1=0.0;
num2=0.0;
textarea.setText("");
}
if(source==button1){
textarea.append("1");
}
if(source==button2){
textarea.append("2");
}
if(source==button3){
textarea.append("3");
}
if(source==button4){
textarea.append("4");
}
if(source==button5){
textarea.append("5");
}
if(source==button6){
textarea.append("6");
}
if(source==button7){
textarea.append("7");
}
if(source==button8){
textarea.append("8");
}
if(source==button9){
textarea.append("9");
}
if(source==button0){
textarea.append("0");
}
if(source==buttondot){
textarea.append(".");
}
if(source==buttonadd){
num1=number_reader();
textarea.setText("+");
add=1;
div=0;
sub=0;
mul=0;
}
if(source==buttonsub){
num1=number_reader();
textarea.setText("-");
add=0;
div=0;
sub=1;
mul=0;
}
if(source==buttonmul){
num1=number_reader();
textarea.setText("*");
add=0;
div=0;
sub=0;
mul=1;
}
if(source==buttondiv){
num1=number_reader();
textarea.setText("/");
add=0;
div=1;
sub=0;
mul=0;
}
if(source==buttonequal){
num2=number_reader();
if(add>0){
res=num1+num2;
textarea.setText(Double.toString(res));
}
if(sub>0){
res=num1-num2;
textarea.setText(Double.toString(res));
}
if(mul>0){
res=num1*num2;
textarea.setText(Double.toString(res));
}
if(div>0){
res=num1/num2;
textarea.setText(Double.toString(res));
}
}

}
public double number_reader(){
double n1;
string s;
s=textarea.getText();
n1=Double.valueOf(s);
return n1;
}
}

