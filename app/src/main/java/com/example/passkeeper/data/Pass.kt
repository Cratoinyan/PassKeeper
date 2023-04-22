package com.example.passkeeper.data

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pass")
data class Pass(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    @ColumnInfo(name = "pass_json")
    val passJson:String?,
    @ColumnInfo(name = "manifest_json")
    val manifestJson:String?,
    @ColumnInfo(name = "signature")
    val signature: ByteArray,
    @ColumnInfo(name = "icon_img")
    val iconImg:ByteArray,
    @ColumnInfo(name = "background_img")
    val backgroundImg:ByteArray,
    @ColumnInfo(name = "footer_img")
    val footerImg:ByteArray,
    @ColumnInfo(name = "strip_img")
    val stripImg:ByteArray,
    @ColumnInfo(name = "logo_img")
    val logoImg:ByteArray,
    @ColumnInfo(name = "thumbnail_img")
    val thumbnailImg:ByteArray

) {
//    //information about the pass
//    //val formatVersion:Int
//    lateinit var description:String
//    lateinit var organizationName:String
//    lateinit var passTypeIdentifier:String
//    lateinit var serialNumber:String
//    lateinit var teamIdentifier:String
//
//    //design of the pass
//    lateinit var backgroundImg:Bitmap
//    lateinit var footerImg:Bitmap
//    lateinit var iconImg:Bitmap
//    lateinit var logoImg:Bitmap
//    lateinit var stripImg:Bitmap
//    lateinit var thumbnailImg:Bitmap

}