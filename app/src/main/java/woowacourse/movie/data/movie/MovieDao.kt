package woowacourse.movie.data.movie

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MovieDao {
    @Insert
    fun insert(movieDto: MovieDto)

    @Query("select * from movies where id == :id")
    fun getById(id: Long): MovieDto?
}