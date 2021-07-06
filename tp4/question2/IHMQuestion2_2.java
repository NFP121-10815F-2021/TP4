package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_2 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");

    private TextArea contenu = new TextArea(30, 80);

 
    public IHMQuestion2_2() {
        super("IHM Question2_2");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); // contenu sera transmis aux observateurs, voir
                                // la description des constructeurs
        setLocation(150,150);pack();show();
        enHaut.setBackground(Color.magenta);
        

        boutonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				 new JButtonObserver("job1",contenu);
			}
		});
        boutonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new JButtonObserver("job2",contenu);
			}
		});
        boutonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new JButtonObserver("job3",contenu);
			}
		});		
        // le bouton B a 2 observateurs jbo1 et jbo2
        boutonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new JButtonObserver("job1",contenu);
			}
		});
        boutonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new JButtonObserver("job2",contenu);
			}
		});		
        // le bouton C a 1 observateur jbo1
        boutonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new JButtonObserver("job1",contenu);
			}
		});

        // à compléter pour la question 2_2 (JMouseObserver)
            boutonA.addMouseListener(new MouseAdapter() {
              

                @Override
                public void mousePressed(MouseEvent e) {
                 new JMouseObserver("jmo1", contenu);
                }

            });
            
            // le bouton B a 1 observateur jmo2
            boutonB.addMouseListener(new MouseAdapter() {
              

                @Override
                public void mousePressed(MouseEvent e) {
                 new JMouseObserver("jmo2", contenu);
                }
            });
            // le bouton C a 1 observateur jmo3
            boutonC.addMouseListener(new MouseAdapter() {
              

                @Override
                public void mousePressed(MouseEvent e) {
                 new JMouseObserver("jmo3", contenu);
                }


            });
        
    }
    
     public static void main(String[] args){
        new IHMQuestion2_1();
        new IHMQuestion2_2();
    }


}
