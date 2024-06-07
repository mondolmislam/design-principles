public class App {
    private Button button;
    private Checkbox checkbox;

    public App(GUIFactory guiFactory){
        this.button=guiFactory.creatButton();
        this.checkbox=guiFactory.creatCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
