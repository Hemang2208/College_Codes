class Add {
    int x, y, z, w;

    // Method Overloading :: more than one Method of same name present in the same
    // class
    // identification on the basis of list of arguemnets
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    void display() {
        System.out.println(this.x + "\t" + this.y + "\t" + this.z + "\t" + this.w);
    }

    Add(int x, int y, int z, int w) { // constructor
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
}

class B extends Add {
    int a, b, c, d;
    // Method Overriding :: same method in both parent and child class but upon
    // calling child class's function definition is called
    // same prototype should be there in boyh parent and child class

    void display() {
        System.out.println(this.a + "\t" + this.b + "\t" + this.c + "\t" + this.d);
    }

    B(int x, int y, int z, int w, int a, int b, int c, int d) { // constructor
        super(x, y, z, w); // use of super keyword to call constructor of parent class
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}

class Test {
    public static void main(String args[]) {

        Add obj = new Add(1, 2, 3, 4);
        System.out.println(obj.add(obj.x, obj.y));
        System.out.println(obj.add(obj.x, obj.y, obj.z));
        System.out.println(obj.add(obj.x, obj.y, obj.z, obj.w));
        obj.display();
        
        Add obj1 = new B(1, 2, 3, 4, 5, 6, 7, 8); // Upcasting
        obj1.display();

        // System.out.println(obj.x);
        // System.out.println(obj1.x); // upcasting allows to call the new definition of the method
        //                             //
        // System.out.println(obj1.y); // we can also access instance variables
        // System.out.println(obj1.z); // of parent class while upcasting
        // System.out.println(obj1.w); // unless there are two or more instance variables name common in parent and
                                    // child class
    }
}