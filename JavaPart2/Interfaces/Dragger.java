package JavaPart2.Interfaces;

public class Dragger {
    public void drag(UIWidget widget)
    {
        widget.drag();
        System.out.println("Dragging done!");
    }
    
}
