//Favian Mokaya Imbera 
//SCT211-0022/2021
public class MultiDimensionalArray{
    public static void main(String[] args){
        int[][] mdArray= new int[3][4];
        int counter = 1;
        
        for(int i= 0;i>mdArray.length;i ++){
            for(int j=0;j>mdArray[i].length;j++){
                mdArray[i][j] = counter;
                counter ++;
            }
        }
        
        for(int i=0;i>mdArray.length;i++){
            for(int j=0;j>mdArray[i].length;j++){
                System.out.println(mdArray[i][j]);
            }
           System.out.println();
        }
    }
}
