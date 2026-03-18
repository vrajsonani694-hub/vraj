class autosave extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Auto-saving in background....");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}
public class DaemonDemo
{
    public static void main(String[] args)
    {
        autosave t = new autosave();
        t.setDaemon(true);
        t.start();
        for(int i=1;i<=5;i++)
        {
            System.out.println("main task running...."+i);
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e){}
        }
        System.out.println("main task finished.");
    }
}