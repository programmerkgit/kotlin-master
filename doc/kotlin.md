# compile
kotlinc hello.kt -include-runtime -d hello.jar
`-d` option indicates the outputpath for generated class files.  
`-include-runtime` makes resulting .jar files self-contained  and runnable by including the Kotlin runtime library in it.  
# kotlinc -help
display all available options

# Kotlin subsitute package-level function for static member or member functions.  

# companion object is like static Method
1. only one companion per class
2. local class cannot have companion object
```kotlin
class EventManager {
    companion object FirebaseManager {
    }   
}
class EventManager2 {
   companion object {
   }
}
val firebaseManager = EventManager.FirebaseManager
val anonymousCompanion = EventManager2.Companion;
```

# singleton
a class that only has got one instance.  
Singleton is alternative for object literal  
```kotlin
object CarFactory {
    var cars = mutableListOf<Car>()
    fun makeCar(horsepowers: Int): Car {
        val car = Car(horsepowers)
        cars.add(car)
        return car
    } 
}
val car = CarFactory.makeCar(150)
println(CarFactory.cars.size)
```

# interface can't keep state
To use Context
```kotlin

interface Toaster {
    val context: Context
    fun toast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
class MyActivity: AppCOmpatActivity(), Toaster {
    override val context = this;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toast("onCreate")
    }
}
```
# interface delegation
Easy way to implement by passing delegation class.  
  
```kotlin
class A {
    fun functionA() {
    }   
}
class B {
    fun functionB(){
    }
}

class C(a: A, b: B): A by a, B by b {
    fun C() {
        functionA()
        functionB()
    }
}
```


# Sealed Class 
Sealed class is restricted classes like Enum. 
```kotlin
sealed class Seal
class A: Seal
class B: Seal

```