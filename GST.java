
import java.util.*;
 
class GST

{
    static float Price(float price,float gst)
    {
        float addon=(gst/100);
        addon=addon*price;
        float res=price+addon;
        // return value after calculate GST%
        return res;
    }
     
    // Driver code
    public static void main (String[] args)
    {
       /* Scanner inp=new Scanner(System.in);
        System.out.println("enter the price of the product:");
        float price=inp.nextFloat();
        System.out.println("enter the percentage of gst:");
        float gst=inp.nextFloat();
        System.out.println(" GST = "  + gst+ "%");*/
        System.out.println("The price after GST is  Rs:" +Price(1999,5));
    }
}
 
// This code is contributed
// by vt_m.