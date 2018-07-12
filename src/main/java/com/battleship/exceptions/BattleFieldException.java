package com.battleship.exceptions;

public class BattleFieldException extends RuntimeException {

    public BattleFieldException() {
        super();
    }

    public BattleFieldException(String message) {
        super(message);
    }
}
