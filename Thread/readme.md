# Java Threads
## Introduction
### process
- Each JVM runs its own process and has its own **heap** memoty.
- no two java process can share the memory space.
- processes are the single unit of execution.

### Thread
- Each process can have multiple thread.
- Each thread has a stack of its own. (thread stack)

## Creating Thread

1. By extending the Thread Class and using the insatnce of it. We need to override the run method of runnable. 
	
	```
	public static void main(String[] args) {
        System.out.println("hello from the main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();
    }

    private static class AnotherThread extends java.lang.Thread{
        @Override
        public void run() {
            System.out.println("hello from another thread");
        }
    }
    ```

 * we can use a instance of subclass for creating a thread only once. If, we want to create another thread from the same subclass we will need to create new instance of the subclass
 
 we can also create a instance of Thread class using anonymous class
 like below - 
 
 ```
 new Thread() {
            @Override
            public void run() {
                System.out.printf("hello from anonymous class thread");
            }
        }.start();
   ```

2. By implementing the Runnable interface
 * Thread class itself implements Runnable
 * if we want to give our own Runnable we can give it in the Thread Constructor like below

```
 private static class MyRunnableThread implements Runnable{
        @Override
        public void run() {
            System.out.println("hello from Runnable Thread");
        }
    }
 Thread myRunnableThread = new Thread(new MyRunnableThread);
 myRunnableThread.start();
```
instead of giving a class we can use
Anonymous class like below -  

```
Thread myRunnableThread = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("hello from Runnable Thread");
            }
        });
        myRunnableThread.setName("__MyRunnableThread__");
        myRunnableThread.start();
```
furthur we can also replace it by 
lambda (it is used with functional interface) like below - 

```
Thread myRunnableThreadWithLambda = new Thread(() -> System.out.println("hello from Runnable Thread"));
        myRunnableThreadWithLambda.setName("__MyRunnableThreadWithLambda__");
        myRunnableThreadWithLambda.start();
```

### setting the name of the thre
we can set the name of the thread using 
**setName("thread_name")** method of thread

and, inside the run() method we can also get the name of the thread using 
**currentThread.getName()**

### Question :- why do we call start method of Thread intead of calling run() method directly?

reason - The run() method is just an ordinary method (overridden by you). As with any other ordinary method and calling it directly will cause the current thread to execute run().

All magic happens inside start(). The start() method will cause the JVM to spawn a new thread and make the newly spawned thread execute run().

example - 

```
Thread myRunnableThread = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("hello from Runnable Thread+ " "+ currentThread().getName()");
            }
        });
        myRunnableThread.setName("--MyRunnableThread--");
        myRunnableThread.start();
```
output - hello from Runnable Thread --MyRunnableThread--

directly calling the run Method.

```
Thread myRunnableThread = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("hello from Runnable Thread"+ " "+ currentThread().getName());
            }
        });
        myRunnableThread.setName("--MyRunnableThread--");
        myRunnableThread.run();
```
output - hello from Runnable Thread main         

## Sleep, Interrrupt and Join

- Thread.sleep(timeUnit) -> it stops the execution of the the thread for the specified timeUnit. Thread. sleep causes the current thread to suspend execution for a specified period. This is an efficient means of making processor time available to the other threads of an application or other applications that might be running on a computer system.


```
Thread putThisToSleep = new Thread(()->{
            try{
                Thread.sleep(3000);
                System.out.println("have put this thread to sleep");
            } catch (InterruptedException e){
                System.out.println("interrupted while sleepinfg");
            }
        });
        putThisToSleep.start();
```
output -> have put this thread to sleep

- Thread.interrupt() -> it is used to interrupt any sleeping or waiting thread and set throws the InterruptedException and it also sets the interrupt flag for that thread to true. 

**Example**


if called interrupt over that thread

```
putThisToSleep.interrupt();
```
output -> interrupted while sleeping

- Thread.join() -> ava.lang.Thread class provides the join() method which allows one thread to wait until another thread completes its execution. If t is a Thread object whose thread is currently executing, then t.join() will make sure that t is terminated before the next instruction is executed by the program.
If there are multiple threads calling the join() methods that means overloading on join allows the programmer to specify a waiting period. However, as with sleep, join is dependent on the OS for timing, so you should not assume that join will wait exactly as long as you specify.

```
Thread putThisToSleep = new Thread(()->{
            try{
                Thread.sleep(3000);
                System.out.println("have put this thread to sleep");
                currentThread().setName("calledThread");
                System.out.println(currentThread().getName()+" is executing");
            } catch (InterruptedException e){
                System.out.println("interrupted while sleeping");
            }
        });
        putThisToSleep.start();
        // putThisToSleep.interrupt();

        // join
        Thread useJoinThread = new Thread(()->{
            System.out.println("this join thread will execute after the put this to sleep has been executed");
            currentThread().setName("calling thread");
            try{
                putThisToSleep.join();
            } catch (InterruptedException e){
                System.out.println("interrupted while sleeping");
            }
            System.out.println(currentThread().getName()+" is getting executed");
        });
        useJoinThread.start();
```


