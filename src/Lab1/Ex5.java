package Exercitii;

public class Ex5 {
    static void main() {
        int x=1;
        String []names={"Fred","Jim","Sheila"};
        names[--x]+=".";
        for(int i=0;i<names.length;i++)
            System.out.println(names[i]);
    }
}
