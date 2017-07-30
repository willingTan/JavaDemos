import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * Created by DELL on 2017/7/30.
 */
public class weekThree {
    public static void main(String[] args)
    {
        //线程池的任务列表？
        ExecutorService a=Executors.newFixedThreadPool(3);
        a.submit(new MyRunable());
        a.submit(new MyRunable());
        a.submit(new MyRunable());
        a.shutdown();
    }
}
