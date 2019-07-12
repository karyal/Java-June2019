
package library;

import java.text.DecimalFormat;

public class Util {
    public static double round(double value){
        DecimalFormat df2 = new DecimalFormat( "##0.00" );
        double final_average = Double.parseDouble(df2.format(value));
        return(final_average);
    }
}
