
     import java.io.*;
  class files {
    public static void main(String[] args) {
        String strr = "jklmno";
        int len = strr.length();
        char c[] = new char[len];
        strr.getChars(0,len,c,0);
     CharArrayReader obj1 = new CharArrayReader(c);
     CharArrayReader obj2 = new CharArrayReader(c, 0, 3);
           int i;
           try {
                 while ((i = obj1.read()) != -1) {
                   System.out.print((char)i);    }
                  }
           catch (IOException e) {
            System.out.print(e);    }
    }
   }
