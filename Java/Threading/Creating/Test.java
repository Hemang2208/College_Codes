// class A extends Thread{
//     public void run(){
//         for (int i=0;i<=3;i++){
//             for (int j=0;j<=i;j++){
//                 System.out.print("* ");
//             }System.out.println();
//         }
//     }
// }


class A extends Thread{
    public void run(){
        synchronized (System.out){    // ensures output don't interleave
            for (int i=0;i<=3;i++){
                for (int j=0;j<=i;j++){
                    System.out.print("* ");
                }System.out.println();
            }
        }
    }
}

class Test{
    public static void main(String args[]){
        A t1 = new A();
        A t2 = new A();
        t1.start();
        t2.start();
    }
}
