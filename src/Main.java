public class Main {
    public static void main(String[] args) {
        car car1 = new car ();
        car1.model = "Ferrari";
        car1.power = "250 hors power";
        car1.colour = "blue";
        car1.maxspeed = "320 km/h";
        car1.price = "250 thousand's of american dollars";
        System.out.println(" model: " + car1.model + "; power: "+ car1.power + "; colour :"+ car1.colour + "; maxspeed: "+ car1.maxspeed + "; price:" + car1.price);
        car1.go ();
        car1.park();

        System.out.println();

        car car2 = new car();
        car2.model = "Djiguli";
        car2.power = "70 hors power";
        car2.colour = "lactic";
        car2.maxspeed = "180 km/h";
        car2.price = "2 thousand's of american dollars";
        System.out.println(" model: " + car2.model + "; power: "+ car2.power + "; colour :"+ car2.colour + "; maxspeed: "+ car2.maxspeed + "; price:" + car2.price);
        car2.go ();
        car2.cantpark();

        System.out.println();

        car car3 = new car();
        car3.model = "Tulpar Karrager KG";
        car3.power = "150 hors power";
        car3.colour = "black";
        car3.maxspeed = "260 km/h";
        car3.price = "100 thousand's of american dollars";
        System.out.println(" model: " + car3.model + "; power: "+ car3.power + "; colour :"+ car3.colour + "; maxspeed: "+ car3.maxspeed + "; price:" + car3.price);
        car3.go ();
        car3.park();

        System.out.println();

        Person person = new Person();
        person.name= "ali";
        person.DateOfBitrh = 1998;
        System.out.println("name:"+ person.name);
        person.getage();
    }

}