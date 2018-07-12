package com.battleship.validators.rules;

import com.battleship.dtos.BattleFiledCell;
import com.battleship.exceptions.BattleFieldException;

public class CellIndexValidationRule implements ValidationRule {
    private static final int MAX_INDEX = 9;
    private static final int MIN_INDEX = 0;
    private static final String INVALID_COORDINATES_ERR_MSG = "Invalid coordinates is assigned. " +
            "Horizontal = \"%s\" / Vertical = \"%s\". Minimum is \"0\" / Maximum is \"9\"";
    private BattleFiledCell battleFiledCell;

    public CellIndexValidationRule(BattleFiledCell battleFiledCell) {
        this.battleFiledCell = battleFiledCell;
    }

    @Override
    public void validate() throws BattleFieldException {
        int horizontalCoordinate = battleFiledCell.getHorizontalCoordinate();
        int verticalCoordinate = battleFiledCell.getVerticalCoordinate();

        checkCoordinates(horizontalCoordinate, verticalCoordinate);
    }

    private void checkCoordinates(int horizontalCoordinate, int verticalCoordinate){
        if(isNotInAllowedRange(horizontalCoordinate) || isNotInAllowedRange(verticalCoordinate)){
            throw new BattleFieldException(String
                    .format(INVALID_COORDINATES_ERR_MSG, horizontalCoordinate, verticalCoordinate));
        }
    }

    /**
     * Returns true if passed coordinate out of allowed range
     * @param coordinate - coordinate which need to be checked
     * @return true / false
     */
    private boolean isNotInAllowedRange(int coordinate){
        return coordinate < MIN_INDEX || coordinate > MAX_INDEX;
    }
}
