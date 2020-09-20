package howeworkzoo;

public class main {
    public static void main(String[] args){
        int runDistance = 200;
        int jumpHeight = 2;
        int swimDistance = 11;

        Cat cat = new Cat("Spok","grey",1,2,200);
        if (cat.move(runDistance) == true){
            System.out.println( cat.name +" good cat, run " +runDistance);
        }else {
            System.out.println(cat.name + " bad cat, not run " + runDistance);
        }
        if (cat.jump(jumpHeight) == true){
            System.out.println( cat.name +" good cat, jump " +jumpHeight);
        } else {
            System.out.println(cat.name + " bad cat, not jump " + jumpHeight);
        }
        if(cat.swimming(swimDistance)==false){
            System.out.println("Cat not swimming");
        }

        Dog dog = new Dog("Bobik", "Black",2, (int) 0.5,500,10);
        //dog.move(a);
        //dog.jump(b);
        //dog.swimming(c);
        if (dog.move(runDistance) == true){
            System.out.println( dog.name +" good dog, run " +runDistance);
        }else {
            System.out.println(dog.name + " bad dog, not run " + runDistance);
        }
        if (dog.jump(jumpHeight) == true){
            System.out.println( dog.name +" good dog, jump " +jumpHeight);
        } else {
            System.out.println(dog.name + " bad dog, not jump " + jumpHeight);
        }
        if(dog.swimming(swimDistance) == true){
            System.out.println("Good dog");
        }else {
            System.out.println("Dog drowned");
        }

        Dog dog2 = new Dog("Funtik","red",3,1, 653, 13);
        if (dog2.move(runDistance) == true){
            System.out.println( dog2.name +" good dog, run " +runDistance);
        }else {
            System.out.println(dog.name + " bad dog, not run " + runDistance);
        }
        if (dog2.jump(jumpHeight) == true){
            System.out.println( dog2.name +" good dog, jump " +jumpHeight);
        } else {
            System.out.println(dog2.name + " bad dog, not jump " + jumpHeight);
        }
        if(dog2.swimming(swimDistance) == true){
            System.out.println("Good dog");
        }else {
            System.out.println("Dog drowned");
        }


//убрал все в массив
        Animal[] zoo = {cat,dog,dog2};
            for (int i = 0; i< zoo.length; i++){
                if (zoo[i].move(runDistance) == true){
                    System.out.println( zoo[i].name +" good dog, run " +runDistance);
                }else {
                    System.out.println(zoo[i].name + " bad dog, not run " + runDistance);
                }
                if (zoo[i].jump(jumpHeight) == true){
                    System.out.println( zoo[i].name +" good dog, jump " +jumpHeight);
                } else {
                    System.out.println(zoo[i].name + " bad dog, not jump " + jumpHeight);
                }
                if(zoo[i].swimming(swimDistance) == true){
                    System.out.println("Good dog");
                }else if(zoo[i] == cat){
                    System.out.println("Cat not swimming");
                }else {
                    System.out.println("Dog drowned");
                }
            }

    }
}
