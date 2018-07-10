package sanduku.battleship.validators.rules;

import org.junit.Test;
import sanduku.battleship.exceptions.BattleFieldException;
import sanduku.battleship.helper.TestDataGenerator;

public class CellIndexValidationRuleTest {

    @Test
    public void shouldNotThrowException() {
        //Given
        CellIndexValidationRule cellIndexValidationRule =
                new CellIndexValidationRule(TestDataGenerator.getValidBattlefieldCell());

        //When
        cellIndexValidationRule.validate();

        //Then
        //Test should pass successfully, no exceptions should be thrown
    }

    @Test(expected = BattleFieldException.class)
    public void shouldThrowExceptionIfInvalidCoordinates() {
        //Given
        CellIndexValidationRule cellIndexValidationRule =
                new CellIndexValidationRule(TestDataGenerator.getBattlefieldCellWithInvalidCoordinates());

        //When
        cellIndexValidationRule.validate();

        //Then
        //BattleFieldException exception must be thrown
    }

    @Test(expected = BattleFieldException.class)
    public void shouldThrowExceptionIfInvalidCoordinates2() {
        //Given
        CellIndexValidationRule cellIndexValidationRule =
                new CellIndexValidationRule(TestDataGenerator.getBattlefieldCellWithInvalidHorizontalCoordinate());

        //When
        cellIndexValidationRule.validate();

        //Then
        //BattleFieldException exception must be thrown
    }

    @Test(expected = BattleFieldException.class)
    public void shouldThrowExceptionIfInvalidCoordinates3() {
        //Given
        CellIndexValidationRule cellIndexValidationRule =
                new CellIndexValidationRule(TestDataGenerator.getBattlefieldCellWithInvalidVerticalCoordinate());

        //When
        cellIndexValidationRule.validate();

        //Then
        //BattleFieldException exception must be thrown.
    }
}