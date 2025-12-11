class A implements Runnable{
    public void run(){
        for (int i=0;i<=3;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}

class Test{
    public static void main(String srgs[]){
        Runnable obj = new A();             // create a runnable object (task)
        Thread t1 = new Thread (obj);      // pass it to Thread and make it execute (thread is the worker obj is the task   )
        t1.start();
    }
}