package lr3.Task5;

import java.util.HashMap;

public class Example1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hMap = new HashMap<Integer, String>();
        String str = "str strokaa stroka strokka aaaaaaaa sd test python bimbimbambam nicebimbim";
        int k = 0;
        for (String i : str.split(" "))
        {
            hMap.put(k++, i);
        }
        for (var i: hMap.keySet()) {
            if(i>5) {
                System.out.print(hMap.get(i) + " ,");
                System.out.println(i);
            }
        }
        System.out.println();
        int sum = 1;
        for (var i: hMap.keySet()) {
            if(hMap.get(i).length() > 5)
            {
                System.out.println(i);
                sum = i*sum;
            }
        }
        System.out.println(sum);
    }
}
