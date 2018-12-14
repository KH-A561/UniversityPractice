package ru.omsu.imit.course3.patterns.bridge.state;

public class ResultsState implements State {
    private Context context;

    public ResultsState(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }


    @Override
    public void execute() {
        if (context.getFirstController().getGameCharacter().getHitPoints() > 0) {
            System.out.println("First Player won");
            System.out.println(context.getFirstController().getGameCharacter());
            System.out.println(context.getSecondController().getGameCharacter());
        } else {
            System.out.println("Second Player won");
            System.out.println(context.getFirstController().getGameCharacter());
            System.out.println(context.getSecondController().getGameCharacter());
        }
    }
}
