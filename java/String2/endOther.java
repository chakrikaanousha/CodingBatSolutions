//Link to the que: https://codingbat.com/prob/p126880

/*QUESTION:
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

TESTCASES:
endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true*/


public boolean endOther(String a, String b) {
  int alen = a.length(); // length of a and b str.
    int blen = b.length();

//2cases arises here as we got to compare the last and start elements

    if(alen>blen){ 
        String frt = a.substring(alen-blen,alen); //alen>blen
        String lst = b.substring(0,blen);
        String lst1 = lst.toLowerCase();
        String frt1 = frt.toLowerCase();
        return(lst1.equals(frt1));
    }else{//alen<blen
        String frt = a.substring(0,alen); //blen>alen
        String lst = b.substring(blen-alen,blen); 
        String lst1 = lst.toLowerCase();
        String frt1 = frt.toLowerCase();
        return(lst1.equals(frt1));
    }

}


