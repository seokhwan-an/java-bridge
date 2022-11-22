package bridge.view;

public class View {

    private InputView inputView;
    private OutputView outputView;

    public View(InputView inputView, OutputView outputView){
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public InputView getInputView() {
        return inputView;
    }

    public OutputView getOutputView() {
        return outputView;
    }
}