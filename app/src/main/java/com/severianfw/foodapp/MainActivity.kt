package com.severianfw.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvFoods: RecyclerView
    private var foodList: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFoods = findViewById(R.id.rv_food)
        rvFoods.setHasFixedSize(true)

        foodList.addAll(FoodData.listData)
        showRecyclerFood()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.ic_profile){
            startActivity(Intent(this, AboutActivity::class.java))
            return true;
        }
        return false
    }

    private fun showRecyclerFood() {
        rvFoods.layoutManager = LinearLayoutManager(this)
        val foodListAdapter = FoodListAdapter(foodList)
        rvFoods.adapter = foodListAdapter

        foodListAdapter.setOnItemClickCallback(object : FoodListAdapter.OnItemClickCallback{
            override fun onItemClicked(food: Food) {
                showFoodDetail(food)
            }
        })
    }

    private fun showFoodDetail(food: Food) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        val bundle = Bundle()

        bundle.putString("FOOD_NAME", food.name)
        bundle.putString("FOOD_DESC", food.desc)
        bundle.putInt("FOOD_NATIONAL", food.national)
        bundle.putString("FOOD_COOK_TIME", food.cookTime)
        bundle.putInt("FOOD_CALORIES", food.calories)
        bundle.putInt("FOOD_IMG", food.img)
        intent.putExtras(bundle)

        startActivity(intent)
    }
}