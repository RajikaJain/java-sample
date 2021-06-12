package JavaPart2.Interfaces;

//interface segregation principal
public interface UIWidget extends Draggable,Resizeable{
//void resize(int size);
void render();
    
}

