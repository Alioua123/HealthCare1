package com.example.hp.healthcare.db;
import android.provider.BaseColumns;



public class Task {

    public static final String DB_NAME = "notes";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";
        public static final String COL_TASK_TITLE = "title";
    }

}

