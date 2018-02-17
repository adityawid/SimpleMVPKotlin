package com.devjurnal.simplemvpkotlin

/**
 * Created by DevJurnal on 2/17/18.
 */
class MainPresenter {

    var mainView : MainView? = null

    //TODO (1) Add Constructor
    constructor(mainView: MainView?) {
        this.mainView = mainView
    }

    // TODO (2) fungsi yang dipanggil di mainAct
    fun loginView(input : String){
        // kondisi
        if (input.isEmpty()){
            mainView?.Error()       // ? null/not null , !! trycatch null exeption
        }else{
            mainView?.Success()
        }
    }
}