package woowacourse.movie.model

import java.time.LocalDateTime
import kotlin.time.Duration
import kotlin.time.Duration.Companion.minutes

data class Reservation(
    val id: Long,
    val movie: Movie,
    val seats: Seats,
    val screenDateTime: LocalDateTime,
    val headCount: HeadCount,
    val cancelDeadLine: Duration = 15.minutes,
    val theaterId: Long,
) {
    constructor(
        id: Long,
        screening: Screening,
        screenDateTime: LocalDateTime,
        seats: Seats,
        headCount: HeadCount,
        cancelDeadLine: Duration = 15.minutes,
        theaterId: Long,
    ) : this(
        id,
        screening.movie,
        seats,
        screenDateTime,
        headCount,
        cancelDeadLine,
        theaterId,
    )

    val totalPrice: Price get() = seats.totalPrice

    companion object {
        val STUB =
            Reservation(
                id = 0,
                movie = Movie.STUB_A,
                seats = Seats(listOf(Seat(Tier.A, 1, 1))),
                screenDateTime = LocalDateTime.of(2024, 5, 6, 1, 11, 11),
                headCount = HeadCount(1),
                theaterId = 0,
            )
    }
}
