package sanduku.battleship.validators.rules;

import sanduku.battleship.exceptions.BattleFieldException;

public interface ValidationRule {

    /**
     * General interface method which runs applies validation rules
     * @throws BattleFieldException
     */
    void validate() throws BattleFieldException;
}
