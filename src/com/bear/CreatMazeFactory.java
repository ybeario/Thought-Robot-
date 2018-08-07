package com.bear;

public class CreatMazeFactory {
	public int[][] creat(Point[] command) {
		Point size = command[0];
		int[][] maze = new int[size.getX()][size.getY()];
		// 原始点
		for (int i = 1; i < size.getX(); i += 2) {
			for (int j = 1; j < size.getY(); j += 2) {
				maze[i][j] = 1;
			}
		}
		// 点之间的路径
		for (int i = 1; i < command.length; i++) {
			maze[command[i].getX()][command[i].getY()] = 1;
		}
		return maze;
	}
}
