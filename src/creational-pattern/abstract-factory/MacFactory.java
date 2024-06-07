public class MacFactory implements GUIFactory{
    @Override
    public Button creatButton() {
        return new MacButton();
    }

    @Override
    public Checkbox creatCheckbox() {
        return new MacCheckbox();
    }
}
