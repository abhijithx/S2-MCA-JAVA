class Tri{
    void tri(int n)
    {
        for( int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
            System.out.print("\t");
            }
            for(int k=0;k<=2*i;k++)
            {
                if(k==0 || k==2*i || i==n-1)
                System.out.print("*\t");
                else
                System.out.print(" \t");
            }
            System.out.println("");
            System.out.println("");
        }

    }

    void oct(int n)
    {
        for( int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
            System.out.print("\t");
            }
            for(int k=0;k<=((n+1)/2)+i;k++)
            {
                System.out.print("*\t\t");
            }
            System.out.println("");
            System.out.println("");
        }

    }
}
public class Pattern
{
    public static void main(String[] args) {
    Tri t1=new Tri();
    t1.tri(5);
   //t1.oct(3);

    }
}