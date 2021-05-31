import javax.swing.*;
import java.awt.event.ActionListener;

public class ViewModel extends JFrame{
    private JTextField time;
    private JPanel panel1;
    private JButton exitButton;
    private JButton score;
    private JList scoreList;
    private DefaultListModel listModel;

    ViewModel(){
        this.add(panel1);
        listModel = new DefaultListModel();
        scoreList.setModel(listModel);
        scoreList.setVisible(false);
        time.setEditable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setVisible(true);
    }
    void ExitButton(ActionListener actionListener){
        this.exitButton.addActionListener(actionListener);
    }
    public void setTime(long i){
        time.setText(String.valueOf(i));
    }

    public String getTime(){
        return time.getText();
    }

    public void scoreboard(User[] user){
        if (!scoreList.isVisible()){
            scoreList.setVisible(true);
            time.setVisible(false);
            exitButton.setVisible(false);
            score.setText("Exit scoreboard?");
            for (int i = 0; i < 10; i++){
                listModel.addElement(user[i].getName() + " " + user[i].getScore());
            }
        } else{
            scoreList.setVisible(false);
            time.setVisible(true);
            exitButton.setVisible(true);
            score.setText("Scoreboard");
        }
    }
    void topscore(ActionListener actionListener){
        this.score.addActionListener(actionListener);
    }
}