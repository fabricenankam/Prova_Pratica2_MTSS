////////////////////////////////////////////////////////////////////
// [FABRICE] [NANKAM] [2123577]
// [YIGU] [ZHU] [2082860]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
	public static String convert(int number){
		if(number > 0 && number <= 1000){
			String Roman = "";
			while(number > 0){
				//Issue #4
				if(number % 5 > 0){
					number--;
					Roman = Roman + "I";
				}
			}
			return Roman;
		}
		else{
			throw new IllegalArgumentException("Input deve essere un numero tra 1 e 1000.");
		}
	}
}
