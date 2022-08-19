//link to the ques: https://codingbat.com/prob/p175762

/* QUESTION:
Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

CASES:
bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
*/

public boolean bobThere(String str) {

  int l = str.length();//length()
  for(int i = 0; i < l-2; i++) { // abcbob : l-2 so it doesnt go out of bound index
        if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b'){//checking char at start and end of three letters
            return true;
    }
  }
    //else            
    return false;
    
}
