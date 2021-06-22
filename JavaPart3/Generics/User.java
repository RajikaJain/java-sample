package JavaPart3.Generics;

public class User implements Comparable<User>{
























//cOMPARABLE INTERFACE, GENERIC METHODS,GENERIC CLASSES AND INHERITANCE
//public class User implements Comparable<User>{
    private int points;
 public User(int points){
     this.points = points;
 }
    @Override
    public int compareTo(User other) {
        // TODO Auto-generated method stub
        //this < o -> -1
        //this== o -> 0
        //this > o -> 1
        return points - other.points;
    }

    //GENERIC METHODS
    @Override
    public String toString() {
        return "Points = "+points;
    }
    
}
