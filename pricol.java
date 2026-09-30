public class pricol{
    public static void main(String[] args) {

        //zadanie 1
        short f1[] = {17, 15, 13, 11, 9, 7};
        
        //zadanie 2
        float x[] = new float[18];
        for(int i = 0; i < x.length; i++){
            x[i] = -9 + (float)Math.random() * (6 - (-9));
        }

        //zadanie 3
        double f2[][] = new double[6][18];
        for(int i = 0; i < f2.length; i++){
            for(int j = 0; j < f2[i].length; j++){
                if(f1[i] == 9){
                    f2[i][j] = Math.pow(   Math.asin( Math.pow((x[j]-1.5)/15, 2)),   (Math.sin( Math.pow((x[j]/1/2),2)) )/0.25   );
                    
                }
                else if(f1[i] == 7 || f1[i] == 11 || f1[i] == 17){
                    f2[i][j] = Math.cbrt( Math.pow((double)1/3 * (Math.pow(x[j]+1, 2) - 1/3), 3));
                }
                else{
                    f2[i][j] = Math.pow(Math.E, Math.asin( Math.pow(Math.E, Math.cbrt( -Math.pow(Math.E, x[j])))));
                }
            }
        }

        //zadanie 4
        for(int i = 0; i < f2.length; i++){
            for(int j = 0; j < f2[i].length; j++){
                System.out.printf("%.2f ", f2[i][j]);
            }  
            System.out.println();            
        }
    }
}