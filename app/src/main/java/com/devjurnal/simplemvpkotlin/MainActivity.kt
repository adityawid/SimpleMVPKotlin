package com.devjurnal.simplemvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    // TODO (3) Deklarasi presenter
    lateinit var presenter : MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO (4) BUAT FUNGSI
        initPresenter()
        initView()

    }

    private fun initView() {
        btnSubmit.setOnClickListener {
            presenter.loginView(edtInputan.text.toString())
        }


    }

    private fun initPresenter() {
        // init presenter
        presenter = MainPresenter(this)
    }

    override fun Success() {
        Toast.makeText(applicationContext, "Success",Toast.LENGTH_SHORT).show()
    }

    override fun Error() {
        Toast.makeText(applicationContext, "Input Tidak Boleh kosong",Toast.LENGTH_SHORT).show()
    }
}
