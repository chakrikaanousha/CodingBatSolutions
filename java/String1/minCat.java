//link to que: https://codingbat.com/prob/p105745

/*
Question:
Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

Cases:
minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"*/

public String minCat(String a, String b) {
  int l1 =  a.length();
  int l2 = b.length();
  
  if(l1>l2){   //minCat("Hello", "Hi") → "loHi"
    return a.substring(l1-l2,l1)+b;
  }
  else{ //minCat("java", "Hello") → "javaello"*/
    return a+b.substring(l2-l1,l2);
  }
}
