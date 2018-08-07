package com.bear;

public class RobotFactory {
	public int[][] getRobotPosition(int[][] maze, Point[] robotCommand) {
		int x = robotCommand[0].getX();
		int y = robotCommand[0].getY();
		for (int i = 1; i < robotCommand.length; i++) {
			if(maze[x+robotCommand[i].getX()][y+robotCommand[i].getY()]==1) {
				x+=robotCommand[i].getX();
				y+=robotCommand[i].getY();
			}
		}
		maze[x][y]=2;
		return maze;
	}
}
