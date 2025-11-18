class A{
    void m(){
        System.out.println("A");
    }
    void m1(){
        System.out.println("m1");
    }
}

class B extends A{
    void m(){
        System.out.println("B");
    }

    void m2(){
        System.out.println("m2");
    }
}

class main{
    public static void main(String args[]){
        B obj = new B();
        obj.m();
        obj.m1();
        obj.m2();
    }
}