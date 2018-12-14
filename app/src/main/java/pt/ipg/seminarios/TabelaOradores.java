package pt.ipg.seminarios;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class TabelaOradores implements BaseColumns {

    private SQLiteDatabase bd;

    public TabelaOradores(SQLiteDatabase bd) {
        this.bd = bd;
    }

    public void cria() {
        bd.execSQL("CREATE TABLE oradores (" +
                "_id INTENGER PRIMARY KEY AUTOINCREMENT," +
                "titulo TEXT," +
                "nome TEXT NOT NULL" +
                ")");
    }
}
