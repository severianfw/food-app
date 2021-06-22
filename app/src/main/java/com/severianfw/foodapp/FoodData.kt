package com.severianfw.foodapp

object FoodData {
    private val foodNames = arrayOf("Pizza",
        "Fettucine Carbonara",
        "Rendang",
        "Jjajangmyeon",
        "Ramen",
        "Sushi",
        "Hamburger",
        "Bibimbap",
        "Lokum",
        "Sashimi")

    private val foodDescs = arrayOf("Dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients, baked quickly—usually, in a commercial setting, using a wood-fired oven heated to a very high temperature—and served hot.",
        "Italian pasta dish from Rome made with egg, hard cheese, and black pepper. The cheese is usually Pecorino Romano, Parmigiano-Reggiano, or a combination of the two. Spaghetti is the most common pasta, but fettuccine, rigatoni, linguine, or bucatini are also used. Normally guanciale or pancetta are used for the meat component, but lardons of smoked bacon are a common substitute outside Italy.",
        "Rich dish of meat, that has been slow cooked and braised in a coconut milk seasoned with a herb and spice mixture, until the liquids evaporate and the meat turns dark brown and tender, becoming caramelized and infused with rich flavours.",
        "Chinese-style Korean noodle dish topped with a thick sauce made of chunjang, diced pork, and vegetables. Variants of the dish use seafood, or other meats.",
        "Japanese noodle soup, with a combination of a rich flavoured broth, one of a variety of types of noodle and a selection of meats or vegetables, often topped with a boiled egg. ",
        "popular Japanese dish made from seasoned rice with fish, egg, or vegetables. A sushi roll is shaped inside a thin sheet of seaweed. Sushi comes from a Japanese word meaning \"sour rice\", and it's the rice that's at the heart of sushi, even though most Americans think of it as raw fish.",
        "A food, typically considered a sandwich, consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, smoked or flame broiled. Hamburgers are often served with cheese, lettuce, tomato, onion, pickles, bacon, or chiles; condiments such as ketchup, mustard, mayonnaise, relish, or a \"special sauce\".",
        "Korean dish of rice with cooked vegetables, usually meat, and often a raw or fried egg In Korea, some foods trickled down from the Imperial palace and others have humbler origins.",
        "Sugary cubes from Turkey based on a gel of starch and sugar. Traditionally, lokum is flavored with rose water, lemon, bergamot orange, mastic, or mint, but the Turkish favorite remains a lokum of plain jelly combined with pistachios.",
        "Thinly sliced, raw food. It is one of the most famous dishes in the Japanese cuisine. Seafood is most commonly eaten as sashimi, but other types of meats (such as beef, horse and deer) and foods (such as yuba tofu skin and konnyaku) can also be served as sashimi.")

    private val foodNational = intArrayOf(R.drawable.italy,
        R.drawable.italy,
        R.drawable.indonesia,
        R.drawable.korea,
        R.drawable.japan,
        R.drawable.japan,
        R.drawable.usa,
        R.drawable.korea,
        R.drawable.turkey,
        R.drawable.japan)

    private val cookTime = arrayOf("15 Mns",
        "30 Mns",
        "1 Hr",
        "10 Mns",
        "15 Mns",
        "15 Mns",
        "5 Mns",
        "10 Mns",
        "10 Mns",
        "10 Mns")

    private val calories = intArrayOf(266,
        574,
        137,
        797,
        436,
        200,
        295,
        490,
        168,
        40)

    private val foodImg = intArrayOf(R.drawable.pizza,
        R.drawable.carbonara,
        R.drawable.rendang,
        R.drawable.jjajangmyeon,
        R.drawable.ramen,
        R.drawable.sushi,
        R.drawable.hamburger,
        R.drawable.bibimbap,
        R.drawable.lokum,
        R.drawable.sashimi
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices){
                val food = Food()
                food.name = foodNames[position]
                food.desc = foodDescs[position]
                food.national = foodNational[position]
                food.cookTime = cookTime[position]
                food.calories = calories[position]
                food.img =  foodImg[position]
                list.add(food)
            }
            return list
        }
}