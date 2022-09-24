package Less1;

public class Course {

    private String name;
    private Barrier[] barrier;
    String result;
    public Course(String name, Barrier[] barrier) {
       this.name = name;
        this.barrier = barrier;
    }

    public String Start(Team team) {
        result = "Команда " + team.getName() + "" + '\n';
        for (Players player : team.getPlayer()) {
            result += "Имя участника " + player.getName() + "" + '\n';
            int value = player.getCanRun();
            int value1= player.getCanJump();
            testRace(value);
            testWall(value1);
        }
        return result;
    }

    public  void  testWall(int value1){
            if(value1 > barrier[1].getBar() ){
            result+="Прыжки-дистанция пройдена" + '\n';
        }
        else { result+="Прыжки-дистанция не пройдена" + '\n';

        }
    }

    public  void testRace(int value) {
        if (value > barrier[0].getBar()) {
            result += "Бег-дистанция  пройдена" + '\n';
        } else {
            result += "Бег-дистанция не пройдена" + '\n';
        }
    }
}
