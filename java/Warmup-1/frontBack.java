//link: https://codingbat.com/prob/p123384

/*
Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/
public String frontBack(String str) {
 
        int l = str.length();
        if(l>=2){

        String mid = str.substring(1,l-1);
        return (str.charAt(l-1) + mid +str.charAt(0));
}
else{
  return str;
}
}
