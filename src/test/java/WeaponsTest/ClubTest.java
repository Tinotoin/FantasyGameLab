package WeaponsTest;

import Weapons.Club;
import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    Club club;

    @Before
    public void before(){
        club = new Club("Smasher");
    }

    @Test
    public void testValues(){
        assertEquals("Smasher", club.getName());
        assertEquals(30, club.getDmg());
        assertEquals(50, club.getWeight());
    }

}