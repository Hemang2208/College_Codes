class A extends Thread{
    public void run(){
        synchronized (System.out){
        for (int i=0;i<=5;i++){
            System.out.print("1"+" ");
        }
    }}
}
class B extends Thread{
    public void run(){
        synchronized (System.out){
        for (int i=0;i<=5;i++){
            System.out.print("2"+" ");
        }
    }}
}

class Test{
    public static void main(String args[]){
        Thread t1 = new A();
        Thread t2 = new B();
        t1.start();
        // try {
        //     t1.join();
        // } catch (InterruptedException e) {
        //     System.out.println(e);
        // }
        t2.start();
    }
}


// either use synchronized block or join() to avoid intereleaving 