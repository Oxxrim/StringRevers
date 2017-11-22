package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input string = new Input("ab12 111sdg3e k4ji5");
		Revers revstr = new Revers();
		System.out.println(revstr.getFinalText(string.getStr()));
	}

}
