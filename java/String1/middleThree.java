//link to the que: https://codingbat.com/prob/p115863

/*QUESTION:
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

CASES:
middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
*/

public String middleThree(String str) {
  //EX. Candy 
  int l = str.length()/2; //5/2= 2.5
  //str.length() only stores int values: 2
  return str.substring(l-1,l+2);//1 to 4 : 3 
}

//tricky part: logic that length() function only stores int part 
