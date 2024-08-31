public class CapitalizeString {
    public static void main(String[] args){
            String str = "i am himanshu joshi  hi";
           String str1 = "";
            str1 += Character.toUpperCase(str.charAt(0));
            for(int i = 1 ; i < str.length() ; i++){
              Character  ch = str.charAt(i);
             if(ch == ' ' && i!=str.length()-1){
              str1 += ch;
                i++;
              str1 += Character.toUpperCase(str.charAt(i));
             }
           else{
            str1 += str.charAt(i);
           }
            }
            System.out.println(str1);

    
}
}
