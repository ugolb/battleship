package com.battleship.validators;

import com.battleship.exceptions.BattleFieldException;

public interface Validator {

    /**
     * General interface method which runs applies validation rules
     * @throws BattleFieldException
     */
    void validate() throws BattleFieldException;
}
