package pt.ipg.seminarios;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class TabelaApresentacoes implements BaseColumns {
    private static final String NOME_TABELA = "apresentacoes" ;
    public static final String CAMPO_SUMARIO = "sumario";
    public static final String CAMPO_TITULO = "titulo";
    public static final String CAMPO_ORADOR = "orador";
    private SQLiteDatabase bd;

    public TabelaApresentacoes(SQLiteDatabase bd) {
        this.bd = bd;
    }

    public void cria(){
        bd.execSQL("CREATE TABLE " + NOME_TABELA + " (" +
                _ID +" INTEGER PRIMARY KEY AUTOINCREMENT," +
                CAMPO_TITULO + " TEXT NOT NULL," +
                CAMPO_ORADOR + " INTEGER NOT NULL," +
                CAMPO_SUMARIO + " TEXT," +
                "FOREIGN KEY (" + CAMPO_ORADOR + ") REFERENCES " +
                TabelaOradores.NOME_TABELA + "(" + TabelaOradores._ID + ")" +
                ")");
    }
}
