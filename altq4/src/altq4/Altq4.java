
package altq4;


public class Altq4 {
//NAME : OGBODU DAVID TEGA
//DEPT : COMPUTER SCIENCE
//MATRIC NO: CSC/15/3056    
      public static double find(double n){
   double ass=0;
   for (double j=1;j<=n;j++){
   ass+=Math.pow(-1, j+1)/(2*j-1);
   }
   ass = ass*4;
   return ass;
   }
    public static void main(String[] args) {
        int lower=10;
        int upper=100;
        System.out.printf("%s%18s%n","i","m(i)");
        System.out.println("--------------------");
        for (double j = lower;j<=upper;j+=10){
            System.out.printf("%12.0f%-6.5f%n",j,find(j));
        }
    }
    }
    

