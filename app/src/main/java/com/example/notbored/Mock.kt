package com.example.notbored

data class ActivityModel(val id: Int, val category: String, val description: String, val participants: Int, val price: String)

object ActivityList {
    fun getActivityList(): List<ActivityModel> {
        return listOf(
            ActivityModel(
                id = 0,
                category = "Education",
                description = "Lorem ipsum dolor sit amet.",
                participants = 1,
                price = "Free"
            ),
            ActivityModel(
                id = 1,
                category = "Recreational",
                description = "Lorem ipsum dolor sit amet.",
                participants = 1,
                price = "Free"
            ),
            ActivityModel(
                id = 2,
                category = "Social",
                description = "Lorem ipsum dolor sit amet.",
                participants = 1,
                price = "Free"
            ),
            ActivityModel(
                id = 3,
                category = "Diy",
                description = "Lorem ipsum dolor sit amet.",
                participants = 1,
                price = "Free"
            ),
            ActivityModel(
                id = 4,
                category = "Charity",
                description = "Lorem ipsum dolor sit amet.",
                participants = 1,
                price = "Free"
            ),
            ActivityModel(
                id = 5,
                category = "Cooking",
                description = "Lorem ipsum dolor sit amet.",
                participants = 1,
                price = "Free"
            ),
            ActivityModel(
                id = 6,
                category = "Relaxation",
                description = "Lorem ipsum dolor sit amet.",
                participants = 1,
                price = "Free"
            ),
            ActivityModel(
                id = 7,
                category = "Music",
                description = "Lorem ipsum dolor sit amet.",
                participants = 1,
                price = "Free"
            ),
            ActivityModel(
                id = 8,
                category = "Busywork",
                description = "Lorem ipsum dolor sit amet.",
                participants = 1,
                price = "Free"
            ),
            ActivityModel(
                id = 9,
                category = "Education",
                description = "Consectetur adipiscing elit inceptos ridiculus iaculis.",
                participants = 2,
                price = "Low"
            ),
            ActivityModel(
                id = 10,
                category = "Education",
                description = "Nullam ligula elementum duis tellus.",
                participants = 3,
                price = "Medium"
            ),
            ActivityModel(
                id = 11,
                category = "Education",
                description = "Maecenas nec fermentum sed dictum.",
                participants = 1,
                price = "High"
            ),
            ActivityModel(
                id = 12,
                category = "Recreational",
                description = "Consectetur adipiscing elit inceptos ridiculus iaculis.",
                participants = 2,
                price = "Low"
            ),
            ActivityModel(
                id = 13,
                category = "Recreational",
                description = "Nullam ligula elementum duis tellus.",
                participants = 3,
                price = "Medium"
            ),
            ActivityModel(
                id = 14,
                category = "Recreational",
                description = "Maecenas nec fermentum sed dictum.",
                participants = 1,
                price = "High"
            ),
            ActivityModel(
                id = 15,
                category = "Social",
                description = "Consectetur adipiscing elit inceptos ridiculus iaculis.",
                participants = 2,
                price = "Low"
            ),
            ActivityModel(
                id = 16,
                category = "Social",
                description = "Nullam ligula elementum duis tellus.",
                participants = 3,
                price = "Medium"
            ),
            ActivityModel(
                id = 17,
                category = "Social",
                description = "Maecenas nec fermentum sed dictum.",
                participants = 1,
                price = "High"
            ),
            ActivityModel(
                id = 18,
                category = "Diy",
                description = "Consectetur adipiscing elit inceptos ridiculus iaculis.",
                participants = 2,
                price = "Low"
            ),
            ActivityModel(
                id = 19,
                category = "Diy",
                description = "Nullam ligula elementum duis tellus.",
                participants = 3,
                price = "Medium"
            ),
            ActivityModel(
                id = 20,
                category = "Diy",
                description = "Maecenas nec fermentum sed dictum.",
                participants = 1,
                price = "High"
            ),
            ActivityModel(
                id = 21,
                category = "Charity",
                description = "Consectetur adipiscing elit inceptos ridiculus iaculis.",
                participants = 2,
                price = "Low"
            ),
            ActivityModel(
                id = 22,
                category = "Charity",
                description = "Nullam ligula elementum duis tellus.",
                participants = 3,
                price = "Medium"
            ),
            ActivityModel(
                id = 23,
                category = "Charity",
                description = "Maecenas nec fermentum sed dictum.",
                participants = 1,
                price = "High"
            ),
            ActivityModel(
                id = 24,
                category = "Cooking",
                description = "Consectetur adipiscing elit inceptos ridiculus iaculis.",
                participants = 2,
                price = "Low"
            ),
            ActivityModel(
                id = 25,
                category = "Cooking",
                description = "Nullam ligula elementum duis tellus.",
                participants = 3,
                price = "Medium"
            ),
            ActivityModel(
                id = 26,
                category = "Cooking",
                description = "Maecenas nec fermentum sed dictum.",
                participants = 1,
                price = "High"
            ),
            ActivityModel(
                id = 27,
                category = "Relaxation",
                description = "Consectetur adipiscing elit inceptos ridiculus iaculis.",
                participants = 2,
                price = "Low"
            ),
            ActivityModel(
                id = 28,
                category = "Relaxation",
                description = "Nullam ligula elementum duis tellus.",
                participants = 3,
                price = "Medium"
            ),
            ActivityModel(
                id = 29,
                category = "Relaxation",
                description = "Maecenas nec fermentum sed dictum.",
                participants = 1,
                price = "High"
            ),
            ActivityModel(
                id = 30,
                category = "Music",
                description = "Consectetur adipiscing elit inceptos ridiculus iaculis.",
                participants = 2,
                price = "Low"
            ),
            ActivityModel(
                id = 31,
                category = "Music",
                description = "Nullam ligula elementum duis tellus.",
                participants = 3,
                price = "Medium"
            ),
            ActivityModel(
                id = 32,
                category = "Music",
                description = "Maecenas nec fermentum sed dictum.",
                participants = 1,
                price = "High"
            ),
            ActivityModel(
                id = 33,
                category = "Busywork",
                description = "Consectetur adipiscing elit inceptos ridiculus iaculis.",
                participants = 2,
                price = "Low"
            ),
            ActivityModel(
                id = 34,
                category = "Busywork",
                description = "Nullam ligula elementum duis tellus.",
                participants = 3,
                price = "Medium"
            ),
            ActivityModel(
                id = 35,
                category = "Busywork",
                description = "Maecenas nec fermentum sed dictum.",
                participants = 1,
                price = "High"
            ),
        )
    }
}