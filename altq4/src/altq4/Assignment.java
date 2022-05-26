
package altq4;


public class Assignment {
       public static double series(double n){
   double cal=0;
   for (double j=1;j<=n;j++){
   cal+=Math.pow(-1, j+1)/(2*j-1);
   }
   cal = cal*4;
   return cal;
   }
    public static void main(String[] args) {
        int lowerBound=10;
        int upperBound=100;
        System.out.printf("%s%18s%n","i","m(i)");
        System.out.println("--------------------");
        for (double j = lowerBound;j<=upperBound;j+=10){
            System.out.printf("%12.0f%-6.5f%n",j,series(j));
        }
    }
}
