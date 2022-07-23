//link to the question: https://codingbat.com/prob/p132118
******************************************************************************************************

/*QUESTION:
Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
conCat("", "cat") → "cat"
*/

public String conCat(String a, String b) {
  if(a.length()==0 | b.length()==0){ //conCat("abc", "") → "abc"  &  conCat("", "cat") → "cat"
    return a+b;
  }
  else if(a.charAt(a.length()-1) == b.charAt(0)){ //conCat("abc", "cat") → "abcat"
    return a+b.substring(1,b.length());
  }
  else{ //conCat("dog", "cat") → "dogcat"
    return a.concat(b);
  }
 
}
