package com.battleship.helper;

import com.battleship.dtos.BattleFiledCell;
import com.battleship.dtos.CellState;

public final class TestDataGenerator {
    private final static int VALID_MIN_COORDINATE = 0;
    private final static int VALID_MAX_COORDINATE = 9;
    private final static int INVALID_MIN_COORDINATE = -1;
    private final static int INVALID_MAX_COORDINATE = 10;
    private TestDataGenerator() {
    }

    public static BattleFiledCell getValidBattlefieldCell() {
        return BattleFiledCell.builder()
                .cellState(CellState.EMPTY)
                .horizontalCoordinate(VALID_MAX_COORDINATE)
                .verticalCoordinate(VALID_MIN_COORDINATE)
                .build();
    }

    public static BattleFiledCell getBattlefieldCellWithInvalidHorizontalCoordinate() {
        return BattleFiledCell.builder()
                .cellState(CellState.EMPTY)
                .horizontalCoordinate(INVALID_MAX_COORDINATE)
                .verticalCoordinate(VALID_MIN_COORDINATE)
                .build();
    }

    public static BattleFiledCell getBattlefieldCellWithInvalidVerticalCoordinate() {
        return BattleFiledCell.builder()
                .cellState(CellState.EMPTY)
                .horizontalCoordinate(VALID_MIN_COORDINATE)
                .verticalCoordinate(INVALID_MIN_COORDINATE)
                .build();
    }

    public static BattleFiledCell getBattlefieldCellWithInvalidCoordinates() {
        return BattleFiledCell.builder()
                .cellState(CellState.EMPTY)
                .horizontalCoordinate(INVALID_MAX_COORDINATE)
                .verticalCoordinate(INVALID_MIN_COORDINATE)
                .build();
    }
}
