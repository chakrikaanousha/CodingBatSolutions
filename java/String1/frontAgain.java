//link to the question: https://codingbat.com/prob/p196652

/*
QUESTION:
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

CASES:
frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
*/

public boolean frontAgain(String str) {
  int l = str.length();
  
 //GAVE AN ERROR 
  /*String fh = str.substring(0,2);
  String lh = str.substring(l-2,l);*/
  
  if(l<=1){ //frontAgain("x") → false & frontAgain("") → false
    return false;
  }
  else if(str.substring(0,2).equals(str.substring(l-2,l))){
    return true;
  }
  else{
    return false;
  }
}
