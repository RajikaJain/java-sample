package JavaPart2.Interfaces;
//interface segregation principal

public class Dragger {
    public void drag(Draggable draggable)
    {
        draggable.drag();
        System.out.println("Dragging done!");
    }
    
    
}
