package pt.ipg.seminarios;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class TabelaOradores implements BaseColumns {

    public static final String NOME_TABELA = "oradores";
    public static final String CAMPO_TITULO = "titulo";
    public static final String CAMPO_NOME = "nome";
    private SQLiteDatabase bd;

    public TabelaOradores(SQLiteDatabase bd) {
        this.bd = bd;
    }

    public void cria() {
        bd.execSQL("CREATE TABLE " + NOME_TABELA + " (" +
                _ID +" INTENGER PRIMARY KEY AUTOINCREMENT," +
                CAMPO_TITULO + " TEXT," +
                CAMPO_NOME + " TEXT NOT NULL" +
                ")");
    }
}
