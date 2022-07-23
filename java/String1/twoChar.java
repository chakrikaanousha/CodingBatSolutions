//link to que: https://codingbat.com/prob/p144623
******************************************************************************************************************************************************

/*QUESTION:
Given a string and an index, return a string length 2 starting at the given index.
If the index is too big or too small to define a string length 2, use the first 2 chars. 
The string length will be at least 2.

CASES:
twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
*/

public String twoChar(String str, int index) {
  if (index+2>str.length() | index<0){ //If the index is (i)too big or (ii)too small to define a string length: 
    return str.substring(0,2); // o/p: use the first 2 chars
  }
  else{
    return str.substring(index,index+2);//return a string length 2 starting at the given index
  }
}

