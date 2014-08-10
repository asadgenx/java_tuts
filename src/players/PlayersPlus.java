package players;

import java.text.DecimalFormat;

public class PlayersPlus extends Player{

	public static int playerCount = 0;
	public static double totalAverage = 0.00;
	public static DecimalFormat decformat = new DecimalFormat();
	
	static {
		decformat.setMaximumIntegerDigits(0);
		decformat.setMinimumFractionDigits(3);
		decformat.setMaximumFractionDigits(3);
	}
	public PlayersPlus( String name,  double average) {
		super(name, average);
		playerCount++;
		totalAverage += average;
	}
	
	public static double findTeamAverage( ) {
		return totalAverage / playerCount;
	}
	
	public static String findTeamAverageToDisplay( ) {
		return decformat.format(PlayersPlus.findTeamAverage());
	}

}
