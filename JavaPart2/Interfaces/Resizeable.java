package JavaPart2.Interfaces;
//interface segregation principal

public interface Resizeable {
    void resize(int size);
    void resize(int x, int y);
    void resizeTo(UIWidget widget);
    
}
