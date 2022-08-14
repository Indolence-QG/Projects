import top.indolence.domain.User;

public class MyTest {


    public static void main(String[] args) {
        String a="pwwkew";
        System.out.println(lengthOfLongestSubstring(a));
    }

    public  static  int lengthOfLongestSubstring(String s) {
        char[] chars =s.toCharArray();
        if(chars.length==1)
        {return 1;}
        int left=0,right=1;
        int i;int j;
        for( i=1;i<chars.length;i++)
        {

            boolean flag=false;
            for( j=left;j<right;j++)
            {
                if(chars[i]==chars[j])
                {flag=true;
                    break;
                }
                else
                {flag=false;}

            }
            if(flag){
                if(j==i-1)
                {left=right;}
                else
                {left++;}

                right++;
            }else{
                right++;
            }


        }
        return right-left;
    }


}




