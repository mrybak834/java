package com.mrybak834.innerClasses;

public class NestedInnerClass {
    private int count;

    NestedInnerClass() {
        count = 5;

        Inner i = new Inner();
        int newCount = i.count;
        System.out.println(this.count);
        System.out.println(newCount);
    }

    public class Inner {
        public int count;

        Inner() {
            this.count = 2;
            NestedInnerClass.this.count = 1;
        }
    }
}

class Main {
    public static void main(String[] args) {
        NestedInnerClass outer = new NestedInnerClass();
        NestedInnerClass.Inner inner = outer.new Inner();

        // Won't work
        //NestedInnerClass.Inner inner = new NestedInnerClass.Inner();

    }
}
