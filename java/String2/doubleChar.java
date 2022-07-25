//link to the question: https://codingbat.com/prob/p165312

/*QUESTION:
Given a string, return a string where for every char in the original, there are two chars.

CASES:
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
*/

public String doubleChar(String str) {

  String s ="";
  for (int i = 0; i < str.length(); i++) {
    String st1= str.substring(i,i+1);
    String st2= str.substring(i,i+1);
    s=s+st1+st2;
    }
    return s;
}
