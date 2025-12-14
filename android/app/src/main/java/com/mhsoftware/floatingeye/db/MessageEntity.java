package com.mhsoftware.floatingeye.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "messages")
public class MessageEntity {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String app;
    public String title;
    public String text;
    public long timestamp;
}
