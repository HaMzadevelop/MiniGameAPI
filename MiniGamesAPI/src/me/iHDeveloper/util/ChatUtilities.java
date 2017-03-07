package  me.iHDeveloper.util;

public class ChatUtilities{
  
  public static void sendToConsole(String message){
    // TODO on send to console
  }
  
  private static String color(String format){
    return ChatColor.translateAllByChar('&', format);
  }
  
}