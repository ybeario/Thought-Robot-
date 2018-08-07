package com.bear;

import java.io.IOException;

public class TestMain {
	public static void main(String[] args) throws IOException {
		CommandFactory commandFactory = new CommandFactory();
		CreatMazeFactory creatMazeFactory = new CreatMazeFactory();
		PrintFactory printFactory = new PrintFactory();
		RobotFactory robotFactory = new RobotFactory();
		commandFactory.getCommand();
		Point[] mazeCommand = commandFactory.getMazeCommand();
		Point[] robotCommand = commandFactory.getRobotCommand();
		int[][] creat = creatMazeFactory.creat(mazeCommand);
		int[][] maze = robotFactory.getRobotPosition(creat, robotCommand);
		printFactory.print(maze);
	}
}
