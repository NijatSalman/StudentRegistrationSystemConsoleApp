package main;

import java.util.Scanner;

import Utility.InputUtil;
import Utility.MenuUtil;
import Utility.StudentUtil;
import beans.Student;
import beans.Teacher;

public class Main {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);

		int menu = 0;

		while (true) {

			menu = InputUtil.RequaireNumber("What do you want?+" + "\n1 Register Student " + "\n2 Show all students"
					+ "\n3 Find student" + "\n4 Update Student");

			MenuUtil.processMenu(menu);
		}

	}

}
