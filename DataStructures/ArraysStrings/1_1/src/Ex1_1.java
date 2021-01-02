/*
 * 1.1 Is Unique: 
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures 
 * */

public class Ex1_1 {
	public static void main(String[] args) 
	{
		//Declare variables
		String testString1 = "abc";
		String testString2 = "cde";
		String testString3 = "aaa";
		String testString4 = "aab";
		String testString5 = "abcdef;aklsdf;aoekdf;oksdfj;alksdjf;;asdfklmawo;kma;sdlkfma;lsdkmf;alskdmf;alksdmf;alksdmf;laksmdf;laksmdf;alksdmf;laksmdf;alskmdf;alskdmf;alskdmfp;oaiejtpqoiejrtpoikzmc;v,mzdnpsofkjqpewoktfmn;alskdmfokajsd;flkjzxc;vlkjjn;aSOKDFJNQ;EOGJUA;SDLKJGJ;LAKDJFG;LAKSJDGF;LKAJSDFG;LKJASDG;LKJASDG;LKJASDGO;IZXC;VLKJASDF;LKJASDO;KJASDG;LKJghijklip;oasdp;ionwae;pk";
		boolean result = false;
		
		// get the string to be modified
		
		// modify the string to a string array so that the characters on the string can be compared
		
		//
		System.out.println("------------------------------------------------------------");

		System.out.println("| This program checks if the values in a string are unique");
		System.out.println("-----------------------------------------------------------");
		
		// Test the IsUnique method
		TestIsUnique(testString1);
		TestIsUnique(testString2);
		TestIsUnique(testString3);
		TestIsUnique(testString4);
		TestIsUnique(testString5);
		
	}
	
	public static boolean IsUnique(String text) {
		//Declare Variables
		boolean result = true;
		int characterCount = text.length();
		//System.out.println("The Character Count is: " + characterCount);
		
		//Character array assumes that the character set will be ASCII
		char[] characterSet = new char [256];
		
		// if the length of the string is larger than the character set then result will be false (Assume ASCII)
		if(characterCount > 256) 
		{
			return false; // not unique
		}
		else {
			//loop through the string in order to populate the characterSet character array
			for(int i = 0; i < characterCount; i++) {
				characterSet[i] = text.charAt(i);
			}
			
			//loop to see if there are any values that are duplicates
			for(int i = 0; i < characterCount; i++) 
			{
				for(int j = 0; j < characterCount; j++) 
				{
					if((i != j)&& (characterSet[i] == characterSet[j])) {
						result = false;
					}
				}
			}
			
			//return the results
			return result;
		}
	}
	
	public static void TestIsUnique(String text) {
		//This is a method to test the IsUnique Method
		
		//Declare Variables
		boolean result = false; 
		
		result = IsUnique(text);
		
		System.out.println("-----------------------------");
		System.out.println("The result for: ");
		System.out.println(text);
		System.out.println(result);
		System.out.println("-----------------------------\n");
	}
}
