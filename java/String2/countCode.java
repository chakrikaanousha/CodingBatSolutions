//link: https://codingbat.com/prob/p123614

/*Que:
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

Cases:
countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
*/

public int countCode(String str) {
  int count = 0;// intialising a counter
        for (int i = 0; i < str.length()-3; i++) {
          
            if(str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e") ){ //check co_e
                count++;//add to the count
            }
        }
       return count;
  
}
