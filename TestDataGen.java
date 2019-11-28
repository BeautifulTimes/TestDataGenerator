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
  
  //Write a new line to output
  public void newline()
  {
    writer.write('\n');
  }
  //Write a new space to output
  public void space()
  {
    writer.write(' ');
  }
  //Generate a random integer between low and high, each number has the same chance to be generated.
  public int randomInt (int low, int high)
  {
    return((int)((high-low+1)*Math.random()+low));
  }
  //Generate a random long number between low and high, each number has the same chance to be generated.
  public long randomLong (long low, long high)
  {
    return((int)((high-low+1)*Math.random()+low));
  }
  //Generates a random long number between low and high and writes it to output.
  public void writeRandomLong(long low, long high)
  {
    writer.write(Long.toString(randomLong(low, high)));
  }
  //Generates a random int number between low and high and writes it to output.
  public void writeRandomInt(int min, int max)
  {
    writer.write(Integer.toString(randomInt(low, high)));
  }
  //Writes a long number to output
  public void writeLong(long l)
  {
    writer.write(Long.toString(l));
  }
  //Writes an integer to output
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
        writer = new PrintWriter("out" + Integer.toString(xx1), "UTF-8");
        
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