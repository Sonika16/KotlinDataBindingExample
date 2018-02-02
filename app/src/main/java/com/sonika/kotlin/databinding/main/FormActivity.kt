package com.sonika.kotlin.databinding.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.sonika.kotlin.databinding.BR
import com.sonika.kotlin.databinding.R
import com.sonika.kotlin.databinding.databinding.ActivityFormBinding

class FormActivity : AppCompatActivity() {

    private val formDataModel: FormModel = FormModel("Sonika",
            "connect.ssonika@gmail.com","950, Harrington avenue NE",
            1234567890)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityFormBinding = DataBindingUtil.setContentView(this, R.layout.activity_form)

        binding.form = formDataModel
//        binding.setVariable(BR.form, formDataModel)
//        binding.setVariable(BR.activity, this)
        binding.executePendingBindings()

    }

    fun backButtonClick(view: View){
       finish()
    }

    fun nextButtonClick(view: View){
        Toast.makeText(this, "This button is under implementation", Toast.LENGTH_SHORT).show()
    }

}
