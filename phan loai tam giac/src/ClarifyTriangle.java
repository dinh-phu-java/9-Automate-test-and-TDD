public class ClarifyTriangle {
    public static String checkTriangle(double sideA,double sideB,double sideC){
        if(isEquilateralTriangle(sideA,sideB,sideC)){
            return "tam giac deu";
        }else if(isIsoscelesTriangle(sideA,sideB,sideC)){
            return "tam giac can";
        }else if(isNormalTriangle(sideA,sideB,sideC)){
            return "tam giac thuong";
        }else{
            return "khong phai la tam giac";
        }

    }

    public static boolean isEquilateralTriangle(double a,double b,double c){
        if(a == b && a==c){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isIsoscelesTriangle(double a,double b, double c){
        if( (a == b  || b==c || a==c) && !isEquilateralTriangle(a,b,c) ){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isNormalTriangle(double a,double b,double c){
        if(!isEquilateralTriangle(a,b,c) && !isIsoscelesTriangle(a,b,c)){
            if(a <= 0 || b <=0 || c <= 0){
                return false;
            }else{
                if( a + b >= c && a+c >= b && b+c >= a){
                    return true;
                }else{
                    return false;
                }
            }


        }else{
            return false;
        }
    }
}
