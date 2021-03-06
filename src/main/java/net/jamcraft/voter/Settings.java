package net.jamcraft.voter;

import net.minecraftforge.common.config.Configuration;

public class Settings {
	
	public static boolean canStop;
	public static boolean canKick;
	
	public static float minVote;
	public static int voteTime;
	public static int waitTime;
	
	public static void readSettings(Configuration config){
		config.load();
		canStop = config.getBoolean("canStop", "Vote", false, "Set to true to allow players to vote to stop the server.  Useful in some senarios.");
		canKick = config.getBoolean("canKick", "Vote", true, "Set to false to deny players from voting to kick another player.");
		
		minVote = config.getFloat("minVote", "Vote", 0.5F, 0F, 1F, "A float between 0 and 1 representing the percentage of yes votes needed to pass a vote.");
		voteTime = config.getInt("voteTime", "Vote", 60, 0, Integer.MAX_VALUE, "How long in seconds for each voting period to take effect.");
		waitTime = config.getInt("waitTime", "Vote", 120, 0, Integer.MAX_VALUE, "Time in seconds to wait between votes. Set to 0 to disable.");
		config.save();
	}
}
