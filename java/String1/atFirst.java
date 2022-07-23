//link to the que: https://codingbat.com/prob/p139076
*****************************************************************************************************************

/*QUESTION: 

Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.

CASES:
atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
atFirst("") → "@@"
*/

public String atFirst(String str) {
  if (str.length() < 1){ //atFirst("") → "@@"
    return "@"+"@";
  }
  else if (str.length() < 2){ //atFirst("h") → "h@"
    return str+"@";
  }
  else{
    return str.substring(0,2);//atFirst("hello") → "he"
  }
}
