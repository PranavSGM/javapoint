package Binding;

/**
 * Created by pjai58 on 11/2/2017.
 */



    class AnimalD {
    int x = 23;
    void access(){System.out.println("Animal access ....");}
    void self(){ System.out.println("Animal independant method ... ");}
    }

    class Dog3 extends AnimalD {
        int s =23;
        void access(){System.out.println("Dogs Access ....");}

        static void method(AnimalD a) {

                Dog3 d = (Dog3) a;//downcasting
            System.out.println(d instanceof Dog3);
            System.out.println(d instanceof AnimalD);
            d.access();
            d.self();


                System.out.println("ok downcasting performed");


        }

        public static void main(String[] args) {
            AnimalD a = new Dog3();
           // AnimalD d = new AnimalD();
           /* Dog3 d = new Dog3();
            d.method(a);*/
            Dog3.method(a);
        }

    }
