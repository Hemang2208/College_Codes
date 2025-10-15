import java.util.*;
class sum_avg{
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    int s=0;
    void input(){
        System.out.print("Enter array elements (5)");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
    }
    int sum(){
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        return s;
    }
    double avg(){
        int sum=sum(a);
        return sum/a.length;
    }
    public static void main(String[]args){
        sum_avg obj=new sum_avg();
        obj.input();
        System.outt.println("Enter 1 for sum of elements \n 0 for Average of elements");
        int c=sc.nextInt();
        switch(c){
            case 0:
                System.out.println("Average of elements is:"+obj.avg());
                break;
            case 1:
                System.out.println("Sum of elements is:"+obj.sum());
                break;   
            default:
                System.out.println("INVALID INPUT!");
                break;     
        } 
    }
}