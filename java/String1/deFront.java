//link to the question: https://codingbat.com/prob/p110141

/*Question:
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

Cases:
deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
*/

public String deFront(String str) {    
  if(str.substring(0,1).equals("a") && str.substring(1,2).equals("b")){
    return "ab"+str.substring(2,str.length());
  }
  
  else if(str.substring(1,2).equals("b")){
    return "b"+str.substring(2,str.length());
  }
  
  else if(str.substring(0,1).equals("a")){
    return "a"+str.substring(2,str.length());
  }
  
  else{
    return str.substring(2,str.length());
  }
}
