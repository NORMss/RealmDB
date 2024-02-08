package com.norm.myrealmdb.models

import io.realm.kotlin.types.EmbeddedRealmObject


class Address : EmbeddedRealmObject {
    var fullName: String = ""
    var street: String = ""
    var houseNumber: String = ""
    var zip: Int = 0
    var city: String = ""
    var teacher: Teacher? = null
}