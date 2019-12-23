import java.util.ArrayList;

public class Variables
{
  //contains important variables of data that overseas everything
  private static ArrayList<Bucket> allBuckets = new ArrayList<>();
  private static ArrayList<Subset> allSubsetPatterns = new ArrayList<>();
  
  public static void addSubsetPattern(Subset a)
  {
    allSubsetPatterns.add(a);
  }
  
  public static ArrayList<Subset> getSubsetPatterns()
  {
    return allSubsetPatterns;
  }

}
