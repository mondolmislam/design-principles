public class WindowsFactory implements GUIFactory{
    @Override
    public Button creatButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox creatCheckbox() {
        return new WindowsCheckbox();
    }
}
