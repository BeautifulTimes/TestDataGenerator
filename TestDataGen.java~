import java.io.*;
import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.geom.*;
import java.math.*;
import java.text.*;
import java.math.BigInteger.*;
import java.util.Arrays; 

public class  TestDataGen
{
  BufferedReader in;
  StringTokenizer as;
  PrintWriter writer;
  public static void main (String[] args)
  {
    new TestDataGen  ();
  }
  
  public void nl()
  {
    writer.write('\n');
  }
  
  public void space()
  {
    writer.write(' ');
  }
  
  public void random(long min, long max)
  {
    writer.write(Long.toString((long)((max-min+1)* Math.random() + min)));
  }
  
  
  public void random(int min, int max)
  {
    writer.write(Integer.toString((int)((max-min+1)* Math.random() + min)));
  }
  
  public void wl(long l)
  {
    writer.write(Long.toString(l));
  }
  
  public int ra (int low, int high)
  {
    return((int)((high-low+1)*Math.random()+low));
  }
  
  public void wi(int i)
  {
    writer.write(Integer.toString(i));
  }
  
  
  
  public TestDataGen  ()
  {
    try
    {
      
      in = new BufferedReader (new InputStreamReader (System.in));
      int aaa = nextInt();
      
      
      for(int xx1 = 0;xx1<aaa;xx1++)
      {
        writer = new PrintWriter("in" + Integer.toString(xx1), "UTF-8");
        int nn = ra(1,1000);
        int mm = ra(1,1000);
        int aa = ra(1,1000);
        int bb = ra(1,1000);
        int cc = ra(1,1000);
        wi(nn);
        space();
        wi(mm);
        space();
        wi(aa);
        space();
        wi(bb);
        space();
        wi(cc);
        nl();
        for(int x = 0;x<nn;x++)
        {
          random(0,1);
          if(x != nn-1)
          space();
        }
        nl();
        for(int x = 0;x<cc;x++)
        {
          random(1,nn);
          if(x !=cc-1)
          space();
        }
        writer.close(); 
        in = new BufferedReader (new FileReader ("in" + Integer.toString(xx1)));
        writer = new PrintWriter("out" + Integer.toString(xx1), "UTF-8");
        int n = nextInt();
        int m = nextInt();
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();
        int nums[] = new int [n];
        for(int x = 0;x<n;x++)
          nums[x] = nextInt();
        for(int x= 0;x<c;x++)
        {
          int d = nextInt()-1;
          if(nums[d] == 1)
            m +=a;
          else
            m-= b;
        }
        wi(m);
        writer.close(); 
      }
      
      
    }
    catch(IOException e)
    {
      
    }
  }
  
  
  
  
  
  
  
  String next () throws IOException
  {
    while (as == null || !as.hasMoreTokens ())
    {
      as = new StringTokenizer (in.readLine ().trim ());
    }
    
    
    return as.nextToken ();
  }
  
  
  
  long nextLong () throws IOException
  {
    return Long.parseLong (next ());
  }
  
  
  int nextInt () throws IOException
  {
    return Integer.parseInt (next ());
  }
  
  
  double nextDouble () throws IOException
  {
    return Double.parseDouble (next ());
  }
  
  
  String nextLine () throws IOException
  {
    return in.readLine ().trim ();
  }
}