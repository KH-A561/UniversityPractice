package ru.omsu.imit.course3.patterns.bridge.state;

import ru.omsu.imit.course3.patterns.bridge.CharacterController;

public class Context {
    private State state;
    private CharacterController firstController;
    private CharacterController secondController;

    public Context(State state, CharacterController firstController, CharacterController secondController) {
        this.state = state;
        this.firstController = firstController;
        this.secondController = secondController;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public CharacterController getFirstController() {
        return firstController;
    }

    public void setFirstController(CharacterController firstController) {
        this.firstController = firstController;
    }

    public CharacterController getSecondController() {
        return secondController;
    }

    public void setSecondController(CharacterController secondController) {
        this.secondController = secondController;
    }

    public void execute() {
        state.execute();
    }
}
