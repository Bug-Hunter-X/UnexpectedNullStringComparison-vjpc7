```groovy
def myMethod(String param) {
  if (param == null || param.isEmpty()) {
    println "Parameter is null or empty"
    return
  }
  // ... rest of the method
}

myMethod(null)
myMethod("")
myMethod("hello")
```