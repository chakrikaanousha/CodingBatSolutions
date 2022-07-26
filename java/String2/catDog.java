//link: https://codingbat.com/prob/p111624

/*QUE: 
Return true if the string "cat" and "dog" appear the same number of times in the given string.

CASES:
catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
*/

public boolean catDog(String str) {
  //AS COUNT OF THEIR OCCURENCE SHLD BE SAME;
  int catcount = 0;
  int dogcount = 0;
  
   for (int i = 0; i < str.length()-2; i++) {
     if(str.substring(i,i+3).equals("cat")){//CAT COUNT
     catcount++;
     } 
     if(str.substring(i,i+3).equals("dog")){//DOG COUNT
     dogcount++;
   }
   }
   
   return dogcount==catcount;
}
