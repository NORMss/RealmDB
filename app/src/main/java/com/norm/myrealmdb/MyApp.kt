package com.norm.myrealmdb

import android.app.Application
import com.norm.myrealmdb.models.Address
import com.norm.myrealmdb.models.Course
import com.norm.myrealmdb.models.Student
import com.norm.myrealmdb.models.Teacher
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class MyApp : Application() {
    companion object {
        lateinit var realm: Realm
    }

    override fun onCreate() {
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class,
                )
            )
        )
    }
}