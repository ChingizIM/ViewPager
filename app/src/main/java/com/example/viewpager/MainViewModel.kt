package com.example.viewpager


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var mCounter = 0
  //  val records = MutableLiveData<RecordDao>()
    val counter = MutableLiveData<Int>() // хранит в себе данные
    val historyClick = MutableLiveData<ArrayList<String>>()
    private val list = arrayListOf<String>()

    fun onIncrementClick() {
        mCounter++
        list.add("+")
        historyClick.value = list
        counter.value = mCounter
        println(historyClick.toString())
    }

    fun onDecrementClick() {
        mCounter--
        list.add("-")
        historyClick.value = list
        println(historyClick.value.toString())
        counter.value = mCounter
    }
}