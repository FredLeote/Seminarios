package pt.ipg.seminarios;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getContext;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class TestBaseDadosSeminarios {

    public void setup() {
        getContext().deleteDatabase(BdSeminariosOpenHelper.NOME_BASE_DADOS);
    }
    @Test
    public void criaBaseDados() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        BdSeminariosOpenHelper openHelper = new BdSeminariosOpenHelper(appContext);

        SQLiteDatabase bd = openHelper.getReadableDatabase();

        assertTrue(bd.isOpen());

    }
}
