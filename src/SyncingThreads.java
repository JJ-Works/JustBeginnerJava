/*Race condition is when multiple thread tries to reach out for the same data, or data of a variable.
* To solve this we can use synchronised keyword to synchronise threads meaning only one thread can access the data at once.
*
* Let me explain what happens:
* > main method runs
* > executes thread obj.run
* > main thinks it executed everything and runs along
* > if printed at last it may not have finished every processes.
* > the currently running thread tries to reach for the variable at the same time sometimes collision of data recovery happens
* > lets say count var has 4 value and unfortunately two thread reached at once then both updates the var with 5 if ++ is done
* > then even if the one thread incremented the value the other thread just resets to 4.
*
*                                       main
*                                         |
*                            Thread1------|------ Thread2
*                               |         |          |
*                               |         |          |
*                               |         |          |
 *                              |         |          |
*                               |         |          |
*                               |      (stops)       |
*                               |                    |
*                              🔻                   🔻
*                         running                  running
*
* let's talk about states of thread
*
* 1> New => when new obj is created then it is in New state
* 2> Runnable state => when you hit start() method it get to runnable state before actually running in the cpu.
* 3> Running state => This is when the program is actually running in the cpu using in run() method.
* 4> Wait state => when you use sleep() or wait() method then it is in wait state. notify() should be used with wait method.
* 5> Dead state => when stop() method is used to stop the thread. Not actually recommended in software may cause problems.
*  */


class Counter{
    int count = 0;
    public void increase(){
        count++;
    }

}

public class SyncingThreads {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable runner1 = () ->
        {
            for (int i = 1 ; i< 1000 ;i++) c.increase();
        };

        Thread t1 = new Thread(runner1);
        t1.start();

        t1.join();
        System.out.println(c.count);
    }

}
