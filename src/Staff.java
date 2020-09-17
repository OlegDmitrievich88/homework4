public class Staff {
    public static void main(String[] args) {
    WorkMan one = new WorkMan("qwerty", 40, 45);
    //one.name = "qwerty";
    //one.paywork = 40;
    //one.ageman = 45;
    System.out.printf("Name %s, paywork %d, Age %d\n",one.name,one.paywork,one.ageman);
    one.printname();
    one.printage();
        WorkMan[] AllStaff = new WorkMan[5];
        AllStaff[0] = new WorkMan("c3po", 400,40);
        AllStaff[1] = new WorkMan("R2D2", 400, 45);
        AllStaff[2] = new WorkMan("mrSpok", 400, 39);
        AllStaff[3] = new WorkMan("Dart", 400,49);
        AllStaff[4] = new WorkMan("Dobi", 400, 51);
        for (int i = 0; i< AllStaff.length; i++){
            if(AllStaff[i].ageman>40){
                System.out.printf("Name %s, paywork %d, Age %d\n",AllStaff[i].name,AllStaff[i].paywork,AllStaff[i].ageman );
                AllStaff[i].payUP();
            }
        }
        double sum = 0;
        for (int i = 0; i< AllStaff.length; i++){
            sum = sum +(AllStaff[i].paywork + AllStaff[i].ageman) ;

                    }
        System.out.println("Среднее арифметическое: "+ sum/ (AllStaff.length*2));

        int WorkManNumber = 0; // пытался сделать 8 задагие и получилось что ничего е получилось(совсем запутался)
        for (int i = 1; i< AllStaff.length-1; i++){
            WorkManNumber = i++;
            AllStaff[i].getNumber(WorkManNumber);
            //AllStaff[i].setNumber(WorkManNumber);

        }
       // System.out.printf("Name %s, paywork %d, Age %d, number %d\n",AllStaff[i].name,AllStaff[i].paywork,AllStaff[i].ageman,AllStaff[i].WorkManNumber );

        //setNumber(WorkManNumber);
    }

}

