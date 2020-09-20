package howeworkzoo;

public abstract class Animal {
    protected String name;
    protected int age;
    protected  String color;
    protected int maxRunDistance;
    protected int maxJumpHeight;
   // protected boolean beSwimming;

    public Animal(String name, String color, int age, int maxJumpHeight, int maxRunDistance /*,boolean beSwimming*/){
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
       // this.beSwimming = beSwimming;

    }

    boolean move(int rundistance){
        if(rundistance<=maxRunDistance){
            return true;}
        return false;
       // System.out.println(name + " run " + rundistance + "good animal");
    }
    boolean jump(int height){
        if(height<=maxJumpHeight){
            return true;}
        return false;
    }
   abstract boolean swimming(int distance);



}
