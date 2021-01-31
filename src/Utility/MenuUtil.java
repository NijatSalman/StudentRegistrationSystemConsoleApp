package Utility;

public class MenuUtil {
	
	
	public static void processMenu(int selectedMenu ){
		
		switch (selectedMenu) {
		case 1:
			StudentUtil.RegisterStudent();
			break;
		case 2:
			StudentUtil.printAllregisteredStudent();
			break;
		case 3:
			StudentUtil.findStudentsAndPrint();
			break;
		case 4:
			StudentUtil.updateWithSplitMethod();
			break;
		}
	}
	
	public static String requireName(){
		return InputUtil.RequaireText("type name");
	}
	
	public static String requireSurname(){
		return InputUtil.RequaireText("type surname");
	}
	
	public static String requireClassName(){
		return InputUtil.RequaireText("type Classname");
	}
	
	public static int requireAge(){
		return InputUtil.RequaireNumber("type age");
	}
	
	public static void showSuccessMessage(){
		System.out.println("Operation completed successfully"); 
	}
	

}
