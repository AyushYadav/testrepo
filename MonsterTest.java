/**
 * Created by ayushyadav on 9/17/15.
 */

import java.util.*;
import org.apache.commons.lang3.ArrayUtils;

public class MonsterTest {
    public static void main(String args[]) {
        MonsterTwo.buildBattleBoard();
        char[][] tempBattleBoard = new char[10][10];
        MonsterTwo[] Monster = new MonsterTwo[4];
        Monster[0] = new MonsterTwo(1000, 20, 1, "Frank");
        Monster[1] = new MonsterTwo(500, 40, 2, "Drake");
        Monster[2] = new MonsterTwo(1000, 20, 1, "Anthony");
        Monster[3] = new MonsterTwo(1000, 20, 1, "Harry");
        MonsterTwo.redrawBoard();
        for (MonsterTwo m : Monster) {
            if (m.getAlive()) {
                int arrayIndexitem = ArrayUtils.indexOf(Monster, m);
                m.moveMonster(Monster, arrayIndexitem);
            }
        }
        MonsterTwo.redrawBoard();
    }
}
