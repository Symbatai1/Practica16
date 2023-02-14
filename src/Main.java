public class Main {
    public static void main(String[] args){


        Technique phone= new Phone("Samsung","Samsung", "Su",2009);
        Technique phone2= new Phone("Mi","Mi", "Redmi",2022);
        System.out.println(phone);
        System.out.println(phone2);
phone.turnOn();
phone2.turnOff();
        System.out.println();
        Technique computer=new Computer("Aplle","App",2023,"Apple");
        Technique computer2=new Computer("MAC","MAC",2029,"AP");
        System.out.println(computer);
        System.out.println(computer2);
computer.turnOff();
computer2.turnOn();
        System.out.println();
        Technique smartWatch=new SmartWatch("Mi","XMi",2020,"black");
        Technique smartWatch2=new SmartWatch("XIOMI","Mi",2050,"red");
        System.out.println(smartWatch);
        System.out.println(smartWatch2);
        smartWatch.turnOn();
        smartWatch2.turnOff();
       
        }

    }
