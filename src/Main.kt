fun main() {
    val employees = listOf(Developer(name = "Lucas", salary = 50000.0), Manager(name = "Lola", salary = 75000.0), Designer(name = "Pepe", salary = 45000.0))
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