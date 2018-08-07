package com.bear;

public class PrintFactory {
	public void print(int[][] maze) {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (maze[j][i] == 2) {
					System.out.print("[*] ");
				} else {

					System.out.print(maze[j][i] == 1 ? "[R] " : "[W] ");
				}
			}
			System.out.println();
		}
	}
}
