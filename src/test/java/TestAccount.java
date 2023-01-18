import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestAccount {
    private final String name;
    private final boolean expected;

    public TestAccount(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getGenderLion() {
        return new Object[][]{
                {"Т и", false},
                {"Тимотиggg Шаламеggg", false},
                {"Тимоти Шаламе", true},
                {"ТимотиШаламе", false},
                {" Тимоти Шаламе ", false},
                {"Тимоти Шаламе ", false},
        };
    }

    @Test
    public void testCorrectAnswerInAccountClass(){
        Account account = new Account(name);
        assertEquals(account.checkNameToEmboss(), expected);
    }
}
