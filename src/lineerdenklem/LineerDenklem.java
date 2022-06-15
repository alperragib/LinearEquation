package lineerdenklem;
import java.util.Scanner;

public class LineerDenklem {

    private int a,b,c,d,e,f;
    
    LineerDenklem()
    {
    
    }
    LineerDenklem(int a,int b,int c,int d,int e,int f)
    {
        this.a =a;
        this.b =b;
        this.c =c;
        this.d =d;
        this.e =e;
        this.f =f;
    }
    
    public int getA()
    {
        return this.a;
    }
    public int getB()
    {
        return this.b;
    }
    public int getC()
    {
        return this.c;
    }
    public int getD()
    {
        return this.d;
    }
    public int getE()
    {
        return this.e;
    }
    public int getF()
    {
        return this.f;
    }
    
    public boolean CozulebilirMi()
    {
        if(((this.a *this.d) - (this.b*this.c)) !=0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public double getX()
    {
        int x=0;
        if(CozulebilirMi())
        {
            x= (c*e - b*f) / (a*e - b*d);
        }
        
        return x;
    }
    public double getY()
    {
        int y=0;
        if(CozulebilirMi()){
        y= (a*f - e*d) / (a*e - b*d);
        }
        return y;
    }
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        LineerDenklem l = new LineerDenklem();
        System.out.print("Lütfen hesaplamak istediğiniz lineer denklem değerlerini giriniz.");
        System.out.print("\na:");
        l.a=input.nextInt();
        System.out.print("\nb:");
        l.b=input.nextInt();
        System.out.print("\nc:");
        l.c=input.nextInt();
        System.out.print("\nd:");
        l.d=input.nextInt();
        System.out.print("\ne:");
        l.e=input.nextInt();
        System.out.print("\nf:");
        l.f=input.nextInt();
        
        System.out.print("\nGirilen Lineer Denklemin Sonuçları;\n X: "+l.getX()+"\n Y: "+l.getY()+"\n");
        
    }
    
}
