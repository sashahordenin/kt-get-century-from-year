package mate.academy

const val ONE_YEAR = 1

const val HUNDRED_YEARS = 100

fun getCentury(year: Int): Int {
	return (year - ONE_YEAR) / HUNDRED_YEARS + ONE_YEAR
}
