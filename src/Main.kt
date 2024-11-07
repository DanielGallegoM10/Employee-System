fun main() {
    val employees = listOf(Developer(), Manager(), Designer())
    for (item in employees) {
        item.work()
        item.calculateAnnualBonus()
        item.details()
        if (item !is Designer) {
            item.evaluatePerformance()
        }
        println()
    }
}