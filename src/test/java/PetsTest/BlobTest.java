package PetsTest;

import Pets.Blob;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlobTest {

    Blob blob;
    Blob blob2;

    @Before
    public void before(){
        blob = new Blob("King Blobulon");
        blob2 = new Blob("Dave");
    }

    @Test
    public void testValues(){
        assertEquals("King Blobulon", blob.getName());
        assertEquals(5, blob.getDmg());
        assertEquals(20, blob.getHp());
    }

    @Test
    public void canTakeDamage(){
        blob.attack(blob2);
        assertEquals(15, blob2.getHp());
    }

}
