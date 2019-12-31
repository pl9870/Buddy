
public class Thing
{
  private String characters;
  
  public Thing(String characters)
  {
    this.characters = characters;
  }
  
  public String getCharacters()
  {
    return characters;
  }
  
  public String toString()
  {
    return characters;
  }
  
  public boolean isWord()
  {
    if(characters.substring(0,2).equals("!~")) {
      return true;
    }
    return false;
  }
  
  public boolean isGroup()
  {
    return !isWord();
  }
  
  

}
