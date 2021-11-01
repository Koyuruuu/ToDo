package com.example.todo.db;

import android.provider.BaseColumns;

public class TaskContract {  //データベース名やテーブル等を設定するクラス
    public static final String DB_NAME = "com.aziflaj.todolist.db";
    public static final int DB_VERSION = 1;   //データベースのバージョン

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";   //テーブル名
        public static final String COL_TASK_TITLE = "title";  //カラム
    }
}
