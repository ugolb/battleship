package sanduku.battleship.validators;

import sanduku.battleship.exceptions.BattleFieldException;

public interface Validator {

    /**
     * General interface method which runs applies validation rules
     * @throws BattleFieldException
     */
    void validate() throws BattleFieldException;
}
