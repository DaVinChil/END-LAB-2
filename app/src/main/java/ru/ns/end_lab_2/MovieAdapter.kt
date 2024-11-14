package ru.ns.end_lab_2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MovieAdapter(private val context: Context) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    private val imageUrls: List<String> = listOf(
        "https://avatars.mds.yandex.net/get-kinopoisk-image/1946459/bf93b465-1189-4155-9dd1-cb9fb5cb1bb5/300x450",
        "https://avatars.mds.yandex.net/get-kinopoisk-image/1600647/430042eb-ee69-4818-aed0-a312400a26bf/300x450",
        "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/0b76b2a2-d1c7-4f04-a284-80ff7bb709a4/300x450",
        "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/4057c4b8-8208-4a04-b169-26b0661453e3/300x450",
        "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/617303b7-cfa7-4273-bd1d-63974bf68927/300x450",
        "https://avatars.mds.yandex.net/get-kinopoisk-image/4716873/85b585ea-410f-4d1c-aaa5-8d242756c2a4/300x450",
        "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/3560b757-9b95-45ec-af8c-623972370f9d/300x450",
        "https://avatars.mds.yandex.net/get-kinopoisk-image/10812607/ee04f3d4-6e87-4b34-93f8-95b4f33954a5/300x450",
        "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/e410c71f-baa1-4fe5-bb29-aedb4662f49b/300x450",
    )
    private val titles: List<String> = listOf(
        "1+1",
        "Интерстеллар",
        "Побег из Шоушенка",
        "Зеленая миля",
        "Остров проклятых",
        "Бойцовский клуб",
        "Форрест Гамп",
        "Унесённые призраками",
        "Властелин колец: Возвращение короля"
    )

    inner class ViewHolder(itemView: LinearLayout) : RecyclerView.ViewHolder(itemView) {
        val layout: LinearLayout = itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val movieView = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_view, parent, false) as LinearLayout
        return ViewHolder(movieView)
    }

    override fun getItemCount(): Int {
        return imageUrls.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = holder.layout

        val image = movie.findViewById<ImageView>(R.id.movie_picture)
        Glide.with(context).load(imageUrls[position]).into(image)

        val text = movie.findViewById<TextView>(R.id.movie_name)
        text.text = titles[position]
    }
}