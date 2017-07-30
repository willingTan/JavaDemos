/**
 * Created by DELL on 2017/7/30.
 */
public class MyRunable implements Runnable
{
    @Override
    public void run()
    {
        for(int x=0;x<100;x++)
        {
            System.out.println(Thread.currentThread().getName()+":"+x);
        }
    }
}
