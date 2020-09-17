public class WorkMan {
    String name;
    int paywork;
    int ageman;
    int WorkManNumber;
    WorkMan(){
        System.out.println("Hello");
    }
    public WorkMan(String name, int paywork, int ageman){

        this.name = name;
        this.paywork = paywork;
        this.ageman = ageman;
    }
    public void printname(){
        System.out.println(name);
    }
    public void printage(){
        System.out.println(ageman);
    }
    public void payUP(){
        if(ageman>40){
            paywork = paywork +5000;
            System.out.println("Paywork + 5000 = " + paywork);
        }
    }
    public int getNumber(int workManNumber){
      return WorkManNumber;
   }
   public void setNumber(int workManNumber){
        this.WorkManNumber = WorkManNumber;

   }



}


