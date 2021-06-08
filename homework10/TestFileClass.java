/**
 * @encoding UTF-8
 * @author WXF
 * @data 2021-06-07
 * @description �����嵥 12-12 ��ʾ��δ���һ�� File �����Լ����ʹ�� File ���еķ�����ȡ�������ԡ�
 * �������Ϊ�ļ� us.gif������һ�� File ��������ļ��洢�ڵ�ǰĿ¼�� image Ŀ¼�¡�
 */

package homework10;

public class TestFileClass {
  public static void main(String[] args) {
    java.io.File file = new java.io.File("image/us.gif");
    System.out.println("Does it exist? " + file.exists());
    System.out.println("The file has " + file.length() + " bytes");
    System.out.println("Can it be read? " + file.canRead());
    System.out.println("Can it be written? " + file.canWrite());
    System.out.println("Is it a directory? " + file.isDirectory());
    System.out.println("Is it a file? " + file.isFile());
    System.out.println("Is it absolute? " + file.isAbsolute());
    System.out.println("Is it hidden? " + file.isHidden());
    System.out.println("Absolute path is " +
      file.getAbsolutePath());
    System.out.println("Last modified on " +
      new java.util.Date(file.lastModified()));
  }
}