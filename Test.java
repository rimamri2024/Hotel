
public class Test {
    public static void main(String[] args) {

      Hotel h1=new Hotel("Mariem","sidi bouzid",20,3);
        Hotel h2=new Hotel("The gold","Benzaret",30,7);

        h1.afficher();
        h2.afficher();

        System.out.println("le nombre total de hotel est "+Hotel.nombre);
        Reservation R1=new Reservation(1,h1,3);

        R1.afficherreser();
        Reservation R2=new Reservation(8,h2,5);
        R2.afficherreser();





    }
}