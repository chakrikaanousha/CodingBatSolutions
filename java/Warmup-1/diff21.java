//link: https://codingbat.com/prob/p116624

/*Question:
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

Cases:
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0 */

public int diff21(int n) {
  if(n<=21){
    int diff = 21-n;
    return diff;
  }else{
    int diff2 = 2*(n-21);
    return diff2;
  }
}
