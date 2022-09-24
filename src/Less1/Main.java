package Less1;

public class Main {
    public static void main(String[] args) {

        Players[] players= new Players[4];
        players[0]= new Players("Vasiliy", 20,30);
        players[1]= new Players("Stepan",15,25);
        players[2]= new Players("Dmitriy",1, 2);
        players[3]= new Players("Vladimir",30,40);
        Team team= new Team("team1",players);

        Barrier[]barrier= new Barrier[2];
        barrier[0]= new Barrier("race",10);
        barrier[1]=new Barrier("wall",35);

        Course course= new Course("Midl Race",barrier);

        String result= course.Start(team);
        System.out.println(result);
    }
}
