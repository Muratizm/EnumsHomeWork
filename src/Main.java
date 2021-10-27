public class Main {


    public static void main(String[] args) {



        Planet earth = Planet.Earth;


        checkIsAlivable(earth);


    }

    public static void checkIsAlivable(Planet planet) {


        switch(planet) {

            case Earth:

                System.out.println("You can live here");
                System.out.println("Number of planet: " +planet.number);
                break;
            case Mars:
                System.out.println("You cannot live here");
                break;

            case Neptune:
                System.out.println("You cannot live here");
                break;
            case Mercury:
                System.out.println("You cannot live here");
                break;
            case Pluto:
                System.out.println("You cannot live here");
                break;
            case Venus:
                System.out.println("You cannot live here");
                break;
            case Uranus:
                System.out.println("You cannot live here");
                break;
            case Jupiter:
                System.out.println("You cannot live here");
                break;
            default:
                System.out.println("a beatiful blank space.");
                break;

        }


    }



}
