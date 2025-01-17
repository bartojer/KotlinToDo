import java.time.DayOfWeek
import java.time.LocalDate

class Repeating(
    name: String,
    description: String,
    var repeatDays: List<DayOfWeek>,
    var lastCompleted: LocalDate? = null
) : ToDo(
    _completed = false,
    _name = name,
    _description = description,
    _due = "N/A"
) {
    private fun shouldRepeatToday(): Boolean {
        val today = LocalDate.now().dayOfWeek
        return repeatDays.contains(today)
    }

    override fun Completed() {
        if (shouldRepeatToday()) {
            lastCompleted = LocalDate.now()
            super.Completed()
            println("Task '\$name' completed for today")
        } else {
            println("Task '\$name' does not repeat today.")
        }
    }

    fun Edit(name: String, description: String, due: String, repeatDays: List<DayOfWeek>) {
        super.Edit(name, description, due)
        this.repeatDays = repeatDays
    }
}

