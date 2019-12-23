
public class Data
{
  private String data;
  
  public Data(String data)
  {
    this.data = data;
  }
  
  //returns all subsets of data through String combo
  //has complexity O(n^4)
  public Thing[] findThingCombos()
  {  
    int len = data.length();  
    int temp = 0;  
    Thing arr[] = new Thing[len*(len+1)/2];  
    for(int i = 0; i < len; i++) {  
        for(int j = i; j < len; j++) {  
            arr[temp] = new Thing(data.substring(i, j+1));  //get all combos for first character, then second character, and so on...
            temp++;  
        }  
    } 
    return arr;
  }
}
