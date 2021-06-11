package JavaPart2.Inheritances;

public class TextBox1 extends UIControl {
    private String text="";
    
    // public TextBox1()
    // {   super(true);
    //    // this.isEnabled= true;
    //     System.out.println("Textbox1");}
    @Override
    public void render()
    {
        System.out.println("Render TextBox");
    }
    @Override
    public String toString(){
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void clear() {
        this.text ="";
    }

}
