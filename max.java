import java.util.*;
//This code will find and print the maximum value in the list
public class max {
    public static void main(String args[]) {
            ArrayList<Integer> array1;
            array1=new ArrayList<>();
            array1.add(30);
            array1.add(70);
            array1.add(20);
            array1.add(60);
            array1.add(60);
            array1.add(15);
            array1.add(120);
            int max= array1.get(0);
            for(int i=1;i<array1.size();i++){
                if(array1.get(i)>max){
                    max=array1.get(i);
                }
            }
                        System.out.println(max);
            }
}
