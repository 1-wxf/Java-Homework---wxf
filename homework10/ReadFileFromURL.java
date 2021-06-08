/**
 * @encoding UTF-8
 * @author WXF
 * @data 2021-06-07
 * @description 程序清单 12-17 提示用户输人一个 URL, 然后显示文件的大小。
 */

package homework10;

import java.util.Scanner;

public class ReadFileFromURL {
  public static void main(String[] args) {
    System.out.print("Enter a URL: ");   
    String URLString = new Scanner(System.in).next();
       
    try {
      java.net.URL url = new java.net.URL(URLString); 
      int count = 0;
      Scanner input = new Scanner(url.openStream());
      while (input.hasNext()) {
        String line = input.nextLine();
        count += line.length();
      } 
      
      System.out.println("The file size is " + count + " characters");
    }
    catch (java.net.MalformedURLException ex) {
      System.out.println("Invalid URL");
    }
    catch (java.io.IOException ex) {
      System.out.println("IO Errors");
    }
  }
}   
