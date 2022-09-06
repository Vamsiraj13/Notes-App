package com.vamsi.roomlayer

object CharObject {
    var list = mutableListOf<CharInfo>()
    fun setData(name: String, height: Int, anime : String){
        list.add(CharInfo(name, height, anime))
    }
    fun getData() : List<CharInfo>{
        return list
    }
}