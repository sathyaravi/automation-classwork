package week3day3;

public interface WebDriver {
	
		//Unimplemented methods
		public void findElement();
		
		//Implemeted methods
		static void quit() {
			System.out.println("Static");
			
		}
		
		default void click() {
			System.out.println("Default");
		}
		
		void clicked();
}
