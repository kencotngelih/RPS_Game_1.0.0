package com.robby.trial3chp7.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Teman(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    @ColumnInfo(name = "idplayer")
    var idplayer: String,
    @ColumnInfo(name = "nama")
    var nama: String,
    @ColumnInfo(name = "email")
    var email: String

)
