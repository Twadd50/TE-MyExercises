package com.techelevator;

public class KataRomanNumerals {
	
		private String[] thousandRoman = new String[] {"","M","MM","MMM"};
		private String[] hundredRoman  = new String[] {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	    private String[] tenRoman 	   = new String[] {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	    private String[] oneRoman      = new String[] {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	    
	    public String arabicToRoman(int arabicNum) {
	        String romanNum = "";
	        romanNum += thousandRoman[arabicNum/1000];
	        arabicNum %= 1000;
	        
	        romanNum += hundredRoman[arabicNum/100];
	        arabicNum %= 100;
	        
	        romanNum += tenRoman[arabicNum/10];
	        arabicNum %= 10;
	        
	        romanNum += oneRoman[arabicNum];
	        return romanNum;
	    }
	    
}
