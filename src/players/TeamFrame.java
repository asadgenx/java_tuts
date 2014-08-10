package players;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class TeamFrame extends JFrame {
	
	public TeamFrame() throws IOException{
		PlayersPlus player;
		Scanner inputs = 	new Scanner(new File("/home/asadgenx/workspace/java/knowing_java_more/src/players/players.txt"));
		for (int num = 1; num <= 4;num++) {
		player = new PlayersPlus(inputs.nextLine(),inputs.nextDouble());
		inputs.nextLine();
		addPlayerInfo(player);
		}
		setTitle("The ODI players");
		setLayout(new GridLayout(10, 3, 20, 3));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
		add(new JLabel());
		add(new JLabel(" ------"));
		add(new JLabel("Team Batting Average:"));
		add(new JLabel(PlayersPlus.findTeamAverageToDisplay()));
		}
	
		void addPlayerInfo(PlayersPlus player) {
			add(new JLabel(" " + player.getName()));
			add(new JLabel(player.getAverageString()));
		}

}
