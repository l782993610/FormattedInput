
import java.util.Scanner;


/**
 * Created by MaksSklyarov on 04.05.17.
 */
public class FormattedInput {

    public static Object[] scanf(String format)

    {
        Object [] data = new Object[255];
        Object [] test = new Object[255];
        String tmp;
        int i = 0;
        int d = 0;
        String t1;
        StringBuilder a = new StringBuilder();
        Scanner dataInputStream = new Scanner(System.in);

        while(format.length() >= (i+2)){
            tmp = format.substring(i,i+2);
            switch (tmp){
                case("%d"):
                    System.out.println("Предоставлен спецификатор ввода '%d', введи Integer");
                 if(dataInputStream.hasNext()) {
                     test[d] = tryParseInt(dataInputStream.next());
                     if(test[d]!=null){data[d] = test[d];
                     }
                     else{break;}
                     i++;
                     i++;
                     d++;
                 }
                    else{break;}

                break;
                case("%s"):
                    System.out.println("Предоставлен спецификатор ввода '%s', введи че угодно");
                    if(dataInputStream.hasNext()){
                        data[d] = tryParseString(dataInputStream.next());
                    i++;
                    i++;
                    d++;}
                    else{break;}
                    break;
                default:
                    System.out.println("sry");
                    break;
                case("%f"):
                    System.out.println("Предоставлен спецификатор ввода '%f', введи Double");
                    if(dataInputStream.hasNext()) {
                        test[d] = tryParseDouble(dataInputStream.next());
                        if(test[d]!=null){data[d] = test[d];
                        }
                        else{break;}
                        i++;
                        i++;
                        d++;
                    }
                    else{break;}

                    break;
                case("%c"):
                    System.out.println("Предоставлен спецификатор ввода '%c', введи Char");
                    if(dataInputStream.hasNext()) {
                        test[d] = tryParseChar(dataInputStream.next());
                        if(test[d]!=null){data[d] = test[d];
                        }
                        else{break;}
                        i++;
                        i++;
                        d++;
                    }
                    else{break;}

                    break;

            }

        }




            return data;




    }
    public static Integer tryParseInt(String s) {
        try {
            return new Integer(s);
        } catch (NumberFormatException e) {
            return null; // не-а, не int
        }
    }
    public static Double tryParseDouble(String s) {
        try {
            return new Double(s);
        } catch (NumberFormatException e) {
            return null; // не-а, не double
        }
    }
    public static Character tryParseChar(String s) {
        try {
            if(s.length()>1){return null;}
            return s.charAt(0);
        } catch (NumberFormatException e) {
            return null; // не-а, не double
        }
    }
    public static String tryParseString(String s) {
        return s; // всегда подходит
    }

}
