abstract class Employee(val name: String, val salary: Double): Evaluable{
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

class Developer(name: String, salary: Double): Employee(name, salary){

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

class Manager(name: String, salary: Double): Employee(name, salary){

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

class Designer(name: String, salary: Double): Employee(name, salary){

    override fun work(){
        println("Creating and optimizing visual design")
    }

    override fun calculateAnnualBonus(){
        val bonus = salary * 0.15
        println("Annual Bonus: $bonus")
    }

}

interface Evaluable{
    fun evaluatePerformance(){
        println("Evaluate Employee")
    }
}