package com.example.pc1.wodcreator;

import android.net.Uri;
import android.provider.BaseColumns;
/**
 * Created by PC1 on 12/12/2017.
 */

public class StatusContract {
    //Base de Datos
    public static final String DB_NAME= "WodCreator.db";
    public static final int DB_VERSION= 1;
    public static final String TABLE1="Ejercicio";
    public static final String TABLE2="Wod";
    public static final String TABLE3="EjerWod";
    public static final String DEFAULT_SORT = Column.CREATED_AT + " DESC";

    public class ColumnEjercicio{
        public static final String ID = BaseColumns._ID;
        public static final String NOMBRE = "nombre";
        public static final String DESCRIPCION = "descripcion";
    }

    public class ColumnWod{
        public static final String ID = BaseColumns._ID;
        public static final String NOMBRE = "nombre";
        public static final String TIPO = "tipo";
        public static final String INTENSIDAD = "intensidad";
        public static final String RONDAS = "rondas";
    }

    public class ColumnEjerWod{
        public static final String ID = BaseColumns._ID;
        public static final String IDWod = "Wod";
        public static final String IDEjer = "ejercicio";
        public static final String REPETICION = "repeticion";
    }
}
