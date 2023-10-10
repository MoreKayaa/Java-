import java.util.*;
//This code will copy the elements from myarray1 to myarray2 and then add 120 to myarray2.
public class transfer {

    public static void main(String args[]) {
        int myarray1[]= {30,70,20,60,60,15};
        ArrayList<Integer> myarray2;
        myarray2=new ArrayList<>();
        for(int i=0;i<myarray1.length;i++){
            myarray2.add(myarray1[i]);
        }
        myarray2.add(120);
    }
  }
