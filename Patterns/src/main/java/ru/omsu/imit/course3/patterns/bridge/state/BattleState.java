package ru.omsu.imit.course3.patterns.bridge.state;

import ru.omsu.imit.course3.patterns.bridge.CharacterController;

public class BattleState implements State {
    private Context context;

    public BattleState(Context context) {
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
        CharacterController firstController = context.getFirstController();
        CharacterController secondController = context.getSecondController();
        while (firstController.getGameCharacter().getHitPoints() > 0 && secondController.getGameCharacter().getHitPoints() > 0) {
            firstController.getGameCharacter().attack(secondController.getGameCharacter());
            secondController.getGameCharacter().attack(firstController.getGameCharacter());
        }
        context.setState(new ResultsState(context));
    }
}
