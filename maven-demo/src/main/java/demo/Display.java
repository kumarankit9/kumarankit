package demo;

public class Display {

	public String displayMessage(Integer age) throws Exception {

		if (age > 18) {
			return "Hello Ankit !!!";
		} else if (age <18 ) {
			return "Hello Nikhil";
		} else {
			throw  new Exception("18 has some issues.");
		}
	}
}
