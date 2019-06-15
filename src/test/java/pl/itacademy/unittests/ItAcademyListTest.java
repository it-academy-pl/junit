package pl.itacademy.unittests;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class ItAcademyListTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private ItAcademyList list;

    @Before
    public void setUp() {
        list = new ItAcademyList();
    }

    @Test
    public void isEmpty_whenNewList_returnsTrue() {
        assertThat(list.isEmpty(), equalTo(true));
    }

    @Test
    public void isEmpty_whenAddElement_returnsFalse() {
        list.add("first");

        assertThat(list.isEmpty(), equalTo(false));
    }

    @Test
    public void isEmpty_whenClearList_returnsTrue() {
        list.add("item");
        list.clear();

        assertThat(list.isEmpty(), equalTo(true));
    }

    @Test
    public void contains_whenItemPresent_returnsTrue() {
        String item = "item";
        list.add(item);

        assertThat(list.contains(item), equalTo(true));
    }

    @Test
    public void contains_whenItemMissing_returnsFalse() {
        list.add("item");

        assertThat(list.contains("another item"), equalTo(false));
    }

    @Test
    public void add_addNullElement_throwsNullPointerExceptionWithProperDescription() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Item can not be NULL");

        list.add(null);
    }

}
