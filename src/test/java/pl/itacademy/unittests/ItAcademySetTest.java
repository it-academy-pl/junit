
package pl.itacademy.unittests;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ItAcademySetTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private ItAcademySet itAcademySet;

    @Before
    public void setUp() {
        itAcademySet = new ItAcademySet();
    }

    @Test
    public void isEmpty_newSet_returnsTrue() {
        assertThat(itAcademySet.isEmpty(), equalTo(true));
    }

    @Test
    public void isEmpty_whenAddingElement_isEmptyMethodReturnsFalse() {
        itAcademySet.add(new Object());

        assertThat(itAcademySet.isEmpty(), equalTo(false));
    }

    @Test
    public void contains_whenAddingElement_setShouldContainThisElement() {
        Object o = new Object();
        itAcademySet.add(o);

        assertThat(itAcademySet.contains(o), equalTo(true));
    }

    @Test
    public void contains_emptySet_returnsFalse() {
        assertThat(itAcademySet.contains(new Object()), equalTo(false));
    }

    @Test
    public void contains_addAnotherObject_returnsFalse() {
        Object first = new Object();
        itAcademySet.add(first);

        Object second = new Object();
        assertThat(itAcademySet.contains(second), equalTo(false));
    }

    @Test
    public void add_addingNullElement_throwsNullPointerExceptionWithProperMessage() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Adding null objects");

        itAcademySet.add(null);
    }



}
