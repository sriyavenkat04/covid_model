package Unit3;

    public class WDTPDMath {
        
         public static void main(String[] args) {
         int n1 = 5;
         int n2 = -3;
        
         double d1 = 6.2;
         double d2 = -4.3;
        
         int value1 = n1 * n2 + 9;
         System.out.println(value1);
        value1 +=3;
        System.out.println(value1);
        value1 /=2;
        System.out.println(value1);
         value1 *= -5;
         System.out.println(value1);
         value1++;
         System.out.println(value1);
         value1 = value1 + n1++ + --n2;
         System.out.println(value1);
         value1 = n2 %2;
         System.out.println(value1);
        double value2 = value1 + d1 * d2;
        System.out.println(value2);
         value2 = (5*n1 + n2)/2;
         System.out.println(value2);
         value2 = Math.pow(d1, (-2.0));
         System.out.println(value2);
         value2 = Math.rint(d1);
         System.out.println(value2);
         value2 = Math.ceil(d2);
         System.out.println(value2);
         value2 = Math.random()*6;
         System.out.println(value2);
         value1 += (int)value2+1;
         System.out.println(value1);
         }
       
}
