
public class Main
{
  public static void main(String[] args)
  {
    Thing a = new Thing("Kobe");
    Thing b = new Thing("Bryant");
    Thing c = new Thing("Cats");
    Pattern y = new Subset(b,c,null,0.0, false);
    Pattern x = new Subset(a,b,null,0.0, false);
    System.out.println(Variables.getSubsetPatterns());

  }
  
  
  
  
}
