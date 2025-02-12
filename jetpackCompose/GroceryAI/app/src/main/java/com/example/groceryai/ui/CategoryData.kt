package com.example.groceryai

import com.example.groceryai.model.Category
import com.yourpackage.model.Item

val categories = listOf(
    Category(
        id = 1,
        imageUrl = "https://www.healthyeating.org/images/default-source/home-0.0/nutrition-topics-2.0/general-nutrition-wellness/2-2-2-3foodgroups_fruits_detailfeature_thumb.jpg?sfvrsn=7abe71fe_4",
        name = "Fruits",
        items = listOf(
            Item(id = 1, name = "Apple", price = 1.99, category = "Fruits", imageUrl = "https://cdn.britannica.com/22/187222-050-07B17FB6/apples-on-a-tree-branch.jpg"),
            Item(id = 2, name = "Banana", price = 2.49, category = "Fruits", imageUrl = "https://www.womansworld.com/wp-content/uploads/2024/07/Banana-Every-Day.jpg?w=1280&h=730&crop=1&quality=86&strip=all"),
            Item(id = 3, name = "Orange", price = 1.00, category = "Fruits", imageUrl = "https://www.health.com/thmb/vyI49td0j52IBWf_vHVE_DGVZcU=/3950x0/filters:no_upscale():max_bytes(150000):strip_icc()/Health-Stocksy_txp5e95690asrw300_Medium_934585-e870449543284eed8aa4be52fc09a4ed.jpg"),
            Item(id = 4, name = "Strawberry", price = 2.50, category = "Fruits", imageUrl = "https://foodal.com/wp-content/uploads/2015/03/Make-Strawberry-Season-Last-All-Year.jpg"),
            Item(id = 5, name = "Grapes", price = 3.00, category = "Fruits", imageUrl = "https://www.marthastewart.com/thmb/GnxbwIUvZxp5fj5nkTCVuWKja-M=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/ms-grapes-grapes-glossary-63ce740368614ea6a4c47a35720ad12b.jpg")
        )
    ),
    Category(
        id = 2,
        imageUrl = "https://domf5oio6qrcr.cloudfront.net/medialibrary/11499/3b360279-8b43-40f3-9b11-604749128187.jpg",
        name = "Vegetables",
        items = listOf(
            Item(id = 1, name = "Carrot", price = 0.99, category = "Vegetables", imageUrl = "https://scitechdaily.com/images/Sliced-Carrots.jpg"),
            Item(id = 2, name = "Potato", price = 1.29, category = "Vegetables", imageUrl = "https://upload.wikimedia.org/wikipedia/commons/a/ab/Patates.jpg"),
            Item(id = 3, name = "Lettuce", price = 1.20, category = "Vegetables", imageUrl = "https://i0.wp.com/post.healthline.com/wp-content/uploads/2020/03/romaine-lettuce-1296x728-body.jpg?w=1155&h=1528"),
            Item(id = 4, name = "Cucumber", price = 1.50, category = "Vegetables", imageUrl = "https://www.organicfacts.net/wp-content/uploads/cucumber.jpg"),
            Item(id = 5, name = "Tomato", price = 1.00, category = "Vegetables", imageUrl = "https://th-thumbnailer.cdn-si-edu.com/M-d51DhIe02i-Lb_RCtzBF7XEfw=/fit-in/1200x0/https://tf-cmsv2-smithsonianmag-media.s3.amazonaws.com/filer/44/de/44de0f61-47cb-4289-aaf0-73e71d39fefb/2962762666_1237ff6eb4_o.jpg")
        )
    ),
    Category(
        id = 3,
        imageUrl = "https://media.istockphoto.com/id/1149135424/photo/group-of-sweet-and-salty-snacks-perfect-for-binge-watching.jpg?s=612x612&w=0&k=20&c=YAVqRyUJgj_nXpltYUPpaW_PYtd4v2TC5Mo0DtVFuoo=",
        name = "Snacks",
        items = listOf(
            Item(id = 1, name = "Chips", price = 3.49, category = "Snacks", imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/Potato-Chips.jpg/1200px-Potato-Chips.jpg"),
            Item(id = 2, name = "Cookies", price = 2.99, category = "Snacks", imageUrl = "https://www.southernliving.com/thmb/1nXApw4eCu0_IjJInCt3sDrVhSk=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Monster_Cookies_010-2996b6446e834ad1b093ef08b6828160.jpg"),
            Item(id = 3, name = "Chocolate Bar", price = 2.00, category = "Snacks", imageUrl = "https://levooil.com/cdn/shop/articles/20220523195942-homemade-chocolate-bars.jpg?v=1705161948"),
            Item(id = 4, name = "Popcorn", price = 1.50, category = "Snacks", imageUrl = "https://bittmanproject.com/wp-content/uploads/GettyImages-1060532718.jpg")
        )
    ),
    Category(
        id = 4,
        imageUrl = "https://whisk.com/wp-content/uploads/2023/02/shutterstock_1679020255.jpg",
        name = "Dairy Products",
        items = listOf(
            Item(id = 1, name = "Milk", price = 2.50, category = "Dairy Products", imageUrl = "https://www.allrecipes.com/thmb/TgXszUn8XHUTe19kOwlyGQ4ZjyM=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/GettyImages-87984584-2-2000-b40af34c16fd4bed815f1e279592b172.jpg"),
            Item(id = 2, name = "Cheese", price = 3.50, category = "Dairy Products", imageUrl = "https://www.saga.co.uk/helix-contentlibrary/saga/magazine/articles/2024/11november/cheese-hero.jpg"),
            Item(id = 3, name = "Butter", price = 1.80, category = "Dairy Products", imageUrl = "https://www.datocms-assets.com/20941/1638462302-butterhero.png?auto=compress&fm=jpg&w=850"),
            Item(id = 4, name = "Yogurt", price = 1.20, category = "Dairy Products", imageUrl = "https://images.immediate.co.uk/production/volatile/sites/30/2020/02/Yogurt-40da58e.jpg?quality=90&resize=556,505"),
            Item(id = 5, name = "Cream", price = 1.50, category = "Dairy Products", imageUrl = "https://bellyfull.net/wp-content/uploads/2021/11/Whipped-Cream-blog-2.jpg")
        )
    ),
    Category(
        id = 5,
        imageUrl = "https://img.freepik.com/premium-photo/row-glasses-filled-with-different-types-drinks-suitable-beverage-concept_153912-30136.jpg",
        name = "Beverages",
        items = listOf(
            Item(id = 1, name = "Water", price = 1.00, category = "Beverages", imageUrl = "https://www.thespruceeats.com/thmb/4Uxr_CKC7aR-UhEicIvVqLaiO0k=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/GettyImages-488636063-5ab2dbd8a8ff48049cfd36e8ad841ae5.jpg"),
            Item(id = 2, name = "Coca Cola", price = 1.99, category = "Beverages", imageUrl = "https://b2b.sportsnutrition.no/wp-content/uploads/2018/01/COCA-COLA-COLLECTIVE.png"),
            Item(id = 3, name = "Coffee", price = 1.00, category = "Beverages", imageUrl = "https://cdn.sanity.io/images/4aans0in/production/467ed020052c59c85c402f42476f9a9cf9259f0c-2000x1312.jpg?rect=0,94,2000,1125&w=3840&h=2160&fm=webp&q=100&fit=max&auto=format"),
            Item(id = 4, name = "Fanta", price = 1.99, category = "Beverages", imageUrl = "https://d2z00kf51ll94q.cloudfront.net//archive/2024/media/YO24_O111M_0.png")
        )
    )
)
