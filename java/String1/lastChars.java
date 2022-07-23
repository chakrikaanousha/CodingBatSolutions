//link to the que: https://codingbat.com/prob/p138183
####################################################################################################

/*QUESTION:
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

CASES:
lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("", "hello") → "@o"
lastChars("hi", "") → "h@"
lastChars("", "") → "@@"
*/

public String lastChars(String a, String b) {
  
  if (a.isEmpty()==true && b.isEmpty()==true){ //lastChars("", "") → "@@"
    return "@"+"@";
  }
  else if(b.isEmpty()==true){ //lastChars("hi", "") → "h@"
    return a.substring(0,1)+"@";
  }
  else if(a.isEmpty()==true){
    return "@"+ b.substring(b.length()-1,b.length()); //lastChars("", "hello") → "@o"
  }
  else { //lastChars("last", "chars") → "ls"
    return a.substring(0,1)+b.substring(b.length()-1,b.length());
  }
}
