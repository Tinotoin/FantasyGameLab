package RoomTest;

import Enemies.Cerberus;
import Enemies.Enemy;
import Enemies.Ghost;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Ghost ghost;
    Cerberus cerberus;

    @Before
    public void before(){
        room = new Room("The dungeon");
        ghost = new Ghost("Lawrence");
    cerberus = new Cerberus("Lassie");
    }

    @Test
    public void testValues(){
        room.addEnemy(ghost);
        assertEquals("The dungeon", room.getName());
        assertEquals(1, room.getEnemies().size());
        assertEquals(true, room.getTreasure() > 0);
    }

    @Test
    public void canAddMultipleEnemies(){
        room.addEnemy(ghost);
        room.addEnemy(ghost);
        room.addEnemy(ghost);
        room.addEnemy(cerberus);
        assertEquals(4, room.getEnemies().size());
    }

}
