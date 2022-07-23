//link to the question: https://codingbat.com/prob/p139075
*****************************************************************************

/*QUESTION:
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, 
including 0. Note: use .equals() to compare 2 strings.

CASES:
hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
*/

public boolean hasBad(String str) {
  if(str.length()<3){  //less than 3: not possible
    return false;
  }
  if(str.length()==3){ //equal to 3 : a chance possible: checking condition
    return (str.substring(0,3)).equals("bad");
  }
  
  //return true if "bad" appears starting at index 0 or 1 in the string
  if((str.substring(0,3)).equals("bad")){ //(i) index at 0
    return true;
  }
  else if(str.substring(1,4).equals("bad")){// (ii) index at 1
    return true;
  }
  else{
    return false;
  }
}


