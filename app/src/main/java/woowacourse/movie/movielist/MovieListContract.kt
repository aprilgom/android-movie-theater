package woowacourse.movie.movielist

import woowacourse.movie.movielist.uimodel.ListItemUiModel

interface MovieListContract {
    interface View {
        fun showMovies(movies: List<ListItemUiModel>)

        fun showTheaters(movieId: Long)
    }

    interface Presenter {
        fun selectMovie(movieId: Long)

        fun loadMovies()
    }
}
