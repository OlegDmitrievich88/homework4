package howeworkzoo;

public class Dog extends Animal{
    int maxSwimDistance;

    public Dog(String name,String color, int age, int maxJumpHeight, int maxRumDistance,int maxSwimDistance){
            super(name, color, age,maxJumpHeight ,maxRumDistance);
        this.maxSwimDistance = maxSwimDistance;

    }
    @Override
    boolean swimming(int distance) {
        if (distance <= maxSwimDistance) {
            return true;
        }
        return false;
    }


}
