package com.severianfw.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val bundle = intent.extras

        val tvName: TextView = findViewById(R.id.tv_name_detail)
        val tvDesc: TextView = findViewById(R.id.tv_desc_detail)
        val ivFood: ImageView = findViewById(R.id.iv_food)
        val tvCal: TextView = findViewById(R.id.tv_calories)
        val ivNational : ImageView = findViewById(R.id.iv_nationality)
        val tvCook: TextView = findViewById(R.id.tv_cook_time)

        tvName.text = bundle!!.getString("FOOD_NAME","")
        tvDesc.text = bundle.getString("FOOD_DESC","")
        ivFood.setImageResource(bundle.getInt("FOOD_IMG", 0))
        tvCal.text = bundle.getInt("FOOD_CALORIES", 0).toString() + " kcal"
        ivNational.setImageResource(bundle.getInt("FOOD_NATIONAL", 0))
        tvCook.text = bundle.getString("FOOD_COOK_TIME", "")

        val ibBack: ImageButton = findViewById(R.id.back_btn)

        ibBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.back_btn -> {
                finish();
            }
        }
    }
}