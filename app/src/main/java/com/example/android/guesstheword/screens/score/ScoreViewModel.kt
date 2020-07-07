package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore:Int ):  ViewModel() {



    private  var _hasBeenPressed = MutableLiveData<Boolean>()

    val hasBeenPressed: LiveData<Boolean>
        get() = _hasBeenPressed



    init {
        _hasBeenPressed.value = false
        Log.i("kik", "scoreViewModelCalled$finalScore")
    }




    fun pressed(){
        _hasBeenPressed.value =true
    }




}