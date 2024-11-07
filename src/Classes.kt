abstract class Employee: Evaluable{
    abstract val name: String
    abstract val salary: Double

    abstract fun work()
    abstract fun calculateAnnualBonus()

    fun details(){
        println("Name: $name")
        println("Salary: $salary")
    }
    override fun evaluatePerformance(){
        println("Evaluate Employee")
    }
}

class Developer(): Employee(){
    override val name = "Developer name"
    override val salary = 1000.00

    override fun work(){
        println("Write and revision code")
    }

    override fun calculateAnnualBonus(){
        val bonus = salary * 0.1
        println("Annual Bonus: $bonus")
    }

    override fun evaluatePerformance(){
        println("Evaluate Developer")
    }
}

class Manager(): Employee(){
    override val name = "Manager name"
    override val salary = 1200.00

    override fun work(){
        println("Supervising the team and planning projects")
    }

    override fun calculateAnnualBonus(){
        val bonus = salary * 0.2
        println("Annual Bonus: $bonus")
    }

    override fun evaluatePerformance(){
        println("Evaluate Manager")
    }
}

class Designer(): Employee(){
    override val name = "Designer name"
    override val salary = 950.00

    override fun work(){
        println("Creating and optimizing visual design")
    }

    override fun calculateAnnualBonus(){
        val bonus = salary * 0.15
        println("Annual Bonus: $bonus")
    }

    override fun evaluatePerformance(){
        println("Evaluate Designer")
    }
}

interface Evaluable{
    fun evaluatePerformance(){
        println("Evaluate Employee")
    }
}