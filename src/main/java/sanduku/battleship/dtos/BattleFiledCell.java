package sanduku.battleship.dtos;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class BattleFiledCell {
    private CellState cellState;
    private int horizontalCoordinate;
    private int verticalCoordinate;
}
