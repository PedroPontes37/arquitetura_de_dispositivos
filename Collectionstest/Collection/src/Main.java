import java.util.*;

public class Main {
    public static void main(String[] args) {

        Stadium s1= new Stadium("Luz","Portugal",64000);
        Team t1 = new Team("Benfica", 1,1,s1);
        Stadium s2=new Stadium("Dragao","Portugal",47000);
        Team t2 = new Team("porto", 2,2,s2);

        ArrayList<Team> teamArrayList= new ArrayList<Team>();
        teamArrayList.add(t1);
        teamArrayList.add(t2);

        System.out.println(teamArrayList.toString());


        Vector<Stadium> stadiumVector= new Vector<Stadium>();
        stadiumVector.add(s1);
        stadiumVector.add(s2);

        System.out.println(stadiumVector.toString());
        Stadium first= stadiumVector.get(0);

        boolean contains= stadiumVector.contains(s1);

        Stack<Team>teamStack= new Stack<Team>();
        teamStack.push(t1);
        teamStack.push(t2);

        Team peekTeam= teamStack.peek(); //mostra o primeiro valor
        Team popTeam= teamStack.pop(); // mostra mas retira o primeiro valor

       while(!teamStack.empty()) {
           teamStack.pop();
       }

        List<Team> stadiumList= new LinkedList<Team>();
        stadiumList.add(t1);
        stadiumList.add(t2);

        Iterator<Team> stadiumIterator= stadiumList.iterator();

        System.out.println("Iterator:");
        while (stadiumIterator.hasNext()){
            Team next = stadiumIterator.next();
            System.out.println(next.getStadium());
            if(next.getStadium().getCapacity() < 60000){
                stadiumIterator.remove();
            }
        }

        for (Team team: teamArrayList
             ) {
            System.out.println(team.toString());

        }

        for (Stadium stadium:stadiumVector
             ) {
            System.out.println(stadium.toString());

        }


        Map<String,Stadium> stadiumMap= new HashMap<String,Stadium>();
        stadiumMap.put(s1.getName(),s1);
        stadiumMap.put(s2.getName(),s2);

        if(stadiumMap.containsKey("Luz")){
            Stadium ss = stadiumMap.get("Luz");
        }

        Set<String> Keys=stadiumMap.keySet();
        for (String key:Keys) {
            System.out.println(key);
        }



    }
}