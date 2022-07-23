/*Given a string of even length, return a string made of the middle two chars,
so the string "string" yields "ri". The string length will be at least 2.*/

/* CASES:
middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct" */

public String middleTwo(String str) {
  
  //EX. string --> ri (3 & 4)
  int l = str.length()/2;  //half string length: 6/2 = 3
  
  //here, index no. starts from 0, always len-1
  return str.substring(l-1,l+1); //3 4
}

