package Utility;

import beans.Student;
import main.Config;

public class StudentUtil {

	public static Student fillStudent() {

		String name = MenuUtil.requireName();
		String surname = MenuUtil.requireSurname();
		String className = MenuUtil.requireClassName();
		int ages = MenuUtil.requireAge();

		Student studentObject = new Student(name, surname, className, ages);

		return studentObject;
	}

	public static void printAllregisteredStudent() {

		if (Config.studentObject == null) {
			return;
		}

		for (int i = 0; i < Config.studentObject.length; i++) {

			Student st = Config.studentObject[i];

			System.out.println((i + 1) + "." + st.getFullName());
		}
	}

	public static void RegisterStudent() {

		int count = InputUtil.RequaireNumber("How many person will you add");
		Config.studentObject = new Student[count];

		for (int i = 0; i < count; i++) {

			System.out.println(i + "." + "Register");

			Config.studentObject[i] = StudentUtil.fillStudent();
		}
		MenuUtil.showSuccessMessage();
	}

	public static void findStudentsAndPrint() {
		String text = InputUtil.RequaireText("type name, surname or className ");

		Student[] result = findStudents(text);

		for (int i = 0; i < result.length; i++) {

			System.out.println(result[i].getFullName());
		}

	}

	public static Student[] findStudents(String text) {
		int count = 0;
		for (int i = 0; i < Config.studentObject.length; i++) {
			Student st = Config.studentObject[i];
			if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
				count++;
			}
		}

		Student[] result = new Student[count];
		int found = 0;
		for (int i = 0; i < Config.studentObject.length; i++) {
			Student st = Config.studentObject[i];
			if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
				result[found++] = st;
			}
		}

		return result;
	}

	public static void updateWithNewObject() {

		StudentUtil.printAllregisteredStudent();

		int index = InputUtil.RequaireNumber("Who do you want to update? type its index");
		System.out.println("Add new information");
		Student studentObject = StudentUtil.fillStudent();
		Config.studentObject[index - 1] = studentObject;

	}
	
	public static void updateWithSameObject(){
		StudentUtil.printAllregisteredStudent();

		int index = InputUtil.RequaireNumber("Who do you want to update? type its index");
		System.out.println("Add new information");

		Student studentObject = Config.studentObject[index - 1];

		String changeparams = InputUtil
				.RequaireText("which parameter do you want to change? ex: 'name' , 'surname'");

		if (changeparams.contains("'name'")) {
			studentObject.setStudentName(InputUtil.RequaireText("name"));
		}
		if (changeparams.contains("'surname'")) {
			studentObject.setSurnmae(InputUtil.RequaireText("surname"));
		}
		if (changeparams.contains("'classname'")) {
			studentObject.setClassName(InputUtil.RequaireText("ClassName"));
		}
		if (changeparams.contains("'age'")) {
			studentObject.setAge(InputUtil.RequaireNumber("Age"));
		}
	}
	
	public static void updateWithSplitMethod(){
		StudentUtil.printAllregisteredStudent();

		int index = InputUtil.RequaireNumber("Who do you want to update? type its index");

		Student studentObject = Config.studentObject[index - 1];

		String changeparams = InputUtil.RequaireText("which parameter do you want to change? ex: name,surname,age");

		String[] splitReturnParams = changeparams.split(",");
		for (int i = 0; i < splitReturnParams.length; i++) {

			if (splitReturnParams[i].equalsIgnoreCase("name")) {
				studentObject.setStudentName(MenuUtil.requireName());
			} else if (splitReturnParams[i].equalsIgnoreCase("surname")) {
				studentObject.setSurnmae(MenuUtil.requireName());
			} else if (splitReturnParams[i].equalsIgnoreCase("classname")) {
				studentObject.setClassName(MenuUtil.requireClassName());
			} else if (splitReturnParams[i].equalsIgnoreCase("age")) {
				studentObject.setAge(MenuUtil.requireAge());
			}
		}
	}

}
