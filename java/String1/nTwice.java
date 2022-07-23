//Link to the Question: https://codingbat.com/prob/p174148

/*QUESTION:
Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

CASES:
nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
*/

public String nTwice(String str, int n) {
  
  //ex. Hello
  int l = str.length();//5
  String fh = str.substring(0,n);//0,2: He
  String lh = str.substring(l-n,l);//3,4: lo
  
  return fh+lh;//Helo
  
}
