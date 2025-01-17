open class ToDo(
    var _completed: Boolean,
    var _name: String,
    var _description: String,
    var _due: String,
) {
    open fun Completed() {
        _completed = true
    }
    open fun Display() {
        println("Name: $_name")
        println("Description: $_description")
        println("Due: $_due")
        if (_completed) {
            println("Completed")
        }
    }
    open fun Edit(name: String = _name, description: String = _description, due: String = _due) {
        _name = name
        _description = description
        _due = due
    }
}
