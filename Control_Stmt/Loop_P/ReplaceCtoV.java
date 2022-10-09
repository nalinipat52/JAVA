package Loop_P;

public class ReplaceCtoV {
    public static void main(String[] args) {
        String str = "java is fun";
        String s = "";
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
               // s = str.replace(ch, 'x');
                s+='x';
            }
            else
            {
                s+=ch;
            }
            //System.out.println(s);
        }

        System.out.println(s);
    }
}
