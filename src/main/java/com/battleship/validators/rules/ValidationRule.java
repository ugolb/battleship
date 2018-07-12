package com.battleship.validators.rules;

import com.battleship.exceptions.BattleFieldException;

public interface ValidationRule {

    /**
     * General interface method which runs applies validation rules
     * @throws BattleFieldException
     */
    void validate() throws BattleFieldException;
}
