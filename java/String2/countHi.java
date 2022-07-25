//link: https://codingbat.com/prob/p147448

/*QUESTION:
Return the number of times that the string "hi" appears anywhere in the given string.

CASES:
countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
*/

public int countHi(String str) {
  int count =0;
        for (int i = 0; i < str.length()-1; i++) { //len -1 *
            String st1= str.substring(i,i+2);//two words - hi
            if(st1.equals("hi")){
             count=count+1;
            }
        }
       return count;
}
