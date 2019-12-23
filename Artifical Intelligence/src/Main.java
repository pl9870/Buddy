
public class Main
{
  public static void main(String[] args)
  {
    Data x = new Data("How is Kobe Bryant?");
    Thing[] arr = x.findThingCombos();
    for(int i = 0; i < arr.length; i++)
      System.out.println(arr[i]);
  }
  
  
  
  
}
