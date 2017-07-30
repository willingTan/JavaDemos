import java.util.Random;
import java.util.Scanner;

/**
 * Created by DELL on 2017/7/29.
 */
public class demoTwo {
    public static int getrandom()
    {
        Random r=new Random();
        int a=r.nextInt(1000);
        return a;
    }
    public static int judge(int a)
    {
        int c=0;
        System.out.println("请输入你猜的数：");
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        if(b<a) c=-1;
        else if(b>a) c=1;
        else if(a==b) c=0;
        return c;
    }

    public static void caozuo(String s1)
    {
        switch (s1)
        {
            case "开始":
                int a;
                a=getrandom();
                //System.out.println(a);
                for(int i=1;;i++)
                {
                    int c=judge(a);
                    if(c==-1)System.out.println("猜小了");
                    else if(c==1)System.out.println("猜大了");
                    else if(c==0)
                    {
                        System.out.println("恭喜猜对了，你一共猜了"+i+"次");
                        break;
                    }
                }
                break;
            case "结束":
                System.out.println("退出游戏");
                break;
            case "再来一次":
                int b;
                b=getrandom();
                for(int i=1;;i++)
                {
                    int d=judge(b);
                    if(d==-1)System.out.println("猜小了");
                    else if(d==1)System.out.println("猜大了");
                    else if(d==0)
                    {
                        System.out.println("恭喜猜对了，你一共猜了"+i+"次");
                        break;
                    }
                }
                break;
            default:
                System.out.println("请输入正确的命令");
                break;
        }
    }
    public static void main(String[] args)
    {
        //int a;
        //a=getrandom();
        //System.out.println(a);
        boolean a=true;
        while (a)
        {
            System.out.println("请输入你想进行的操作（开始，结束，再来一次）：");
            Scanner s = new Scanner(System.in);
            String s1 = s.nextLine();
            if(s1.equals("结束"))
            {
                System.out.println("退出游戏");
                break;
            }
            caozuo(s1);
        }
    }
}
