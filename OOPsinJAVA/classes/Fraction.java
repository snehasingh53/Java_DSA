package OOPsinJAVA;


public class Fraction{
   
    public static class Fraction{
        int num ;
        int den;

        public Fraction(int num , int den){
            this.num = num;
            this.den=den;
        }

        public void simplify(){
            if(num<=den){
                if(num%den==0){
                    den=den/num;
                    num=1;
                }
            }
        }
    }

public static void main(String[] args){
   Fraction f1 = new Frcation(7,21);
   System.out.println(f1.num+"/"+f1.den);
   f1.simplify();
   Fraction f2 = new Frcation(7,3);
   System.out.println(f2.num+"/"+f2.den);

}
}