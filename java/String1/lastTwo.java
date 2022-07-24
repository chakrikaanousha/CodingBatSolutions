//link to the question: https://codingbat.com/prob/p194786
**********************************************************************************************
/*Question:
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

Cases: 
lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
*/

public String lastTwo(String str) {
  int l = str.length(); 
  if(l<=1){ //lastTwo("") → "" & lastTwo("a") → "a"
    return str;
  }
  else{
  //ex. coding
  String fh = str.substring(0,l-2); // codi
  /*String lh1 = str.charAt(l-2);//6
  String lh2 = str.charAt(l-1);*/
  String lh1 = str.substring(l-1,l); //g
  String lh2 = str.substring(l-2,l-1); //n 
  return fh+lh1+lh2; // codign
  }
}
