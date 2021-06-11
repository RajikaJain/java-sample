package JavaPart2.Inheritances;

public abstract class UIControl {

    private boolean isEnabled = true;
    protected boolean isEnabled1 = true;
    final public void enable(){
        isEnabled = true;
    }
    public void disable(){
        isEnabled = false;
    }
    public boolean isEnabled(){
        return isEnabled;
    }
    public abstract void render();
    // public UIControl(boolean isEnabled){
    //     this.isEnabled=isEnabled;
    //     System.out.println("UI Control");
    // }
    
}
