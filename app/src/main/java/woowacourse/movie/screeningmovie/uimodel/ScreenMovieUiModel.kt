package woowacourse.movie.screeningmovie.uimodel

import androidx.annotation.DrawableRes
import woowacourse.movie.R

data class ScreenMovieUiModel(
    val id: Long,
    val title: String,
    @DrawableRes val imageRes: Int = R.drawable.img_movie_poster,
    val screenDate: String,
    val runningTime: String,
) : ListItemUiModel