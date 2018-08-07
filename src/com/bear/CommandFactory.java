package com.bear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandFactory {
	String command1 = null;
	String command2 = null;
	String command3 = null;

	public void getCommand() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		command1 = reader.readLine();
		command2 = reader.readLine();
		command3 = reader.readLine();
	}

	public int transferIndex(String string) {
		return Integer.parseInt(string) * 2 + 1;
	}

	public int transferRoad(String string1, String string2) {
		return (transferIndex(string1) + transferIndex(string2)) / 2;
	}

	public Point[] getMazeCommand() {
		String[] split = command1.trim().split(" ");
		String[] split2 = command2.trim().split(";");
		Point[] result = new Point[split2.length + 1];
		result[0] = new Point(transferIndex(split[0]), transferIndex(split[1]));
		for (int i = 1; i <= split2.length; i++) {
			String[] split3 = split2[i - 1].trim().split(" ");
			String[] split4 = split3[0].split(",");
			String[] split5 = split3[1].split(",");
			result[i] = new Point(transferRoad(split4[0], split5[0]), transferRoad(split4[1], split5[1]));
		}
		return result;

	}

	public Point[] getRobotCommand() {
		String[] split = command3.split(" ");
		String[] split2 = split[0].trim().split(",");
		char[] charArray = split[1].toCharArray();
		Point[] robotCommand = new Point[charArray.length + 1];
		robotCommand[0] = new Point(transferIndex(split2[0]), transferIndex(split2[1]));
		for (int i = 1; i < robotCommand.length; i++) {
			switch (charArray[i - 1]) {
			case 'W':
				robotCommand[i] = new Point(0, -1);
				break;
			case 'A':
				robotCommand[i] = new Point(-1, 0);
				break;
			case 'S':
				robotCommand[i] = new Point(0, 1);
				break;
			case 'D':
				robotCommand[i] = new Point(1, 0);
				break;
			}
		}
		return robotCommand;

	}
}
